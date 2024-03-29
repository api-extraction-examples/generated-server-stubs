/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// FulfillmentPolicyRequest - This root container defines a seller's fulfillment policy for a specific marketplace and category group. This type is used when creating or updating a fulfillment business policy.
type FulfillmentPolicyRequest struct {

	// This container is used to specify whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
	CategoryTypes []CategoryType `json:"categoryTypes,omitempty"`

	// A seller-defined description of the fulfillment policy. This description is only for the seller's use, and is not exposed on any eBay pages.  <br/><br/><b>Max length</b>: 250
	Description string `json:"description,omitempty"`

	// This field is included and set to <code>true</code> if freight shipping is available for the item. Freight shipping can be used for large items over 150 lbs.<br/><br/><b>Default</b>: false
	FreightShipping bool `json:"freightShipping,omitempty"`

	// This field is included and set to <code>true</code> if the seller wants to use the Global Shipping Program for international shipments. See the <a href=\"https://pages.ebay.com/help/sell/shipping-globally.html \">Global Shipping Program</a> help topic for more details and requirements on the Global Shipping Program.<br/><br/>It is possible for a seller to use a combination of the Global Shipping Program and other international shipping services. <br/><br/>If this value is set to <code>false</code> or if the field is omitted, the seller is responsible for manually specifying individual international shipping services (if the seller ships internationally)., as described in <a href=\"https://developer.ebay.com/api-docs/sell/static/seller-accounts/ht_shipping-worldwide.html \">Setting up worldwide shipping</a>. <br/><br/>Sellers can opt in or out of the Global Shipping Program through the Shipping preferences in My eBay.<br /><br /><span class=\"tablenote\"><b>Note</b>: On the US marketplace, the <em><b>Global Shipping Program</b></em> is scheduled to be replaced by a new intermediated international shipping program called <em><b>eBay International Shipping</b></em>. US sellers who are opted in to the Global Shipping Program will be automatically opted in to eBay International Shipping when it becomes available to them. All US sellers will be migrated by March 31, 2023. <br /><br />eBay International Shipping is an account level setting, and no field needs to be set in a Fulfillment business policy to enable it. As long as the US seller's account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. <br /><br />A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.</span><p><b>Default</b>: false</p>
	GlobalShipping bool `json:"globalShipping,omitempty"`

	HandlingTime TimeDuration `json:"handlingTime,omitempty"`

	// This field should be included and set to <code>true</code> if local pickup is one of the fulfillment options available to the buyer. It is possible for the seller to make local pickup and some shipping service options available to the buyer.<br/><br/>With local pickup, the buyer and seller make arrangements for pickup time and location.<br/><br/><b>Default</b>: <code>false</code>
	LocalPickup bool `json:"localPickup,omitempty"`

	// The ID of the eBay marketplace to which this fulfillment policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>
	MarketplaceId string `json:"marketplaceId,omitempty"`

	// A seller-defined name for this fulfillment policy. Names must be unique for policies assigned to the same marketplace. <br/><br/><b>Max length</b>: 64
	Name string `json:"name,omitempty"`

	// This field should be included and set to <code>true</code> if the seller offers the \"Click and Collect\" feature for an item. <p>To enable \"Click and Collect\" on a listing, a seller must be eligible for Click and Collect. Currently, Click and Collect is available to only large retail merchants selling in the eBay AU and UK marketplaces.</p>  <p>In addition to setting this field to <code>true</code>, the merchant must also do the following to enable the \"Click and Collect\" option on a listing: <ul><li>Have inventory for the product at one or more physical stores tied to the merchant's account. <p>Sellers can use the <b>createInventoryLocaion</b> method in the Inventory API to associate physical stores to their account and they can then can add inventory to specific store locations.</p></li><li>Set an immediate payment requirement on the item. The immediate payment feature requires the seller to: <ul><li>Set the <b>immediatePay</b> flag in the payment policy to 'true'.</li><li>Have a valid store location with a complete street address.</li></ul></li></ul><p>When a merchant successfully lists an item with Click and Collect, prospective buyers within a reasonable distance from one of the merchant's stores (that has stock available) will see the \"Available for Click and Collect\" option on the listing, along with information on the closest store that has the item.</p><b>Default</b>: false
	PickupDropOff bool `json:"pickupDropOff,omitempty"`

	ShipToLocations RegionSet `json:"shipToLocations,omitempty"`

	// This array is used to provide detailed information on the domestic and international shipping options available for the policy. <br /><br />A separate <b>ShippingOption</b> object is required for domestic shipping service options and for international shipping service options (if the seller ships to international locations). <ul><li>The <b>optionType</b> field is used to indicate whether the <b>ShippingOption</b> object applies to domestic or international shipping, and the <b>costType</b> field is used to indicate whether flat-rate shipping or calculated shipping will be used.</li> <li>The <b>rateTableId</b> field can be used to associate a defined shipping rate table to the policy, and the <b>packageHandlingCost</b> container can be used to set a handling charge for the policy.</li></ul> <p>A separate <b>ShippingServices</b> object will be used to specify cost and other details for every available domestic and international shipping service option. </p>
	ShippingOptions []ShippingOption `json:"shippingOptions,omitempty"`
}

// AssertFulfillmentPolicyRequestRequired checks if the required fields are not zero-ed
func AssertFulfillmentPolicyRequestRequired(obj FulfillmentPolicyRequest) error {
	for _, el := range obj.CategoryTypes {
		if err := AssertCategoryTypeRequired(el); err != nil {
			return err
		}
	}
	if err := AssertTimeDurationRequired(obj.HandlingTime); err != nil {
		return err
	}
	if err := AssertRegionSetRequired(obj.ShipToLocations); err != nil {
		return err
	}
	for _, el := range obj.ShippingOptions {
		if err := AssertShippingOptionRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertFulfillmentPolicyRequestConstraints checks if the values respects the defined constraints
func AssertFulfillmentPolicyRequestConstraints(obj FulfillmentPolicyRequest) error {
	return nil
}
