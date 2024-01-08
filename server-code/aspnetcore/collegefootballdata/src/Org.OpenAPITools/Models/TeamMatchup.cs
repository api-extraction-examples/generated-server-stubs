/*
 * College Football Data API
 *
 * This is an API for accessing all sorts of college football data.  Please note that API keys should be supplied with \"Bearer \" prepended (e.g. \"Bearer your_key\"). API keys can be acquired from the CollegeFootballData.com website.
 *
 * The version of the OpenAPI document: 4.4.12
 * Contact: admin@collegefootballdata.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class TeamMatchup : IEquatable<TeamMatchup>
    {
        /// <summary>
        /// Gets or Sets EndYear
        /// </summary>
        [DataMember(Name="endYear", EmitDefaultValue=true)]
        public int EndYear { get; set; }

        /// <summary>
        /// Gets or Sets Games
        /// </summary>
        [DataMember(Name="games", EmitDefaultValue=false)]
        public List<TeamMatchupGamesInner> Games { get; set; }

        /// <summary>
        /// Gets or Sets StartYear
        /// </summary>
        [DataMember(Name="startYear", EmitDefaultValue=true)]
        public int StartYear { get; set; }

        /// <summary>
        /// Gets or Sets Team1
        /// </summary>
        [DataMember(Name="team1", EmitDefaultValue=false)]
        public string Team1 { get; set; }

        /// <summary>
        /// Gets or Sets Team1Wins
        /// </summary>
        [DataMember(Name="team1Wins", EmitDefaultValue=true)]
        public int Team1Wins { get; set; }

        /// <summary>
        /// Gets or Sets Team2
        /// </summary>
        [DataMember(Name="team2", EmitDefaultValue=false)]
        public string Team2 { get; set; }

        /// <summary>
        /// Gets or Sets Team2Wins
        /// </summary>
        [DataMember(Name="team2Wins", EmitDefaultValue=true)]
        public int Team2Wins { get; set; }

        /// <summary>
        /// Gets or Sets Ties
        /// </summary>
        [DataMember(Name="ties", EmitDefaultValue=true)]
        public int Ties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TeamMatchup {\n");
            sb.Append("  EndYear: ").Append(EndYear).Append("\n");
            sb.Append("  Games: ").Append(Games).Append("\n");
            sb.Append("  StartYear: ").Append(StartYear).Append("\n");
            sb.Append("  Team1: ").Append(Team1).Append("\n");
            sb.Append("  Team1Wins: ").Append(Team1Wins).Append("\n");
            sb.Append("  Team2: ").Append(Team2).Append("\n");
            sb.Append("  Team2Wins: ").Append(Team2Wins).Append("\n");
            sb.Append("  Ties: ").Append(Ties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((TeamMatchup)obj);
        }

        /// <summary>
        /// Returns true if TeamMatchup instances are equal
        /// </summary>
        /// <param name="other">Instance of TeamMatchup to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TeamMatchup other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    EndYear == other.EndYear ||
                    
                    EndYear.Equals(other.EndYear)
                ) && 
                (
                    Games == other.Games ||
                    Games != null &&
                    other.Games != null &&
                    Games.SequenceEqual(other.Games)
                ) && 
                (
                    StartYear == other.StartYear ||
                    
                    StartYear.Equals(other.StartYear)
                ) && 
                (
                    Team1 == other.Team1 ||
                    Team1 != null &&
                    Team1.Equals(other.Team1)
                ) && 
                (
                    Team1Wins == other.Team1Wins ||
                    
                    Team1Wins.Equals(other.Team1Wins)
                ) && 
                (
                    Team2 == other.Team2 ||
                    Team2 != null &&
                    Team2.Equals(other.Team2)
                ) && 
                (
                    Team2Wins == other.Team2Wins ||
                    
                    Team2Wins.Equals(other.Team2Wins)
                ) && 
                (
                    Ties == other.Ties ||
                    
                    Ties.Equals(other.Ties)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    
                    hashCode = hashCode * 59 + EndYear.GetHashCode();
                    if (Games != null)
                    hashCode = hashCode * 59 + Games.GetHashCode();
                    
                    hashCode = hashCode * 59 + StartYear.GetHashCode();
                    if (Team1 != null)
                    hashCode = hashCode * 59 + Team1.GetHashCode();
                    
                    hashCode = hashCode * 59 + Team1Wins.GetHashCode();
                    if (Team2 != null)
                    hashCode = hashCode * 59 + Team2.GetHashCode();
                    
                    hashCode = hashCode * 59 + Team2Wins.GetHashCode();
                    
                    hashCode = hashCode * 59 + Ties.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TeamMatchup left, TeamMatchup right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TeamMatchup left, TeamMatchup right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
