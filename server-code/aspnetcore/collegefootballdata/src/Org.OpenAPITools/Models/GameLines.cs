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
    public partial class GameLines : IEquatable<GameLines>
    {
        /// <summary>
        /// Gets or Sets AwayConference
        /// </summary>
        [DataMember(Name="awayConference", EmitDefaultValue=false)]
        public string AwayConference { get; set; }

        /// <summary>
        /// Gets or Sets AwayScore
        /// </summary>
        [DataMember(Name="awayScore", EmitDefaultValue=true)]
        public int AwayScore { get; set; }

        /// <summary>
        /// Gets or Sets AwayTeam
        /// </summary>
        [DataMember(Name="awayTeam", EmitDefaultValue=false)]
        public string AwayTeam { get; set; }

        /// <summary>
        /// Gets or Sets HomeConference
        /// </summary>
        [DataMember(Name="homeConference", EmitDefaultValue=false)]
        public string HomeConference { get; set; }

        /// <summary>
        /// Gets or Sets HomeScore
        /// </summary>
        [DataMember(Name="homeScore", EmitDefaultValue=true)]
        public int HomeScore { get; set; }

        /// <summary>
        /// Gets or Sets HomeTeam
        /// </summary>
        [DataMember(Name="homeTeam", EmitDefaultValue=false)]
        public string HomeTeam { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public int Id { get; set; }

        /// <summary>
        /// Gets or Sets Lines
        /// </summary>
        [DataMember(Name="lines", EmitDefaultValue=false)]
        public List<GameLinesLinesInner> Lines { get; set; }

        /// <summary>
        /// Gets or Sets Season
        /// </summary>
        [DataMember(Name="season", EmitDefaultValue=true)]
        public int Season { get; set; }

        /// <summary>
        /// Gets or Sets SeasonType
        /// </summary>
        [DataMember(Name="seasonType", EmitDefaultValue=false)]
        public string SeasonType { get; set; }

        /// <summary>
        /// Gets or Sets StartDate
        /// </summary>
        [DataMember(Name="startDate", EmitDefaultValue=false)]
        public string StartDate { get; set; }

        /// <summary>
        /// Gets or Sets Week
        /// </summary>
        [DataMember(Name="week", EmitDefaultValue=true)]
        public int Week { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GameLines {\n");
            sb.Append("  AwayConference: ").Append(AwayConference).Append("\n");
            sb.Append("  AwayScore: ").Append(AwayScore).Append("\n");
            sb.Append("  AwayTeam: ").Append(AwayTeam).Append("\n");
            sb.Append("  HomeConference: ").Append(HomeConference).Append("\n");
            sb.Append("  HomeScore: ").Append(HomeScore).Append("\n");
            sb.Append("  HomeTeam: ").Append(HomeTeam).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Lines: ").Append(Lines).Append("\n");
            sb.Append("  Season: ").Append(Season).Append("\n");
            sb.Append("  SeasonType: ").Append(SeasonType).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  Week: ").Append(Week).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GameLines)obj);
        }

        /// <summary>
        /// Returns true if GameLines instances are equal
        /// </summary>
        /// <param name="other">Instance of GameLines to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GameLines other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AwayConference == other.AwayConference ||
                    AwayConference != null &&
                    AwayConference.Equals(other.AwayConference)
                ) && 
                (
                    AwayScore == other.AwayScore ||
                    
                    AwayScore.Equals(other.AwayScore)
                ) && 
                (
                    AwayTeam == other.AwayTeam ||
                    AwayTeam != null &&
                    AwayTeam.Equals(other.AwayTeam)
                ) && 
                (
                    HomeConference == other.HomeConference ||
                    HomeConference != null &&
                    HomeConference.Equals(other.HomeConference)
                ) && 
                (
                    HomeScore == other.HomeScore ||
                    
                    HomeScore.Equals(other.HomeScore)
                ) && 
                (
                    HomeTeam == other.HomeTeam ||
                    HomeTeam != null &&
                    HomeTeam.Equals(other.HomeTeam)
                ) && 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    Lines == other.Lines ||
                    Lines != null &&
                    other.Lines != null &&
                    Lines.SequenceEqual(other.Lines)
                ) && 
                (
                    Season == other.Season ||
                    
                    Season.Equals(other.Season)
                ) && 
                (
                    SeasonType == other.SeasonType ||
                    SeasonType != null &&
                    SeasonType.Equals(other.SeasonType)
                ) && 
                (
                    StartDate == other.StartDate ||
                    StartDate != null &&
                    StartDate.Equals(other.StartDate)
                ) && 
                (
                    Week == other.Week ||
                    
                    Week.Equals(other.Week)
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
                    if (AwayConference != null)
                    hashCode = hashCode * 59 + AwayConference.GetHashCode();
                    
                    hashCode = hashCode * 59 + AwayScore.GetHashCode();
                    if (AwayTeam != null)
                    hashCode = hashCode * 59 + AwayTeam.GetHashCode();
                    if (HomeConference != null)
                    hashCode = hashCode * 59 + HomeConference.GetHashCode();
                    
                    hashCode = hashCode * 59 + HomeScore.GetHashCode();
                    if (HomeTeam != null)
                    hashCode = hashCode * 59 + HomeTeam.GetHashCode();
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Lines != null)
                    hashCode = hashCode * 59 + Lines.GetHashCode();
                    
                    hashCode = hashCode * 59 + Season.GetHashCode();
                    if (SeasonType != null)
                    hashCode = hashCode * 59 + SeasonType.GetHashCode();
                    if (StartDate != null)
                    hashCode = hashCode * 59 + StartDate.GetHashCode();
                    
                    hashCode = hashCode * 59 + Week.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GameLines left, GameLines right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GameLines left, GameLines right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
