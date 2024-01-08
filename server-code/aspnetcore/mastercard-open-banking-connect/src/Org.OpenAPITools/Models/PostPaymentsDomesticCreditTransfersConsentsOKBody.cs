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
    public partial class PostPaymentsDomesticCreditTransfersConsentsOKBody : IEquatable<PostPaymentsDomesticCreditTransfersConsentsOKBody>
    {
        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name="_links", EmitDefaultValue=false)]
        public PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks Links { get; set; }

        /// <summary>
        /// Gets or Sets AdditionalData
        /// </summary>
        [DataMember(Name="additionalData", EmitDefaultValue=false)]
        public PostPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData AdditionalData { get; set; }


        /// <summary>
        /// Gets or Sets AspspSCAApproach
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<AspspSCAApproachEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum AspspSCAApproachEnum
        {
            
            /// <summary>
            /// Enum REDIRECTEnum for REDIRECT
            /// </summary>
            [EnumMember(Value = "REDIRECT")]
            REDIRECTEnum = 1
        }

        /// <summary>
        /// Gets or Sets AspspSCAApproach
        /// </summary>
        [DataMember(Name="aspspSCAApproach", EmitDefaultValue=true)]
        public AspspSCAApproachEnum AspspSCAApproach { get; set; }

        /// <summary>
        /// Gets or Sets ConsentRequestId
        /// </summary>
        [DataMember(Name="consentRequestId", EmitDefaultValue=false)]
        public string ConsentRequestId { get; set; }

        /// <summary>
        /// Gets or Sets OriginalRequestInfo
        /// </summary>
        [Required]
        [DataMember(Name="originalRequestInfo", EmitDefaultValue=false)]
        public PostPaymentsDomesticCreditTransfersConsentsOKBodyOriginalRequestInfo OriginalRequestInfo { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PostPaymentsDomesticCreditTransfersConsentsOKBody {\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("  AdditionalData: ").Append(AdditionalData).Append("\n");
            sb.Append("  AspspSCAApproach: ").Append(AspspSCAApproach).Append("\n");
            sb.Append("  ConsentRequestId: ").Append(ConsentRequestId).Append("\n");
            sb.Append("  OriginalRequestInfo: ").Append(OriginalRequestInfo).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PostPaymentsDomesticCreditTransfersConsentsOKBody)obj);
        }

        /// <summary>
        /// Returns true if PostPaymentsDomesticCreditTransfersConsentsOKBody instances are equal
        /// </summary>
        /// <param name="other">Instance of PostPaymentsDomesticCreditTransfersConsentsOKBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostPaymentsDomesticCreditTransfersConsentsOKBody other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Links == other.Links ||
                    Links != null &&
                    Links.Equals(other.Links)
                ) && 
                (
                    AdditionalData == other.AdditionalData ||
                    AdditionalData != null &&
                    AdditionalData.Equals(other.AdditionalData)
                ) && 
                (
                    AspspSCAApproach == other.AspspSCAApproach ||
                    
                    AspspSCAApproach.Equals(other.AspspSCAApproach)
                ) && 
                (
                    ConsentRequestId == other.ConsentRequestId ||
                    ConsentRequestId != null &&
                    ConsentRequestId.Equals(other.ConsentRequestId)
                ) && 
                (
                    OriginalRequestInfo == other.OriginalRequestInfo ||
                    OriginalRequestInfo != null &&
                    OriginalRequestInfo.Equals(other.OriginalRequestInfo)
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
                    if (Links != null)
                    hashCode = hashCode * 59 + Links.GetHashCode();
                    if (AdditionalData != null)
                    hashCode = hashCode * 59 + AdditionalData.GetHashCode();
                    
                    hashCode = hashCode * 59 + AspspSCAApproach.GetHashCode();
                    if (ConsentRequestId != null)
                    hashCode = hashCode * 59 + ConsentRequestId.GetHashCode();
                    if (OriginalRequestInfo != null)
                    hashCode = hashCode * 59 + OriginalRequestInfo.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PostPaymentsDomesticCreditTransfersConsentsOKBody left, PostPaymentsDomesticCreditTransfersConsentsOKBody right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PostPaymentsDomesticCreditTransfersConsentsOKBody left, PostPaymentsDomesticCreditTransfersConsentsOKBody right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
