/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// SalesTax - This type is used to provide sales tax settings for a specific tax jurisdiction.
type SalesTax struct {

	// The country code enumeration value identifies the country to which this sales tax rate applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum'>eBay API documentation</a>
	CountryCode string `json:"countryCode,omitempty"`

	// A unique ID that identifies the sales tax jurisdiction to which the sales tax rate applies (for example, a state within the United States).
	SalesTaxJurisdictionId string `json:"salesTaxJurisdictionId,omitempty"`

	// The sales tax rate that will be applied to sales price. The <b>shippingAndHandlingTaxed</b> value will indicate whether or not sales tax is also applied to shipping and handling charges<br><br>Although it is a string, a percentage value is returned here, such as <code>7.75</code>
	SalesTaxPercentage string `json:"salesTaxPercentage,omitempty"`

	// If returned as <code>true</code>, sales tax is also applied to shipping and handling charges, and not just the total sales price of the order.
	ShippingAndHandlingTaxed bool `json:"shippingAndHandlingTaxed,omitempty"`
}
