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
    public partial class AdvancedSeasonStatDefensePassingPlays : IEquatable<AdvancedSeasonStatDefensePassingPlays>
    {
        /// <summary>
        /// Gets or Sets Explosiveness
        /// </summary>
        [DataMember(Name="explosiveness", EmitDefaultValue=true)]
        public decimal Explosiveness { get; set; }

        /// <summary>
        /// Gets or Sets Ppa
        /// </summary>
        [DataMember(Name="ppa", EmitDefaultValue=true)]
        public decimal Ppa { get; set; }

        /// <summary>
        /// Gets or Sets Rate
        /// </summary>
        [DataMember(Name="rate", EmitDefaultValue=true)]
        public decimal Rate { get; set; }

        /// <summary>
        /// Gets or Sets SuccessRate
        /// </summary>
        [DataMember(Name="successRate", EmitDefaultValue=true)]
        public decimal SuccessRate { get; set; }

        /// <summary>
        /// Gets or Sets TotalPPA
        /// </summary>
        [DataMember(Name="totalPPA", EmitDefaultValue=true)]
        public decimal TotalPPA { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AdvancedSeasonStatDefensePassingPlays {\n");
            sb.Append("  Explosiveness: ").Append(Explosiveness).Append("\n");
            sb.Append("  Ppa: ").Append(Ppa).Append("\n");
            sb.Append("  Rate: ").Append(Rate).Append("\n");
            sb.Append("  SuccessRate: ").Append(SuccessRate).Append("\n");
            sb.Append("  TotalPPA: ").Append(TotalPPA).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AdvancedSeasonStatDefensePassingPlays)obj);
        }

        /// <summary>
        /// Returns true if AdvancedSeasonStatDefensePassingPlays instances are equal
        /// </summary>
        /// <param name="other">Instance of AdvancedSeasonStatDefensePassingPlays to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdvancedSeasonStatDefensePassingPlays other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Explosiveness == other.Explosiveness ||
                    
                    Explosiveness.Equals(other.Explosiveness)
                ) && 
                (
                    Ppa == other.Ppa ||
                    
                    Ppa.Equals(other.Ppa)
                ) && 
                (
                    Rate == other.Rate ||
                    
                    Rate.Equals(other.Rate)
                ) && 
                (
                    SuccessRate == other.SuccessRate ||
                    
                    SuccessRate.Equals(other.SuccessRate)
                ) && 
                (
                    TotalPPA == other.TotalPPA ||
                    
                    TotalPPA.Equals(other.TotalPPA)
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
                    
                    hashCode = hashCode * 59 + Explosiveness.GetHashCode();
                    
                    hashCode = hashCode * 59 + Ppa.GetHashCode();
                    
                    hashCode = hashCode * 59 + Rate.GetHashCode();
                    
                    hashCode = hashCode * 59 + SuccessRate.GetHashCode();
                    
                    hashCode = hashCode * 59 + TotalPPA.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AdvancedSeasonStatDefensePassingPlays left, AdvancedSeasonStatDefensePassingPlays right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AdvancedSeasonStatDefensePassingPlays left, AdvancedSeasonStatDefensePassingPlays right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
