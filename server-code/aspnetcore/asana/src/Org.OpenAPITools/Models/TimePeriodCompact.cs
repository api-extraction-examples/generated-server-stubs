/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
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
    public partial class TimePeriodCompact : IEquatable<TimePeriodCompact>
    {
        /// <summary>
        /// Globally unique identifier of the resource, as a string.
        /// </summary>
        /// <value>Globally unique identifier of the resource, as a string.</value>
        /// <example>12345</example>
        [DataMember(Name="gid", EmitDefaultValue=false)]
        public string Gid { get; set; }

        /// <summary>
        /// The base type of this resource.
        /// </summary>
        /// <value>The base type of this resource.</value>
        /// <example>task</example>
        [DataMember(Name="resource_type", EmitDefaultValue=false)]
        public string ResourceType { get; set; }

        /// <summary>
        /// A string representing the cadence code and the fiscal year.
        /// </summary>
        /// <value>A string representing the cadence code and the fiscal year.</value>
        /// <example>Q1 FY22</example>
        [DataMember(Name="display_name", EmitDefaultValue=false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// The localized end date of the time period in &#x60;YYYY-MM-DD&#x60; format.
        /// </summary>
        /// <value>The localized end date of the time period in &#x60;YYYY-MM-DD&#x60; format.</value>
        /// <example>2019-09-14</example>
        [DataMember(Name="end_on", EmitDefaultValue=false)]
        public string EndOn { get; set; }


        /// <summary>
        /// The cadence and index of the time period. The value is one of: `FY`, `H1`, `H2`, `Q1`, `Q2`, `Q3`, or `Q4`.
        /// </summary>
        /// <value>The cadence and index of the time period. The value is one of: `FY`, `H1`, `H2`, `Q1`, `Q2`, `Q3`, or `Q4`.</value>
        [TypeConverter(typeof(CustomEnumConverter<PeriodEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum PeriodEnum
        {
            
            /// <summary>
            /// Enum FYEnum for FY
            /// </summary>
            [EnumMember(Value = "FY")]
            FYEnum = 1,
            
            /// <summary>
            /// Enum H1Enum for H1
            /// </summary>
            [EnumMember(Value = "H1")]
            H1Enum = 2,
            
            /// <summary>
            /// Enum H2Enum for H2
            /// </summary>
            [EnumMember(Value = "H2")]
            H2Enum = 3,
            
            /// <summary>
            /// Enum Q1Enum for Q1
            /// </summary>
            [EnumMember(Value = "Q1")]
            Q1Enum = 4,
            
            /// <summary>
            /// Enum Q2Enum for Q2
            /// </summary>
            [EnumMember(Value = "Q2")]
            Q2Enum = 5,
            
            /// <summary>
            /// Enum Q3Enum for Q3
            /// </summary>
            [EnumMember(Value = "Q3")]
            Q3Enum = 6,
            
            /// <summary>
            /// Enum Q4Enum for Q4
            /// </summary>
            [EnumMember(Value = "Q4")]
            Q4Enum = 7
        }

        /// <summary>
        /// The cadence and index of the time period. The value is one of: &#x60;FY&#x60;, &#x60;H1&#x60;, &#x60;H2&#x60;, &#x60;Q1&#x60;, &#x60;Q2&#x60;, &#x60;Q3&#x60;, or &#x60;Q4&#x60;.
        /// </summary>
        /// <value>The cadence and index of the time period. The value is one of: &#x60;FY&#x60;, &#x60;H1&#x60;, &#x60;H2&#x60;, &#x60;Q1&#x60;, &#x60;Q2&#x60;, &#x60;Q3&#x60;, or &#x60;Q4&#x60;.</value>
        /// <example>Q1</example>
        [DataMember(Name="period", EmitDefaultValue=true)]
        public PeriodEnum Period { get; set; }

        /// <summary>
        /// The localized start date of the time period in &#x60;YYYY-MM-DD&#x60; format.
        /// </summary>
        /// <value>The localized start date of the time period in &#x60;YYYY-MM-DD&#x60; format.</value>
        /// <example>2019-09-13</example>
        [DataMember(Name="start_on", EmitDefaultValue=false)]
        public string StartOn { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TimePeriodCompact {\n");
            sb.Append("  Gid: ").Append(Gid).Append("\n");
            sb.Append("  ResourceType: ").Append(ResourceType).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  EndOn: ").Append(EndOn).Append("\n");
            sb.Append("  Period: ").Append(Period).Append("\n");
            sb.Append("  StartOn: ").Append(StartOn).Append("\n");
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
            return obj.GetType() == GetType() && Equals((TimePeriodCompact)obj);
        }

        /// <summary>
        /// Returns true if TimePeriodCompact instances are equal
        /// </summary>
        /// <param name="other">Instance of TimePeriodCompact to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TimePeriodCompact other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Gid == other.Gid ||
                    Gid != null &&
                    Gid.Equals(other.Gid)
                ) && 
                (
                    ResourceType == other.ResourceType ||
                    ResourceType != null &&
                    ResourceType.Equals(other.ResourceType)
                ) && 
                (
                    DisplayName == other.DisplayName ||
                    DisplayName != null &&
                    DisplayName.Equals(other.DisplayName)
                ) && 
                (
                    EndOn == other.EndOn ||
                    EndOn != null &&
                    EndOn.Equals(other.EndOn)
                ) && 
                (
                    Period == other.Period ||
                    
                    Period.Equals(other.Period)
                ) && 
                (
                    StartOn == other.StartOn ||
                    StartOn != null &&
                    StartOn.Equals(other.StartOn)
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
                    if (Gid != null)
                    hashCode = hashCode * 59 + Gid.GetHashCode();
                    if (ResourceType != null)
                    hashCode = hashCode * 59 + ResourceType.GetHashCode();
                    if (DisplayName != null)
                    hashCode = hashCode * 59 + DisplayName.GetHashCode();
                    if (EndOn != null)
                    hashCode = hashCode * 59 + EndOn.GetHashCode();
                    
                    hashCode = hashCode * 59 + Period.GetHashCode();
                    if (StartOn != null)
                    hashCode = hashCode * 59 + StartOn.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TimePeriodCompact left, TimePeriodCompact right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TimePeriodCompact left, TimePeriodCompact right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
