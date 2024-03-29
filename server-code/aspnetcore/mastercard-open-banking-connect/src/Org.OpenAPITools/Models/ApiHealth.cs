/*
 * Open Banking - Payments initiation service
 *
 * Open Banking - Payments initiation service
 *
 * The version of the OpenAPI document: 1.16.0
 * Contact: apisupport@mastercard.com
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
    /// API Healt response object
    /// </summary>
    [DataContract]
    public partial class ApiHealth : IEquatable<ApiHealth>
    {
        /// <summary>
        /// Connector availability
        /// </summary>
        /// <value>Connector availability</value>
        [DataMember(Name="connectors", EmitDefaultValue=false)]
        public List<ApiHealthConnectors> Connectors { get; set; }


        /// <summary>
        /// Overall connect platform availability status
        /// </summary>
        /// <value>Overall connect platform availability status</value>
        [TypeConverter(typeof(CustomEnumConverter<StatusEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum StatusEnum
        {
            
            /// <summary>
            /// Enum UPEnum for UP
            /// </summary>
            [EnumMember(Value = "UP")]
            UPEnum = 1,
            
            /// <summary>
            /// Enum DOWNEnum for DOWN
            /// </summary>
            [EnumMember(Value = "DOWN")]
            DOWNEnum = 2,
            
            /// <summary>
            /// Enum DEGRADEDEnum for DEGRADED
            /// </summary>
            [EnumMember(Value = "DEGRADED")]
            DEGRADEDEnum = 3
        }

        /// <summary>
        /// Overall connect platform availability status
        /// </summary>
        /// <value>Overall connect platform availability status</value>
        /// <example>UP</example>
        [Required]
        [DataMember(Name="status", EmitDefaultValue=true)]
        public StatusEnum Status { get; set; }

        /// <summary>
        /// Additional informational message
        /// </summary>
        /// <value>Additional informational message</value>
        [DataMember(Name="statusMessage", EmitDefaultValue=false)]
        public string StatusMessage { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiHealth {\n");
            sb.Append("  Connectors: ").Append(Connectors).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  StatusMessage: ").Append(StatusMessage).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ApiHealth)obj);
        }

        /// <summary>
        /// Returns true if ApiHealth instances are equal
        /// </summary>
        /// <param name="other">Instance of ApiHealth to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiHealth other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Connectors == other.Connectors ||
                    Connectors != null &&
                    other.Connectors != null &&
                    Connectors.SequenceEqual(other.Connectors)
                ) && 
                (
                    Status == other.Status ||
                    
                    Status.Equals(other.Status)
                ) && 
                (
                    StatusMessage == other.StatusMessage ||
                    StatusMessage != null &&
                    StatusMessage.Equals(other.StatusMessage)
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
                    if (Connectors != null)
                    hashCode = hashCode * 59 + Connectors.GetHashCode();
                    
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    if (StatusMessage != null)
                    hashCode = hashCode * 59 + StatusMessage.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ApiHealth left, ApiHealth right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ApiHealth left, ApiHealth right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
