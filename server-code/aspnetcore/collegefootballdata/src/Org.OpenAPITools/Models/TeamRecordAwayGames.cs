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
    public partial class TeamRecordAwayGames : IEquatable<TeamRecordAwayGames>
    {
        /// <summary>
        /// Gets or Sets Games
        /// </summary>
        [DataMember(Name="games", EmitDefaultValue=true)]
        public int Games { get; set; }

        /// <summary>
        /// Gets or Sets Losses
        /// </summary>
        [DataMember(Name="losses", EmitDefaultValue=true)]
        public int Losses { get; set; }

        /// <summary>
        /// Gets or Sets Ties
        /// </summary>
        [DataMember(Name="ties", EmitDefaultValue=true)]
        public int Ties { get; set; }

        /// <summary>
        /// Gets or Sets Wins
        /// </summary>
        [DataMember(Name="wins", EmitDefaultValue=true)]
        public int Wins { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TeamRecordAwayGames {\n");
            sb.Append("  Games: ").Append(Games).Append("\n");
            sb.Append("  Losses: ").Append(Losses).Append("\n");
            sb.Append("  Ties: ").Append(Ties).Append("\n");
            sb.Append("  Wins: ").Append(Wins).Append("\n");
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
            return obj.GetType() == GetType() && Equals((TeamRecordAwayGames)obj);
        }

        /// <summary>
        /// Returns true if TeamRecordAwayGames instances are equal
        /// </summary>
        /// <param name="other">Instance of TeamRecordAwayGames to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TeamRecordAwayGames other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Games == other.Games ||
                    
                    Games.Equals(other.Games)
                ) && 
                (
                    Losses == other.Losses ||
                    
                    Losses.Equals(other.Losses)
                ) && 
                (
                    Ties == other.Ties ||
                    
                    Ties.Equals(other.Ties)
                ) && 
                (
                    Wins == other.Wins ||
                    
                    Wins.Equals(other.Wins)
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
                    
                    hashCode = hashCode * 59 + Games.GetHashCode();
                    
                    hashCode = hashCode * 59 + Losses.GetHashCode();
                    
                    hashCode = hashCode * 59 + Ties.GetHashCode();
                    
                    hashCode = hashCode * 59 + Wins.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TeamRecordAwayGames left, TeamRecordAwayGames right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TeamRecordAwayGames left, TeamRecordAwayGames right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}