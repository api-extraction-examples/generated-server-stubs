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
    /// This type is used by the &lt;b&gt;shippingServices&lt;/b&gt; array, an array that provides details about every domestic and international shipping service option that is defined for the policy.
    /// </summary>
    [DataContract]
    public partial class ShippingService : IEquatable<ShippingService>
    {
        /// <summary>
        /// Gets or Sets AdditionalShippingCost
        /// </summary>
        [DataMember(Name="additionalShippingCost", EmitDefaultValue=false)]
        public Amount AdditionalShippingCost { get; set; }

        /// <summary>
        /// This field should be included and set to &lt;code&gt;true&lt;/code&gt; for a motor vehicle listing if it will be the buyer&#39;s responsibility to pick up the purchased motor vehicle after full payment is made. &lt;br /&gt;&lt;br /&gt;This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. &lt;br/&gt;&lt;br/&gt;This field is returned if set.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default&lt;/b&gt;: false
        /// </summary>
        /// <value>This field should be included and set to &lt;code&gt;true&lt;/code&gt; for a motor vehicle listing if it will be the buyer&#39;s responsibility to pick up the purchased motor vehicle after full payment is made. &lt;br /&gt;&lt;br /&gt;This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. &lt;br/&gt;&lt;br/&gt;This field is returned if set.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default&lt;/b&gt;: false</value>
        [DataMember(Name="buyerResponsibleForPickup", EmitDefaultValue=true)]
        public bool BuyerResponsibleForPickup { get; set; }

        /// <summary>
        /// This field should be included and set to &lt;code&gt;true&lt;/code&gt; for a motor vehicle listing if it will be the buyer&#39;s responsibility to arrange for shipment of a purchased motor vehicle after full payment is made. &lt;br /&gt;&lt;br /&gt;This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. &lt;br/&gt;&lt;br/&gt;This field is returned if set.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default&lt;/b&gt;: false
        /// </summary>
        /// <value>This field should be included and set to &lt;code&gt;true&lt;/code&gt; for a motor vehicle listing if it will be the buyer&#39;s responsibility to arrange for shipment of a purchased motor vehicle after full payment is made. &lt;br /&gt;&lt;br /&gt;This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. &lt;br/&gt;&lt;br/&gt;This field is returned if set.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default&lt;/b&gt;: false</value>
        [DataMember(Name="buyerResponsibleForShipping", EmitDefaultValue=true)]
        public bool BuyerResponsibleForShipping { get; set; }

        /// <summary>
        /// Gets or Sets CashOnDeliveryFee
        /// </summary>
        [DataMember(Name="cashOnDeliveryFee", EmitDefaultValue=false)]
        public Amount CashOnDeliveryFee { get; set; }

        /// <summary>
        /// This field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller offers a free shipping option to the buyer. &lt;br /&gt;&lt;br /&gt;This field can only be included and set to &lt;code&gt;true&lt;/code&gt; for the first domestic shipping service option specified in the &lt;b&gt;shippingServices&lt;/b&gt; container (it is ignored if set for subsequent shipping services or for any international shipping service option). &lt;br /&gt;&lt;br /&gt;The first specified shipping service option has a &lt;b&gt;sortOrder&lt;/b&gt; value of &lt;code&gt;1&lt;/code&gt; or if the &lt;b&gt;sortOrderId&lt;/b&gt; field is not used, it is the shipping service option that&#39;s specified first in the &lt;b&gt;shippingServices&lt;/b&gt; container.&lt;br/&gt;&lt;br/&gt;This container is returned if set.
        /// </summary>
        /// <value>This field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller offers a free shipping option to the buyer. &lt;br /&gt;&lt;br /&gt;This field can only be included and set to &lt;code&gt;true&lt;/code&gt; for the first domestic shipping service option specified in the &lt;b&gt;shippingServices&lt;/b&gt; container (it is ignored if set for subsequent shipping services or for any international shipping service option). &lt;br /&gt;&lt;br /&gt;The first specified shipping service option has a &lt;b&gt;sortOrder&lt;/b&gt; value of &lt;code&gt;1&lt;/code&gt; or if the &lt;b&gt;sortOrderId&lt;/b&gt; field is not used, it is the shipping service option that&#39;s specified first in the &lt;b&gt;shippingServices&lt;/b&gt; container.&lt;br/&gt;&lt;br/&gt;This container is returned if set.</value>
        [DataMember(Name="freeShipping", EmitDefaultValue=true)]
        public bool FreeShipping { get; set; }

        /// <summary>
        /// Gets or Sets ShipToLocations
        /// </summary>
        [DataMember(Name="shipToLocations", EmitDefaultValue=false)]
        public RegionSet ShipToLocations { get; set; }

        /// <summary>
        /// This field sets/indicates the shipping carrier, such as &lt;code&gt;USPS&lt;/code&gt;, &lt;code&gt;FedEx&lt;/code&gt;, or &lt;code&gt;UPS&lt;/code&gt;. Although this field uses the &lt;b&gt;string&lt;/b&gt; type, the seller must pass in a pre-defined enumeration value here. &lt;br /&gt;&lt;br /&gt;For a full list of shipping carrier enum values for a specified eBay marketplace, the &lt;b&gt;GeteBayDetails&lt;/b&gt; call of the &lt;b&gt;Trading API&lt;/b&gt; can be used, and the &lt;b&gt;DetailName&lt;/b&gt; field&#39;s value should be set to &lt;code&gt;ShippingCarrierDetails&lt;/code&gt;. The enum values for each shipping carriers can be found in each &lt;b&gt;ShippingCarrierDetails.ShippingCarrier&lt;/b&gt; field in the response payload.&lt;br/&gt;&lt;br/&gt; This field is actually optional, as the shipping carrier is also tied into the &lt;b&gt;shippingServiceCode&lt;/b&gt; enum value, and that field is required for every specified shipping service option.&lt;br/&gt;&lt;br/&gt;This field is returned if set.
        /// </summary>
        /// <value>This field sets/indicates the shipping carrier, such as &lt;code&gt;USPS&lt;/code&gt;, &lt;code&gt;FedEx&lt;/code&gt;, or &lt;code&gt;UPS&lt;/code&gt;. Although this field uses the &lt;b&gt;string&lt;/b&gt; type, the seller must pass in a pre-defined enumeration value here. &lt;br /&gt;&lt;br /&gt;For a full list of shipping carrier enum values for a specified eBay marketplace, the &lt;b&gt;GeteBayDetails&lt;/b&gt; call of the &lt;b&gt;Trading API&lt;/b&gt; can be used, and the &lt;b&gt;DetailName&lt;/b&gt; field&#39;s value should be set to &lt;code&gt;ShippingCarrierDetails&lt;/code&gt;. The enum values for each shipping carriers can be found in each &lt;b&gt;ShippingCarrierDetails.ShippingCarrier&lt;/b&gt; field in the response payload.&lt;br/&gt;&lt;br/&gt; This field is actually optional, as the shipping carrier is also tied into the &lt;b&gt;shippingServiceCode&lt;/b&gt; enum value, and that field is required for every specified shipping service option.&lt;br/&gt;&lt;br/&gt;This field is returned if set.</value>
        [DataMember(Name="shippingCarrierCode", EmitDefaultValue=false)]
        public string ShippingCarrierCode { get; set; }

        /// <summary>
        /// Gets or Sets ShippingCost
        /// </summary>
        [DataMember(Name="shippingCost", EmitDefaultValue=false)]
        public Amount ShippingCost { get; set; }

        /// <summary>
        /// This field sets/indicates the domestic or international shipping service option, such as &lt;code&gt;USPSPriority&lt;/code&gt;, &lt;code&gt;FedEx2Day&lt;/code&gt;, or &lt;code&gt;UPS3rdDay&lt;/code&gt;. Although this field uses the &lt;b&gt;string&lt;/b&gt; type, the seller must pass in a pre-defined enumeration value here. &lt;br /&gt;&lt;br /&gt;For a full list of shipping service option enum values for a specified eBay marketplace, the &lt;b&gt;GeteBayDetails&lt;/b&gt; call of the &lt;b&gt;Trading API&lt;/b&gt; can be used, and the &lt;b&gt;DetailName&lt;/b&gt; field&#39;s value should be set to &lt;code&gt;ShippingServiceDetails&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt;The enum values for each shipping service option can be found in each &lt;b&gt;ShippingServiceDetails.ShippingService&lt;/b&gt; field in the response payload. The seller must make sure that the shipping service option is still valid, which is indicated by a &lt;code&gt;true&lt;/code&gt; value in the corresponding &lt;b&gt;ValidForSellingFlow&lt;/b&gt; boolean field. International shipping service options are typically returned at the top of the response payload, and are indicated by an &lt;b&gt;InternationalService&lt;/b&gt; boolean field that reads &lt;code&gt;true&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt;The &lt;b&gt;InternationalService&lt;/b&gt; boolean field is not returned at all for domestic shipping service options. &lt;br/&gt;&lt;br/&gt; This field is required for every specified shipping service option.&lt;br/&gt;&lt;br/&gt;This field is returned if set.
        /// </summary>
        /// <value>This field sets/indicates the domestic or international shipping service option, such as &lt;code&gt;USPSPriority&lt;/code&gt;, &lt;code&gt;FedEx2Day&lt;/code&gt;, or &lt;code&gt;UPS3rdDay&lt;/code&gt;. Although this field uses the &lt;b&gt;string&lt;/b&gt; type, the seller must pass in a pre-defined enumeration value here. &lt;br /&gt;&lt;br /&gt;For a full list of shipping service option enum values for a specified eBay marketplace, the &lt;b&gt;GeteBayDetails&lt;/b&gt; call of the &lt;b&gt;Trading API&lt;/b&gt; can be used, and the &lt;b&gt;DetailName&lt;/b&gt; field&#39;s value should be set to &lt;code&gt;ShippingServiceDetails&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt;The enum values for each shipping service option can be found in each &lt;b&gt;ShippingServiceDetails.ShippingService&lt;/b&gt; field in the response payload. The seller must make sure that the shipping service option is still valid, which is indicated by a &lt;code&gt;true&lt;/code&gt; value in the corresponding &lt;b&gt;ValidForSellingFlow&lt;/b&gt; boolean field. International shipping service options are typically returned at the top of the response payload, and are indicated by an &lt;b&gt;InternationalService&lt;/b&gt; boolean field that reads &lt;code&gt;true&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt;The &lt;b&gt;InternationalService&lt;/b&gt; boolean field is not returned at all for domestic shipping service options. &lt;br/&gt;&lt;br/&gt; This field is required for every specified shipping service option.&lt;br/&gt;&lt;br/&gt;This field is returned if set.</value>
        [DataMember(Name="shippingServiceCode", EmitDefaultValue=false)]
        public string ShippingServiceCode { get; set; }

        /// <summary>
        /// The integer value set in this field controls the order of the corresponding domestic or international shipping service option in the View Item and Checkout pages. &lt;br/&gt;&lt;br/&gt;Sellers can specify up to four domestic shipping services (in four separate &lt;b&gt;shippingService&lt;/b&gt; containers), so valid values are 1, 2, 3, and 4. A shipping service option with a &lt;b&gt;sortOrder&lt;/b&gt; value of &lt;code&gt;1&lt;/code&gt; appears at the top of View Item and Checkout pages. Conversely, a shipping service option with a &lt;b&gt;sortOrder&lt;/b&gt; value of &lt;code&gt;1&lt;/code&gt; appears at the bottom of the list. &lt;br/&gt;&lt;br/&gt;Sellers can specify up to five international shipping services (in five separate &lt;b&gt;shippingService&lt;/b&gt; containers), so valid values for international shipping services are 1, 2, 3, 4, and 5. Similarly to domestic shipping service options, the &lt;b&gt;sortOrder&lt;/b&gt; value of a international shipping service option controls the placement of that shipping service option in the View Item and Checkout pages. &lt;br/&gt;&lt;br/&gt;If the &lt;b&gt;sortOrder&lt;/b&gt; field is not supplied, the order of domestic and international shipping service options is determined by the order in which they are listed in the API call. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Min&lt;/b&gt;: 1. &lt;b&gt;Max&lt;/b&gt;: 4 (for domestic shipping service) or 5 (for international shipping service).
        /// </summary>
        /// <value>The integer value set in this field controls the order of the corresponding domestic or international shipping service option in the View Item and Checkout pages. &lt;br/&gt;&lt;br/&gt;Sellers can specify up to four domestic shipping services (in four separate &lt;b&gt;shippingService&lt;/b&gt; containers), so valid values are 1, 2, 3, and 4. A shipping service option with a &lt;b&gt;sortOrder&lt;/b&gt; value of &lt;code&gt;1&lt;/code&gt; appears at the top of View Item and Checkout pages. Conversely, a shipping service option with a &lt;b&gt;sortOrder&lt;/b&gt; value of &lt;code&gt;1&lt;/code&gt; appears at the bottom of the list. &lt;br/&gt;&lt;br/&gt;Sellers can specify up to five international shipping services (in five separate &lt;b&gt;shippingService&lt;/b&gt; containers), so valid values for international shipping services are 1, 2, 3, 4, and 5. Similarly to domestic shipping service options, the &lt;b&gt;sortOrder&lt;/b&gt; value of a international shipping service option controls the placement of that shipping service option in the View Item and Checkout pages. &lt;br/&gt;&lt;br/&gt;If the &lt;b&gt;sortOrder&lt;/b&gt; field is not supplied, the order of domestic and international shipping service options is determined by the order in which they are listed in the API call. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Min&lt;/b&gt;: 1. &lt;b&gt;Max&lt;/b&gt;: 4 (for domestic shipping service) or 5 (for international shipping service).</value>
        [DataMember(Name="sortOrder", EmitDefaultValue=true)]
        public int SortOrder { get; set; }

        /// <summary>
        /// Gets or Sets Surcharge
        /// </summary>
        [DataMember(Name="surcharge", EmitDefaultValue=false)]
        public Amount Surcharge { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ShippingService {\n");
            sb.Append("  AdditionalShippingCost: ").Append(AdditionalShippingCost).Append("\n");
            sb.Append("  BuyerResponsibleForPickup: ").Append(BuyerResponsibleForPickup).Append("\n");
            sb.Append("  BuyerResponsibleForShipping: ").Append(BuyerResponsibleForShipping).Append("\n");
            sb.Append("  CashOnDeliveryFee: ").Append(CashOnDeliveryFee).Append("\n");
            sb.Append("  FreeShipping: ").Append(FreeShipping).Append("\n");
            sb.Append("  ShipToLocations: ").Append(ShipToLocations).Append("\n");
            sb.Append("  ShippingCarrierCode: ").Append(ShippingCarrierCode).Append("\n");
            sb.Append("  ShippingCost: ").Append(ShippingCost).Append("\n");
            sb.Append("  ShippingServiceCode: ").Append(ShippingServiceCode).Append("\n");
            sb.Append("  SortOrder: ").Append(SortOrder).Append("\n");
            sb.Append("  Surcharge: ").Append(Surcharge).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ShippingService)obj);
        }

        /// <summary>
        /// Returns true if ShippingService instances are equal
        /// </summary>
        /// <param name="other">Instance of ShippingService to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ShippingService other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AdditionalShippingCost == other.AdditionalShippingCost ||
                    AdditionalShippingCost != null &&
                    AdditionalShippingCost.Equals(other.AdditionalShippingCost)
                ) && 
                (
                    BuyerResponsibleForPickup == other.BuyerResponsibleForPickup ||
                    
                    BuyerResponsibleForPickup.Equals(other.BuyerResponsibleForPickup)
                ) && 
                (
                    BuyerResponsibleForShipping == other.BuyerResponsibleForShipping ||
                    
                    BuyerResponsibleForShipping.Equals(other.BuyerResponsibleForShipping)
                ) && 
                (
                    CashOnDeliveryFee == other.CashOnDeliveryFee ||
                    CashOnDeliveryFee != null &&
                    CashOnDeliveryFee.Equals(other.CashOnDeliveryFee)
                ) && 
                (
                    FreeShipping == other.FreeShipping ||
                    
                    FreeShipping.Equals(other.FreeShipping)
                ) && 
                (
                    ShipToLocations == other.ShipToLocations ||
                    ShipToLocations != null &&
                    ShipToLocations.Equals(other.ShipToLocations)
                ) && 
                (
                    ShippingCarrierCode == other.ShippingCarrierCode ||
                    ShippingCarrierCode != null &&
                    ShippingCarrierCode.Equals(other.ShippingCarrierCode)
                ) && 
                (
                    ShippingCost == other.ShippingCost ||
                    ShippingCost != null &&
                    ShippingCost.Equals(other.ShippingCost)
                ) && 
                (
                    ShippingServiceCode == other.ShippingServiceCode ||
                    ShippingServiceCode != null &&
                    ShippingServiceCode.Equals(other.ShippingServiceCode)
                ) && 
                (
                    SortOrder == other.SortOrder ||
                    
                    SortOrder.Equals(other.SortOrder)
                ) && 
                (
                    Surcharge == other.Surcharge ||
                    Surcharge != null &&
                    Surcharge.Equals(other.Surcharge)
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
                    if (AdditionalShippingCost != null)
                    hashCode = hashCode * 59 + AdditionalShippingCost.GetHashCode();
                    
                    hashCode = hashCode * 59 + BuyerResponsibleForPickup.GetHashCode();
                    
                    hashCode = hashCode * 59 + BuyerResponsibleForShipping.GetHashCode();
                    if (CashOnDeliveryFee != null)
                    hashCode = hashCode * 59 + CashOnDeliveryFee.GetHashCode();
                    
                    hashCode = hashCode * 59 + FreeShipping.GetHashCode();
                    if (ShipToLocations != null)
                    hashCode = hashCode * 59 + ShipToLocations.GetHashCode();
                    if (ShippingCarrierCode != null)
                    hashCode = hashCode * 59 + ShippingCarrierCode.GetHashCode();
                    if (ShippingCost != null)
                    hashCode = hashCode * 59 + ShippingCost.GetHashCode();
                    if (ShippingServiceCode != null)
                    hashCode = hashCode * 59 + ShippingServiceCode.GetHashCode();
                    
                    hashCode = hashCode * 59 + SortOrder.GetHashCode();
                    if (Surcharge != null)
                    hashCode = hashCode * 59 + Surcharge.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ShippingService left, ShippingService right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ShippingService left, ShippingService right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
