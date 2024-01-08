/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// SalesTaxes - This type is used by the root response of the <b>getSalesTaxes</b> method.
type SalesTaxes struct {

	// An array of one or more sales tax rate entries for a specific marketplace (or all applicable marketplaces if the <b>country_code</b> query parameter is not used.<br><br>If no sales tax rate entries are set up, no response payload is returned, but only an HTTP status code of <code>204 No Content</code>.
	SalesTaxes []SalesTax `json:"salesTaxes,omitempty"`
}

// AssertSalesTaxesRequired checks if the required fields are not zero-ed
func AssertSalesTaxesRequired(obj SalesTaxes) error {
	for _, el := range obj.SalesTaxes {
		if err := AssertSalesTaxRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertSalesTaxesConstraints checks if the values respects the defined constraints
func AssertSalesTaxesConstraints(obj SalesTaxes) error {
	return nil
}