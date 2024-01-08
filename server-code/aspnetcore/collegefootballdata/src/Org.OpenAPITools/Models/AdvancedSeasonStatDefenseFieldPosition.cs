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
    public partial class AdvancedSeasonStatDefenseFieldPosition : IEquatable<AdvancedSeasonStatDefenseFieldPosition>
    {
        /// <summary>
        /// Gets or Sets AveragePredictedPoints
        /// </summary>
        [DataMember(Name="averagePredictedPoints", EmitDefaultValue=true)]
        public decimal AveragePredictedPoints { get; set; }

        /// <summary>
        /// Gets or Sets AverageStart
        /// </summary>
        [DataMember(Name="averageStart", EmitDefaultValue=true)]
        public decimal AverageStart { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AdvancedSeasonStatDefenseFieldPosition {\n");
            sb.Append("  AveragePredictedPoints: ").Append(AveragePredictedPoints).Append("\n");
            sb.Append("  AverageStart: ").Append(AverageStart).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AdvancedSeasonStatDefenseFieldPosition)obj);
        }

        /// <summary>
        /// Returns true if AdvancedSeasonStatDefenseFieldPosition instances are equal
        /// </summary>
        /// <param name="other">Instance of AdvancedSeasonStatDefenseFieldPosition to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdvancedSeasonStatDefenseFieldPosition other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AveragePredictedPoints == other.AveragePredictedPoints ||
                    
                    AveragePredictedPoints.Equals(other.AveragePredictedPoints)
                ) && 
                (
                    AverageStart == other.AverageStart ||
                    
                    AverageStart.Equals(other.AverageStart)
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
                    
                    hashCode = hashCode * 59 + AveragePredictedPoints.GetHashCode();
                    
                    hashCode = hashCode * 59 + AverageStart.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AdvancedSeasonStatDefenseFieldPosition left, AdvancedSeasonStatDefenseFieldPosition right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AdvancedSeasonStatDefenseFieldPosition left, AdvancedSeasonStatDefenseFieldPosition right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
