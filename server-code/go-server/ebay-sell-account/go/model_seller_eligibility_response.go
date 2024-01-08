/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// SellerEligibilityResponse - A type that is used to provide the seller's eligibility status for an eBay advertising program.
type SellerEligibilityResponse struct {

	// The eBay advertising program for which a seller may be eligible. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/plser:AdvertisingProgramEnum'>eBay API documentation</a>
	ProgramType string `json:"programType,omitempty"`

	// The reason why a seller is ineligible for the specified eBay advertising program.<br /><br />This field is only returned if the seller is ineligible for the eBay advertising program. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/plser:SellerIneligibleReasonEnum'>eBay API documentation</a>
	Reason string `json:"reason,omitempty"`

	// The seller elibibilty status for the specified eBay advertising program. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/cmlib:SellerEligibilityEnum'>eBay API documentation</a>
	Status string `json:"status,omitempty"`
}

// AssertSellerEligibilityResponseRequired checks if the required fields are not zero-ed
func AssertSellerEligibilityResponseRequired(obj SellerEligibilityResponse) error {
	return nil
}

// AssertSellerEligibilityResponseConstraints checks if the values respects the defined constraints
func AssertSellerEligibilityResponseConstraints(obj SellerEligibilityResponse) error {
	return nil
}
