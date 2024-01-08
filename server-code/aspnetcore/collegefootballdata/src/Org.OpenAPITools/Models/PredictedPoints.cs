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
    public partial class PredictedPoints : IEquatable<PredictedPoints>
    {
        /// <summary>
        /// Gets or Sets VarPredictedPoints
        /// </summary>
        [DataMember(Name="predictedPoints", EmitDefaultValue=true)]
        public decimal VarPredictedPoints { get; set; }

        /// <summary>
        /// Gets or Sets YardLine
        /// </summary>
        [DataMember(Name="yardLine", EmitDefaultValue=true)]
        public int YardLine { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PredictedPoints {\n");
            sb.Append("  VarPredictedPoints: ").Append(VarPredictedPoints).Append("\n");
            sb.Append("  YardLine: ").Append(YardLine).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PredictedPoints)obj);
        }

        /// <summary>
        /// Returns true if PredictedPoints instances are equal
        /// </summary>
        /// <param name="other">Instance of PredictedPoints to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PredictedPoints other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    VarPredictedPoints == other.VarPredictedPoints ||
                    
                    VarPredictedPoints.Equals(other.VarPredictedPoints)
                ) && 
                (
                    YardLine == other.YardLine ||
                    
                    YardLine.Equals(other.YardLine)
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
                    
                    hashCode = hashCode * 59 + VarPredictedPoints.GetHashCode();
                    
                    hashCode = hashCode * 59 + YardLine.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PredictedPoints left, PredictedPoints right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PredictedPoints left, PredictedPoints right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
