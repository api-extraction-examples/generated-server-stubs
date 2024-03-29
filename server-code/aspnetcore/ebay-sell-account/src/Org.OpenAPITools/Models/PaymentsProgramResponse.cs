/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * The version of the OpenAPI document: v1.9.0
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
    /// The response object containing the sellers status with regards to the specified payment program.
    /// </summary>
    [DataContract]
    public partial class PaymentsProgramResponse : IEquatable<PaymentsProgramResponse>
    {
        /// <summary>
        /// The ID of the eBay marketplace to which the payment program applies. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&#39;&gt;eBay API documentation&lt;/a&gt;
        /// </summary>
        /// <value>The ID of the eBay marketplace to which the payment program applies. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&#39;&gt;eBay API documentation&lt;/a&gt;</value>
        [DataMember(Name="marketplaceId", EmitDefaultValue=false)]
        public string MarketplaceId { get; set; }

        /// <summary>
        /// This parameter specifies the payment program whose status is returned by the call.  &lt;br&gt;&lt;br&gt;Currently the only supported payments program is &lt;code&gt;EBAY_PAYMENTS&lt;/code&gt;. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramType&#39;&gt;eBay API documentation&lt;/a&gt;
        /// </summary>
        /// <value>This parameter specifies the payment program whose status is returned by the call.  &lt;br&gt;&lt;br&gt;Currently the only supported payments program is &lt;code&gt;EBAY_PAYMENTS&lt;/code&gt;. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramType&#39;&gt;eBay API documentation&lt;/a&gt;</value>
        [DataMember(Name="paymentsProgramType", EmitDefaultValue=false)]
        public string PaymentsProgramType { get; set; }

        /// <summary>
        /// The enumeration value returned in this field indicates whether or not the seller&#39;s account is enabled for the payments program. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramStatus&#39;&gt;eBay API documentation&lt;/a&gt;
        /// </summary>
        /// <value>The enumeration value returned in this field indicates whether or not the seller&#39;s account is enabled for the payments program. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramStatus&#39;&gt;eBay API documentation&lt;/a&gt;</value>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public string Status { get; set; }

        /// <summary>
        /// If returned as &lt;code&gt;true&lt;/code&gt;, the seller was at one point opted-in to the associated payment program, but they later opted out of the program. A value of &lt;code&gt;false&lt;/code&gt; indicates the seller never opted-in to the program or if they did opt-in to the program, they never opted-out of it.  &lt;br&gt;&lt;br&gt;It&#39;s important to note that the setting of this field does not indicate the seller&#39;s current status regarding the payment program. It is possible for this field to return &lt;code&gt;true&lt;/code&gt; while the &lt;b&gt;status&lt;/b&gt; field returns &lt;code&gt;OPTED_IN&lt;/code&gt;.
        /// </summary>
        /// <value>If returned as &lt;code&gt;true&lt;/code&gt;, the seller was at one point opted-in to the associated payment program, but they later opted out of the program. A value of &lt;code&gt;false&lt;/code&gt; indicates the seller never opted-in to the program or if they did opt-in to the program, they never opted-out of it.  &lt;br&gt;&lt;br&gt;It&#39;s important to note that the setting of this field does not indicate the seller&#39;s current status regarding the payment program. It is possible for this field to return &lt;code&gt;true&lt;/code&gt; while the &lt;b&gt;status&lt;/b&gt; field returns &lt;code&gt;OPTED_IN&lt;/code&gt;.</value>
        [DataMember(Name="wasPreviouslyOptedIn", EmitDefaultValue=true)]
        public bool WasPreviouslyOptedIn { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PaymentsProgramResponse {\n");
            sb.Append("  MarketplaceId: ").Append(MarketplaceId).Append("\n");
            sb.Append("  PaymentsProgramType: ").Append(PaymentsProgramType).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  WasPreviouslyOptedIn: ").Append(WasPreviouslyOptedIn).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PaymentsProgramResponse)obj);
        }

        /// <summary>
        /// Returns true if PaymentsProgramResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of PaymentsProgramResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PaymentsProgramResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    MarketplaceId == other.MarketplaceId ||
                    MarketplaceId != null &&
                    MarketplaceId.Equals(other.MarketplaceId)
                ) && 
                (
                    PaymentsProgramType == other.PaymentsProgramType ||
                    PaymentsProgramType != null &&
                    PaymentsProgramType.Equals(other.PaymentsProgramType)
                ) && 
                (
                    Status == other.Status ||
                    Status != null &&
                    Status.Equals(other.Status)
                ) && 
                (
                    WasPreviouslyOptedIn == other.WasPreviouslyOptedIn ||
                    
                    WasPreviouslyOptedIn.Equals(other.WasPreviouslyOptedIn)
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
                    if (MarketplaceId != null)
                    hashCode = hashCode * 59 + MarketplaceId.GetHashCode();
                    if (PaymentsProgramType != null)
                    hashCode = hashCode * 59 + PaymentsProgramType.GetHashCode();
                    if (Status != null)
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    
                    hashCode = hashCode * 59 + WasPreviouslyOptedIn.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PaymentsProgramResponse left, PaymentsProgramResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PaymentsProgramResponse left, PaymentsProgramResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
