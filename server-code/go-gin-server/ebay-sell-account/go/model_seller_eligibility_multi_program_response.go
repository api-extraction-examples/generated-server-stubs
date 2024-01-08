/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// SellerEligibilityMultiProgramResponse - The base response of the <b>getAdvertisingEligibility</b> method that contains the seller eligibility information for one or more advertising programs.
type SellerEligibilityMultiProgramResponse struct {

	// An array of response fields that define the seller eligibility for eBay adverstising programs.
	AdvertisingEligibility []SellerEligibilityResponse `json:"advertisingEligibility,omitempty"`
}
