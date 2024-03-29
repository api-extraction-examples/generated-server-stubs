/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.4.1
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
    public partial class DiagnosticSignatureAttributes : IEquatable<DiagnosticSignatureAttributes>
    {

        /// <summary>
        /// Gets or Sets DiagnosticType
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<DiagnosticTypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum DiagnosticTypeEnum
        {
            
            /// <summary>
            /// Enum DISKWRITESEnum for DISK_WRITES
            /// </summary>
            [EnumMember(Value = "DISK_WRITES")]
            DISKWRITESEnum = 1
        }

        /// <summary>
        /// Gets or Sets DiagnosticType
        /// </summary>
        [DataMember(Name="diagnosticType", EmitDefaultValue=true)]
        public DiagnosticTypeEnum DiagnosticType { get; set; }

        /// <summary>
        /// Gets or Sets Signature
        /// </summary>
        [DataMember(Name="signature", EmitDefaultValue=false)]
        public string Signature { get; set; }

        /// <summary>
        /// Gets or Sets Weight
        /// </summary>
        [DataMember(Name="weight", EmitDefaultValue=true)]
        public decimal Weight { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DiagnosticSignatureAttributes {\n");
            sb.Append("  DiagnosticType: ").Append(DiagnosticType).Append("\n");
            sb.Append("  Signature: ").Append(Signature).Append("\n");
            sb.Append("  Weight: ").Append(Weight).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DiagnosticSignatureAttributes)obj);
        }

        /// <summary>
        /// Returns true if DiagnosticSignatureAttributes instances are equal
        /// </summary>
        /// <param name="other">Instance of DiagnosticSignatureAttributes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DiagnosticSignatureAttributes other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DiagnosticType == other.DiagnosticType ||
                    
                    DiagnosticType.Equals(other.DiagnosticType)
                ) && 
                (
                    Signature == other.Signature ||
                    Signature != null &&
                    Signature.Equals(other.Signature)
                ) && 
                (
                    Weight == other.Weight ||
                    
                    Weight.Equals(other.Weight)
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
                    
                    hashCode = hashCode * 59 + DiagnosticType.GetHashCode();
                    if (Signature != null)
                    hashCode = hashCode * 59 + Signature.GetHashCode();
                    
                    hashCode = hashCode * 59 + Weight.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DiagnosticSignatureAttributes left, DiagnosticSignatureAttributes right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DiagnosticSignatureAttributes left, DiagnosticSignatureAttributes right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
