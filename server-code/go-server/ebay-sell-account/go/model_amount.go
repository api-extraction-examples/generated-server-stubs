/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// Amount - A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both <b>currency</b> and <b>value</b> fields are required, and both fields are also always returned for an amount in a response field.
type Amount struct {

	// The base currency applied to the <b>value</b> field to establish a monetary amount.  <br/><br/>The currency is represented as a 3-letter <a href=\"https://www.iso.org/iso-4217-currency-codes.html \" title=\"https://www.iso.org \" target=\"_blank\">ISO 4217</a> currency code. For example, the code for the Canadian Dollar is <code>CAD</code>.<br/><br/><b>Default:</b> The default currency of the eBay marketplace that hosts the listing. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:CurrencyCodeEnum'>eBay API documentation</a>
	Currency string `json:"currency,omitempty"`

	// The monetary amount in the specified <b>currency</b>.
	Value string `json:"value,omitempty"`
}

// AssertAmountRequired checks if the required fields are not zero-ed
func AssertAmountRequired(obj Amount) error {
	return nil
}

// AssertAmountConstraints checks if the values respects the defined constraints
func AssertAmountConstraints(obj Amount) error {
	return nil
}