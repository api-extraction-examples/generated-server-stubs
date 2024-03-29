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
    public partial class PositionGroupRecruitingRating : IEquatable<PositionGroupRecruitingRating>
    {
        /// <summary>
        /// Gets or Sets AverageRating
        /// </summary>
        [DataMember(Name="averageRating", EmitDefaultValue=true)]
        public decimal AverageRating { get; set; }

        /// <summary>
        /// Gets or Sets AverageStars
        /// </summary>
        [DataMember(Name="averageStars", EmitDefaultValue=true)]
        public decimal AverageStars { get; set; }

        /// <summary>
        /// Gets or Sets Commits
        /// </summary>
        [DataMember(Name="commits", EmitDefaultValue=true)]
        public decimal Commits { get; set; }

        /// <summary>
        /// Gets or Sets Conference
        /// </summary>
        [DataMember(Name="conference", EmitDefaultValue=false)]
        public string Conference { get; set; }

        /// <summary>
        /// Gets or Sets PositionGroup
        /// </summary>
        [DataMember(Name="positionGroup", EmitDefaultValue=false)]
        public string PositionGroup { get; set; }

        /// <summary>
        /// Gets or Sets Team
        /// </summary>
        [DataMember(Name="team", EmitDefaultValue=false)]
        public string Team { get; set; }

        /// <summary>
        /// Gets or Sets TotalRating
        /// </summary>
        [DataMember(Name="totalRating", EmitDefaultValue=true)]
        public decimal TotalRating { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PositionGroupRecruitingRating {\n");
            sb.Append("  AverageRating: ").Append(AverageRating).Append("\n");
            sb.Append("  AverageStars: ").Append(AverageStars).Append("\n");
            sb.Append("  Commits: ").Append(Commits).Append("\n");
            sb.Append("  Conference: ").Append(Conference).Append("\n");
            sb.Append("  PositionGroup: ").Append(PositionGroup).Append("\n");
            sb.Append("  Team: ").Append(Team).Append("\n");
            sb.Append("  TotalRating: ").Append(TotalRating).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PositionGroupRecruitingRating)obj);
        }

        /// <summary>
        /// Returns true if PositionGroupRecruitingRating instances are equal
        /// </summary>
        /// <param name="other">Instance of PositionGroupRecruitingRating to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PositionGroupRecruitingRating other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AverageRating == other.AverageRating ||
                    
                    AverageRating.Equals(other.AverageRating)
                ) && 
                (
                    AverageStars == other.AverageStars ||
                    
                    AverageStars.Equals(other.AverageStars)
                ) && 
                (
                    Commits == other.Commits ||
                    
                    Commits.Equals(other.Commits)
                ) && 
                (
                    Conference == other.Conference ||
                    Conference != null &&
                    Conference.Equals(other.Conference)
                ) && 
                (
                    PositionGroup == other.PositionGroup ||
                    PositionGroup != null &&
                    PositionGroup.Equals(other.PositionGroup)
                ) && 
                (
                    Team == other.Team ||
                    Team != null &&
                    Team.Equals(other.Team)
                ) && 
                (
                    TotalRating == other.TotalRating ||
                    
                    TotalRating.Equals(other.TotalRating)
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
                    
                    hashCode = hashCode * 59 + AverageRating.GetHashCode();
                    
                    hashCode = hashCode * 59 + AverageStars.GetHashCode();
                    
                    hashCode = hashCode * 59 + Commits.GetHashCode();
                    if (Conference != null)
                    hashCode = hashCode * 59 + Conference.GetHashCode();
                    if (PositionGroup != null)
                    hashCode = hashCode * 59 + PositionGroup.GetHashCode();
                    if (Team != null)
                    hashCode = hashCode * 59 + Team.GetHashCode();
                    
                    hashCode = hashCode * 59 + TotalRating.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PositionGroupRecruitingRating left, PositionGroupRecruitingRating right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PositionGroupRecruitingRating left, PositionGroupRecruitingRating right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
