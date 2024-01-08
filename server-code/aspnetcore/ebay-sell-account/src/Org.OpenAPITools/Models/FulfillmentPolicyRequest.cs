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
    /// This root container defines a seller&#39;s fulfillment policy for a specific marketplace and category group. This type is used when creating or updating a fulfillment business policy.
    /// </summary>
    [DataContract]
    public partial class FulfillmentPolicyRequest : IEquatable<FulfillmentPolicyRequest>
    {
        /// <summary>
        /// This container is used to specify whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
        /// </summary>
        /// <value>This container is used to specify whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.</value>
        [DataMember(Name="categoryTypes", EmitDefaultValue=false)]
        public List<CategoryType> CategoryTypes { get; set; }

        /// <summary>
        /// A seller-defined description of the fulfillment policy. This description is only for the seller&#39;s use, and is not exposed on any eBay pages.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
        /// </summary>
        /// <value>A seller-defined description of the fulfillment policy. This description is only for the seller&#39;s use, and is not exposed on any eBay pages.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length&lt;/b&gt;: 250</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// This field is included and set to &lt;code&gt;true&lt;/code&gt; if freight shipping is available for the item. Freight shipping can be used for large items over 150 lbs.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default&lt;/b&gt;: false
        /// </summary>
        /// <value>This field is included and set to &lt;code&gt;true&lt;/code&gt; if freight shipping is available for the item. Freight shipping can be used for large items over 150 lbs.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default&lt;/b&gt;: false</value>
        [DataMember(Name="freightShipping", EmitDefaultValue=true)]
        public bool FreightShipping { get; set; }

        /// <summary>
        /// This field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller wants to use the Global Shipping Program for international shipments. See the &lt;a href&#x3D;\&quot;https://pages.ebay.com/help/sell/shipping-globally.html \&quot;&gt;Global Shipping Program&lt;/a&gt; help topic for more details and requirements on the Global Shipping Program.&lt;br/&gt;&lt;br/&gt;It is possible for a seller to use a combination of the Global Shipping Program and other international shipping services. &lt;br/&gt;&lt;br/&gt;If this value is set to &lt;code&gt;false&lt;/code&gt; or if the field is omitted, the seller is responsible for manually specifying individual international shipping services (if the seller ships internationally)., as described in &lt;a href&#x3D;\&quot;https://developer.ebay.com/api-docs/sell/static/seller-accounts/ht_shipping-worldwide.html \&quot;&gt;Setting up worldwide shipping&lt;/a&gt;. &lt;br/&gt;&lt;br/&gt;Sellers can opt in or out of the Global Shipping Program through the Shipping preferences in My eBay.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: On the US marketplace, the &lt;em&gt;&lt;b&gt;Global Shipping Program&lt;/b&gt;&lt;/em&gt; is scheduled to be replaced by a new intermediated international shipping program called &lt;em&gt;&lt;b&gt;eBay International Shipping&lt;/b&gt;&lt;/em&gt;. US sellers who are opted in to the Global Shipping Program will be automatically opted in to eBay International Shipping when it becomes available to them. All US sellers will be migrated by March 31, 2023. &lt;br /&gt;&lt;br /&gt;eBay International Shipping is an account level setting, and no field needs to be set in a Fulfillment business policy to enable it. As long as the US seller&#39;s account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. &lt;br /&gt;&lt;br /&gt;A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.&lt;/span&gt;&lt;p&gt;&lt;b&gt;Default&lt;/b&gt;: false&lt;/p&gt;
        /// </summary>
        /// <value>This field is included and set to &lt;code&gt;true&lt;/code&gt; if the seller wants to use the Global Shipping Program for international shipments. See the &lt;a href&#x3D;\&quot;https://pages.ebay.com/help/sell/shipping-globally.html \&quot;&gt;Global Shipping Program&lt;/a&gt; help topic for more details and requirements on the Global Shipping Program.&lt;br/&gt;&lt;br/&gt;It is possible for a seller to use a combination of the Global Shipping Program and other international shipping services. &lt;br/&gt;&lt;br/&gt;If this value is set to &lt;code&gt;false&lt;/code&gt; or if the field is omitted, the seller is responsible for manually specifying individual international shipping services (if the seller ships internationally)., as described in &lt;a href&#x3D;\&quot;https://developer.ebay.com/api-docs/sell/static/seller-accounts/ht_shipping-worldwide.html \&quot;&gt;Setting up worldwide shipping&lt;/a&gt;. &lt;br/&gt;&lt;br/&gt;Sellers can opt in or out of the Global Shipping Program through the Shipping preferences in My eBay.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: On the US marketplace, the &lt;em&gt;&lt;b&gt;Global Shipping Program&lt;/b&gt;&lt;/em&gt; is scheduled to be replaced by a new intermediated international shipping program called &lt;em&gt;&lt;b&gt;eBay International Shipping&lt;/b&gt;&lt;/em&gt;. US sellers who are opted in to the Global Shipping Program will be automatically opted in to eBay International Shipping when it becomes available to them. All US sellers will be migrated by March 31, 2023. &lt;br /&gt;&lt;br /&gt;eBay International Shipping is an account level setting, and no field needs to be set in a Fulfillment business policy to enable it. As long as the US seller&#39;s account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. &lt;br /&gt;&lt;br /&gt;A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.&lt;/span&gt;&lt;p&gt;&lt;b&gt;Default&lt;/b&gt;: false&lt;/p&gt;</value>
        [DataMember(Name="globalShipping", EmitDefaultValue=true)]
        public bool GlobalShipping { get; set; }

        /// <summary>
        /// Gets or Sets HandlingTime
        /// </summary>
        [DataMember(Name="handlingTime", EmitDefaultValue=false)]
        public TimeDuration HandlingTime { get; set; }

        /// <summary>
        /// This field should be included and set to &lt;code&gt;true&lt;/code&gt; if local pickup is one of the fulfillment options available to the buyer. It is possible for the seller to make local pickup and some shipping service options available to the buyer.&lt;br/&gt;&lt;br/&gt;With local pickup, the buyer and seller make arrangements for pickup time and location.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default&lt;/b&gt;: &lt;code&gt;false&lt;/code&gt;
        /// </summary>
        /// <value>This field should be included and set to &lt;code&gt;true&lt;/code&gt; if local pickup is one of the fulfillment options available to the buyer. It is possible for the seller to make local pickup and some shipping service options available to the buyer.&lt;br/&gt;&lt;br/&gt;With local pickup, the buyer and seller make arrangements for pickup time and location.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default&lt;/b&gt;: &lt;code&gt;false&lt;/code&gt;</value>
        [DataMember(Name="localPickup", EmitDefaultValue=true)]
        public bool LocalPickup { get; set; }

        /// <summary>
        /// The ID of the eBay marketplace to which this fulfillment policy applies. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&#39;&gt;eBay API documentation&lt;/a&gt;
        /// </summary>
        /// <value>The ID of the eBay marketplace to which this fulfillment policy applies. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&#39;&gt;eBay API documentation&lt;/a&gt;</value>
        [DataMember(Name="marketplaceId", EmitDefaultValue=false)]
        public string MarketplaceId { get; set; }

        /// <summary>
        /// A seller-defined name for this fulfillment policy. Names must be unique for policies assigned to the same marketplace. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length&lt;/b&gt;: 64
        /// </summary>
        /// <value>A seller-defined name for this fulfillment policy. Names must be unique for policies assigned to the same marketplace. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length&lt;/b&gt;: 64</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// This field should be included and set to &lt;code&gt;true&lt;/code&gt; if the seller offers the \&quot;Click and Collect\&quot; feature for an item. &lt;p&gt;To enable \&quot;Click and Collect\&quot; on a listing, a seller must be eligible for Click and Collect. Currently, Click and Collect is available to only large retail merchants selling in the eBay AU and UK marketplaces.&lt;/p&gt;  &lt;p&gt;In addition to setting this field to &lt;code&gt;true&lt;/code&gt;, the merchant must also do the following to enable the \&quot;Click and Collect\&quot; option on a listing: &lt;ul&gt;&lt;li&gt;Have inventory for the product at one or more physical stores tied to the merchant&#39;s account. &lt;p&gt;Sellers can use the &lt;b&gt;createInventoryLocaion&lt;/b&gt; method in the Inventory API to associate physical stores to their account and they can then can add inventory to specific store locations.&lt;/p&gt;&lt;/li&gt;&lt;li&gt;Set an immediate payment requirement on the item. The immediate payment feature requires the seller to: &lt;ul&gt;&lt;li&gt;Set the &lt;b&gt;immediatePay&lt;/b&gt; flag in the payment policy to &#39;true&#39;.&lt;/li&gt;&lt;li&gt;Have a valid store location with a complete street address.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;When a merchant successfully lists an item with Click and Collect, prospective buyers within a reasonable distance from one of the merchant&#39;s stores (that has stock available) will see the \&quot;Available for Click and Collect\&quot; option on the listing, along with information on the closest store that has the item.&lt;/p&gt;&lt;b&gt;Default&lt;/b&gt;: false
        /// </summary>
        /// <value>This field should be included and set to &lt;code&gt;true&lt;/code&gt; if the seller offers the \&quot;Click and Collect\&quot; feature for an item. &lt;p&gt;To enable \&quot;Click and Collect\&quot; on a listing, a seller must be eligible for Click and Collect. Currently, Click and Collect is available to only large retail merchants selling in the eBay AU and UK marketplaces.&lt;/p&gt;  &lt;p&gt;In addition to setting this field to &lt;code&gt;true&lt;/code&gt;, the merchant must also do the following to enable the \&quot;Click and Collect\&quot; option on a listing: &lt;ul&gt;&lt;li&gt;Have inventory for the product at one or more physical stores tied to the merchant&#39;s account. &lt;p&gt;Sellers can use the &lt;b&gt;createInventoryLocaion&lt;/b&gt; method in the Inventory API to associate physical stores to their account and they can then can add inventory to specific store locations.&lt;/p&gt;&lt;/li&gt;&lt;li&gt;Set an immediate payment requirement on the item. The immediate payment feature requires the seller to: &lt;ul&gt;&lt;li&gt;Set the &lt;b&gt;immediatePay&lt;/b&gt; flag in the payment policy to &#39;true&#39;.&lt;/li&gt;&lt;li&gt;Have a valid store location with a complete street address.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;When a merchant successfully lists an item with Click and Collect, prospective buyers within a reasonable distance from one of the merchant&#39;s stores (that has stock available) will see the \&quot;Available for Click and Collect\&quot; option on the listing, along with information on the closest store that has the item.&lt;/p&gt;&lt;b&gt;Default&lt;/b&gt;: false</value>
        [DataMember(Name="pickupDropOff", EmitDefaultValue=true)]
        public bool PickupDropOff { get; set; }

        /// <summary>
        /// Gets or Sets ShipToLocations
        /// </summary>
        [DataMember(Name="shipToLocations", EmitDefaultValue=false)]
        public RegionSet ShipToLocations { get; set; }

        /// <summary>
        /// This array is used to provide detailed information on the domestic and international shipping options available for the policy. &lt;br /&gt;&lt;br /&gt;A separate &lt;b&gt;ShippingOption&lt;/b&gt; object is required for domestic shipping service options and for international shipping service options (if the seller ships to international locations). &lt;ul&gt;&lt;li&gt;The &lt;b&gt;optionType&lt;/b&gt; field is used to indicate whether the &lt;b&gt;ShippingOption&lt;/b&gt; object applies to domestic or international shipping, and the &lt;b&gt;costType&lt;/b&gt; field is used to indicate whether flat-rate shipping or calculated shipping will be used.&lt;/li&gt; &lt;li&gt;The &lt;b&gt;rateTableId&lt;/b&gt; field can be used to associate a defined shipping rate table to the policy, and the &lt;b&gt;packageHandlingCost&lt;/b&gt; container can be used to set a handling charge for the policy.&lt;/li&gt;&lt;/ul&gt; &lt;p&gt;A separate &lt;b&gt;ShippingServices&lt;/b&gt; object will be used to specify cost and other details for every available domestic and international shipping service option. &lt;/p&gt;
        /// </summary>
        /// <value>This array is used to provide detailed information on the domestic and international shipping options available for the policy. &lt;br /&gt;&lt;br /&gt;A separate &lt;b&gt;ShippingOption&lt;/b&gt; object is required for domestic shipping service options and for international shipping service options (if the seller ships to international locations). &lt;ul&gt;&lt;li&gt;The &lt;b&gt;optionType&lt;/b&gt; field is used to indicate whether the &lt;b&gt;ShippingOption&lt;/b&gt; object applies to domestic or international shipping, and the &lt;b&gt;costType&lt;/b&gt; field is used to indicate whether flat-rate shipping or calculated shipping will be used.&lt;/li&gt; &lt;li&gt;The &lt;b&gt;rateTableId&lt;/b&gt; field can be used to associate a defined shipping rate table to the policy, and the &lt;b&gt;packageHandlingCost&lt;/b&gt; container can be used to set a handling charge for the policy.&lt;/li&gt;&lt;/ul&gt; &lt;p&gt;A separate &lt;b&gt;ShippingServices&lt;/b&gt; object will be used to specify cost and other details for every available domestic and international shipping service option. &lt;/p&gt;</value>
        [DataMember(Name="shippingOptions", EmitDefaultValue=false)]
        public List<ShippingOption> ShippingOptions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FulfillmentPolicyRequest {\n");
            sb.Append("  CategoryTypes: ").Append(CategoryTypes).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  FreightShipping: ").Append(FreightShipping).Append("\n");
            sb.Append("  GlobalShipping: ").Append(GlobalShipping).Append("\n");
            sb.Append("  HandlingTime: ").Append(HandlingTime).Append("\n");
            sb.Append("  LocalPickup: ").Append(LocalPickup).Append("\n");
            sb.Append("  MarketplaceId: ").Append(MarketplaceId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  PickupDropOff: ").Append(PickupDropOff).Append("\n");
            sb.Append("  ShipToLocations: ").Append(ShipToLocations).Append("\n");
            sb.Append("  ShippingOptions: ").Append(ShippingOptions).Append("\n");
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
            return obj.GetType() == GetType() && Equals((FulfillmentPolicyRequest)obj);
        }

        /// <summary>
        /// Returns true if FulfillmentPolicyRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of FulfillmentPolicyRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FulfillmentPolicyRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CategoryTypes == other.CategoryTypes ||
                    CategoryTypes != null &&
                    other.CategoryTypes != null &&
                    CategoryTypes.SequenceEqual(other.CategoryTypes)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    FreightShipping == other.FreightShipping ||
                    
                    FreightShipping.Equals(other.FreightShipping)
                ) && 
                (
                    GlobalShipping == other.GlobalShipping ||
                    
                    GlobalShipping.Equals(other.GlobalShipping)
                ) && 
                (
                    HandlingTime == other.HandlingTime ||
                    HandlingTime != null &&
                    HandlingTime.Equals(other.HandlingTime)
                ) && 
                (
                    LocalPickup == other.LocalPickup ||
                    
                    LocalPickup.Equals(other.LocalPickup)
                ) && 
                (
                    MarketplaceId == other.MarketplaceId ||
                    MarketplaceId != null &&
                    MarketplaceId.Equals(other.MarketplaceId)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    PickupDropOff == other.PickupDropOff ||
                    
                    PickupDropOff.Equals(other.PickupDropOff)
                ) && 
                (
                    ShipToLocations == other.ShipToLocations ||
                    ShipToLocations != null &&
                    ShipToLocations.Equals(other.ShipToLocations)
                ) && 
                (
                    ShippingOptions == other.ShippingOptions ||
                    ShippingOptions != null &&
                    other.ShippingOptions != null &&
                    ShippingOptions.SequenceEqual(other.ShippingOptions)
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
                    if (CategoryTypes != null)
                    hashCode = hashCode * 59 + CategoryTypes.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    
                    hashCode = hashCode * 59 + FreightShipping.GetHashCode();
                    
                    hashCode = hashCode * 59 + GlobalShipping.GetHashCode();
                    if (HandlingTime != null)
                    hashCode = hashCode * 59 + HandlingTime.GetHashCode();
                    
                    hashCode = hashCode * 59 + LocalPickup.GetHashCode();
                    if (MarketplaceId != null)
                    hashCode = hashCode * 59 + MarketplaceId.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + PickupDropOff.GetHashCode();
                    if (ShipToLocations != null)
                    hashCode = hashCode * 59 + ShipToLocations.GetHashCode();
                    if (ShippingOptions != null)
                    hashCode = hashCode * 59 + ShippingOptions.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(FulfillmentPolicyRequest left, FulfillmentPolicyRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FulfillmentPolicyRequest left, FulfillmentPolicyRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
