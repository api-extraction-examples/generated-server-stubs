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
    /// 
    /// </summary>
    [DataContract]
    public partial class ErrorErrorsError : IEquatable<ErrorErrorsError>
    {
        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="Description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Details
        /// </summary>
        [DataMember(Name="Details", EmitDefaultValue=false)]
        public string Details { get; set; }

        /// <summary>
        /// Gets or Sets ReasonCode
        /// </summary>
        [DataMember(Name="ReasonCode", EmitDefaultValue=false)]
        public string ReasonCode { get; set; }

        /// <summary>
        /// Gets or Sets Recoverable
        /// </summary>
        [DataMember(Name="Recoverable", EmitDefaultValue=true)]
        public bool Recoverable { get; set; }

        /// <summary>
        /// Gets or Sets Source
        /// </summary>
        [DataMember(Name="Source", EmitDefaultValue=false)]
        public string Source { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ErrorErrorsError {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Details: ").Append(Details).Append("\n");
            sb.Append("  ReasonCode: ").Append(ReasonCode).Append("\n");
            sb.Append("  Recoverable: ").Append(Recoverable).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ErrorErrorsError)obj);
        }

        /// <summary>
        /// Returns true if ErrorErrorsError instances are equal
        /// </summary>
        /// <param name="other">Instance of ErrorErrorsError to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ErrorErrorsError other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    Details == other.Details ||
                    Details != null &&
                    Details.Equals(other.Details)
                ) && 
                (
                    ReasonCode == other.ReasonCode ||
                    ReasonCode != null &&
                    ReasonCode.Equals(other.ReasonCode)
                ) && 
                (
                    Recoverable == other.Recoverable ||
                    
                    Recoverable.Equals(other.Recoverable)
                ) && 
                (
                    Source == other.Source ||
                    Source != null &&
                    Source.Equals(other.Source)
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
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (Details != null)
                    hashCode = hashCode * 59 + Details.GetHashCode();
                    if (ReasonCode != null)
                    hashCode = hashCode * 59 + ReasonCode.GetHashCode();
                    
                    hashCode = hashCode * 59 + Recoverable.GetHashCode();
                    if (Source != null)
                    hashCode = hashCode * 59 + Source.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ErrorErrorsError left, ErrorErrorsError right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ErrorErrorsError left, ErrorErrorsError right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
