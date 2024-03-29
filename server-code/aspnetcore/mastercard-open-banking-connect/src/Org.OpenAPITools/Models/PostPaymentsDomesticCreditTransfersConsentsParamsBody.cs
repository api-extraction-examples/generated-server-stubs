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
    public partial class PostPaymentsDomesticCreditTransfersConsentsParamsBody : IEquatable<PostPaymentsDomesticCreditTransfersConsentsParamsBody>
    {
        /// <summary>
        /// Gets or Sets Payments
        /// </summary>
        [Required]
        [DataMember(Name="payments", EmitDefaultValue=false)]
        public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments Payments { get; set; }

        /// <summary>
        /// Gets or Sets RequestInfo
        /// </summary>
        [Required]
        [DataMember(Name="requestInfo", EmitDefaultValue=false)]
        public PostPaymentsDomesticCreditTransfersConsentsParamsBodyRequestInfo RequestInfo { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PostPaymentsDomesticCreditTransfersConsentsParamsBody {\n");
            sb.Append("  Payments: ").Append(Payments).Append("\n");
            sb.Append("  RequestInfo: ").Append(RequestInfo).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PostPaymentsDomesticCreditTransfersConsentsParamsBody)obj);
        }

        /// <summary>
        /// Returns true if PostPaymentsDomesticCreditTransfersConsentsParamsBody instances are equal
        /// </summary>
        /// <param name="other">Instance of PostPaymentsDomesticCreditTransfersConsentsParamsBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostPaymentsDomesticCreditTransfersConsentsParamsBody other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Payments == other.Payments ||
                    Payments != null &&
                    Payments.Equals(other.Payments)
                ) && 
                (
                    RequestInfo == other.RequestInfo ||
                    RequestInfo != null &&
                    RequestInfo.Equals(other.RequestInfo)
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
                    if (Payments != null)
                    hashCode = hashCode * 59 + Payments.GetHashCode();
                    if (RequestInfo != null)
                    hashCode = hashCode * 59 + RequestInfo.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PostPaymentsDomesticCreditTransfersConsentsParamsBody left, PostPaymentsDomesticCreditTransfersConsentsParamsBody right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PostPaymentsDomesticCreditTransfersConsentsParamsBody left, PostPaymentsDomesticCreditTransfersConsentsParamsBody right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
