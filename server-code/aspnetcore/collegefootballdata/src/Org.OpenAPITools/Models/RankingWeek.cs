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
    public partial class RankingWeek : IEquatable<RankingWeek>
    {
        /// <summary>
        /// Gets or Sets Polls
        /// </summary>
        [DataMember(Name="polls", EmitDefaultValue=false)]
        public List<RankingWeekPollsInner> Polls { get; set; }

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
            sb.Append("class RankingWeek {\n");
            sb.Append("  Polls: ").Append(Polls).Append("\n");
            sb.Append("  Season: ").Append(Season).Append("\n");
            sb.Append("  SeasonType: ").Append(SeasonType).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RankingWeek)obj);
        }

        /// <summary>
        /// Returns true if RankingWeek instances are equal
        /// </summary>
        /// <param name="other">Instance of RankingWeek to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RankingWeek other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Polls == other.Polls ||
                    Polls != null &&
                    other.Polls != null &&
                    Polls.SequenceEqual(other.Polls)
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
                    if (Polls != null)
                    hashCode = hashCode * 59 + Polls.GetHashCode();
                    
                    hashCode = hashCode * 59 + Season.GetHashCode();
                    if (SeasonType != null)
                    hashCode = hashCode * 59 + SeasonType.GetHashCode();
                    
                    hashCode = hashCode * 59 + Week.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RankingWeek left, RankingWeek right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RankingWeek left, RankingWeek right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
