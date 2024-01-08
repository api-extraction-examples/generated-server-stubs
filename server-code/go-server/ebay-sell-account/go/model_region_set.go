/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// RegionSet - This type consists of the <b>regionIncluded</b> and <b>regionExcluded</b> arrays, which indicate the areas to where the seller does and doesn't ship.
type RegionSet struct {

	// An array of one or more <b>regionName</b> values that specify the areas to where a seller does not ship. A <b>regionExcluded</b> list should only be set in the top-level <b>shipToLocations</b> container and not within the <b>shippingServices.shipToLocations</b> container used to specify which shipping regions are serviced by each available shipping service option. <p>Many sellers are willing to ship to many international locations, but they may want to exclude some world regions or some countries as places they are willing to ship to.<br/><br/>This array will be returned as empty if no shipping regions are excluded with the fulfillment business policy.<br /> <br /><span class=\"tablenote\"><b>Note: </b> The <b>regionExcluded</b> array is not applicable for motor vehicle business policies on the US, CA, or UK marketplaces. If this array is used in a <b>createFulfillmentPolicy</b> or <b>updateFulfillmentPolicy</b> request, it will be ignored.</span>
	RegionExcluded []Region `json:"regionExcluded,omitempty"`

	// An array of one or more <b>regionName</b> fields that specify the areas to where a seller ships. <br />Each eBay marketplace supports its own set of allowable shipping locations.<br /> <br /><span class=\"tablenote\"><b>Note: </b> The <b>regionIncluded</b> array is not applicable for motor vehicle business policies on the US, CA, or UK marketplaces. If this array is used in a <b>createFulfillmentPolicy</b> or <b>updateFulfillmentPolicy</b> request, it will be ignored.</span>
	RegionIncluded []Region `json:"regionIncluded,omitempty"`
}

// AssertRegionSetRequired checks if the required fields are not zero-ed
func AssertRegionSetRequired(obj RegionSet) error {
	for _, el := range obj.RegionExcluded {
		if err := AssertRegionRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.RegionIncluded {
		if err := AssertRegionRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertRegionSetConstraints checks if the values respects the defined constraints
func AssertRegionSetConstraints(obj RegionSet) error {
	return nil
}
