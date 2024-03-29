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
    /// This type is used to provide sales tax settings for a specific tax jurisdiction.
    /// </summary>
    [DataContract]
    public partial class SalesTax : IEquatable<SalesTax>
    {
        /// <summary>
        /// The country code enumeration value identifies the country to which this sales tax rate applies. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum&#39;&gt;eBay API documentation&lt;/a&gt;
        /// </summary>
        /// <value>The country code enumeration value identifies the country to which this sales tax rate applies. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum&#39;&gt;eBay API documentation&lt;/a&gt;</value>
        [DataMember(Name="countryCode", EmitDefaultValue=false)]
        public string CountryCode { get; set; }

        /// <summary>
        /// A unique ID that identifies the sales tax jurisdiction to which the sales tax rate applies (for example, a state within the United States).
        /// </summary>
        /// <value>A unique ID that identifies the sales tax jurisdiction to which the sales tax rate applies (for example, a state within the United States).</value>
        [DataMember(Name="salesTaxJurisdictionId", EmitDefaultValue=false)]
        public string SalesTaxJurisdictionId { get; set; }

        /// <summary>
        /// The sales tax rate that will be applied to sales price. The &lt;b&gt;shippingAndHandlingTaxed&lt;/b&gt; value will indicate whether or not sales tax is also applied to shipping and handling charges&lt;br&gt;&lt;br&gt;Although it is a string, a percentage value is returned here, such as &lt;code&gt;7.75&lt;/code&gt;
        /// </summary>
        /// <value>The sales tax rate that will be applied to sales price. The &lt;b&gt;shippingAndHandlingTaxed&lt;/b&gt; value will indicate whether or not sales tax is also applied to shipping and handling charges&lt;br&gt;&lt;br&gt;Although it is a string, a percentage value is returned here, such as &lt;code&gt;7.75&lt;/code&gt;</value>
        [DataMember(Name="salesTaxPercentage", EmitDefaultValue=false)]
        public string SalesTaxPercentage { get; set; }

        /// <summary>
        /// If returned as &lt;code&gt;true&lt;/code&gt;, sales tax is also applied to shipping and handling charges, and not just the total sales price of the order.
        /// </summary>
        /// <value>If returned as &lt;code&gt;true&lt;/code&gt;, sales tax is also applied to shipping and handling charges, and not just the total sales price of the order.</value>
        [DataMember(Name="shippingAndHandlingTaxed", EmitDefaultValue=true)]
        public bool ShippingAndHandlingTaxed { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SalesTax {\n");
            sb.Append("  CountryCode: ").Append(CountryCode).Append("\n");
            sb.Append("  SalesTaxJurisdictionId: ").Append(SalesTaxJurisdictionId).Append("\n");
            sb.Append("  SalesTaxPercentage: ").Append(SalesTaxPercentage).Append("\n");
            sb.Append("  ShippingAndHandlingTaxed: ").Append(ShippingAndHandlingTaxed).Append("\n");
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
            return obj.GetType() == GetType() && Equals((SalesTax)obj);
        }

        /// <summary>
        /// Returns true if SalesTax instances are equal
        /// </summary>
        /// <param name="other">Instance of SalesTax to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SalesTax other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CountryCode == other.CountryCode ||
                    CountryCode != null &&
                    CountryCode.Equals(other.CountryCode)
                ) && 
                (
                    SalesTaxJurisdictionId == other.SalesTaxJurisdictionId ||
                    SalesTaxJurisdictionId != null &&
                    SalesTaxJurisdictionId.Equals(other.SalesTaxJurisdictionId)
                ) && 
                (
                    SalesTaxPercentage == other.SalesTaxPercentage ||
                    SalesTaxPercentage != null &&
                    SalesTaxPercentage.Equals(other.SalesTaxPercentage)
                ) && 
                (
                    ShippingAndHandlingTaxed == other.ShippingAndHandlingTaxed ||
                    
                    ShippingAndHandlingTaxed.Equals(other.ShippingAndHandlingTaxed)
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
                    if (CountryCode != null)
                    hashCode = hashCode * 59 + CountryCode.GetHashCode();
                    if (SalesTaxJurisdictionId != null)
                    hashCode = hashCode * 59 + SalesTaxJurisdictionId.GetHashCode();
                    if (SalesTaxPercentage != null)
                    hashCode = hashCode * 59 + SalesTaxPercentage.GetHashCode();
                    
                    hashCode = hashCode * 59 + ShippingAndHandlingTaxed.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SalesTax left, SalesTax right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SalesTax left, SalesTax right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
