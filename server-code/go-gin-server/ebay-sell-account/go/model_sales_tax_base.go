/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// SalesTaxBase - This type is used by the base request of the <b>createOrReplaceSalesTax</b>. 
type SalesTaxBase struct {

	// This field is used to set the sales tax rate for the tax jurisdiction set in the call URI. When applicable to an order, this sales tax rate will be applied to sales price. The <b>shippingAndHandlingTaxed</b> value will indicate whether or not sales tax is also applied to shipping and handling charges<br><br>Although it is a string, a percentage value is set here, such as <code>7.75</code>.
	SalesTaxPercentage string `json:"salesTaxPercentage,omitempty"`

	// This field is set to <code>true</code> if the seller wishes to apply sales tax to shipping and handling charges, and not just the total sales price of the order. Otherwise, this field's value should be set to <code>false</code>.
	ShippingAndHandlingTaxed bool `json:"shippingAndHandlingTaxed,omitempty"`
}