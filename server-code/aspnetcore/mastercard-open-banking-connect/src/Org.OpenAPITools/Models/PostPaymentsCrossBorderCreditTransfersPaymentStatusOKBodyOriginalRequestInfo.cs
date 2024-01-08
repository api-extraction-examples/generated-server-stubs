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
    public partial class PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBodyOriginalRequestInfo : IEquatable<PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBodyOriginalRequestInfo>
    {
        /// <summary>
        /// Original xRequestId given by the client on request
        /// </summary>
        /// <value>Original xRequestId given by the client on request</value>
        /// <example>444e4567-e55b-12d3-a456-426655448888</example>
        [Required]
        [RegularExpression("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")]
        [DataMember(Name="xRequestId", EmitDefaultValue=false)]
        public string XRequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBodyOriginalRequestInfo {\n");
            sb.Append("  XRequestId: ").Append(XRequestId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBodyOriginalRequestInfo)obj);
        }

        /// <summary>
        /// Returns true if PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBodyOriginalRequestInfo instances are equal
        /// </summary>
        /// <param name="other">Instance of PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBodyOriginalRequestInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBodyOriginalRequestInfo other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    XRequestId == other.XRequestId ||
                    XRequestId != null &&
                    XRequestId.Equals(other.XRequestId)
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
                    if (XRequestId != null)
                    hashCode = hashCode * 59 + XRequestId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBodyOriginalRequestInfo left, PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBodyOriginalRequestInfo right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBodyOriginalRequestInfo left, PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBodyOriginalRequestInfo right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
