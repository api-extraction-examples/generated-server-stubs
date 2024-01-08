/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
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
    public partial class ProgrammeSummary : IEquatable<ProgrammeSummary>
    {
        /// <summary>
        /// Gets or Sets Pid
        /// </summary>
        [Required]
        [DataMember(Name="pid", EmitDefaultValue=false)]
        public string Pid { get; set; }


        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum BrandSummaryEnum for brand_summary
            /// </summary>
            [EnumMember(Value = "brand_summary")]
            BrandSummaryEnum = 1,
            
            /// <summary>
            /// Enum SeriesSummaryEnum for series_summary
            /// </summary>
            [EnumMember(Value = "series_summary")]
            SeriesSummaryEnum = 2,
            
            /// <summary>
            /// Enum EpisodeSummaryEnum for episode_summary
            /// </summary>
            [EnumMember(Value = "episode_summary")]
            EpisodeSummaryEnum = 3,
            
            /// <summary>
            /// Enum ClipSummaryEnum for clip_summary
            /// </summary>
            [EnumMember(Value = "clip_summary")]
            ClipSummaryEnum = 4
        }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProgrammeSummary {\n");
            sb.Append("  Pid: ").Append(Pid).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ProgrammeSummary)obj);
        }

        /// <summary>
        /// Returns true if ProgrammeSummary instances are equal
        /// </summary>
        /// <param name="other">Instance of ProgrammeSummary to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProgrammeSummary other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Pid == other.Pid ||
                    Pid != null &&
                    Pid.Equals(other.Pid)
                ) && 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
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
                    if (Pid != null)
                    hashCode = hashCode * 59 + Pid.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ProgrammeSummary left, ProgrammeSummary right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ProgrammeSummary left, ProgrammeSummary right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
