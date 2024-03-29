/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// PaymentPolicyResponse - The response payload for the <b>getPaymentPolicies</b> method. <br /><br /><span class=\"tablenote\"><b>Note</b>: Pagination has not yet been enabled for <b>getPaymentPolicies</b>, so all of the pagination-related fields are for future use.</span>
type PaymentPolicyResponse struct {

	// This field is for future use.
	Href string `json:"href,omitempty"`

	// This field is for future use.
	Limit int32 `json:"limit,omitempty"`

	// This field is for future use.
	Next string `json:"next,omitempty"`

	// This field is for future use.
	Offset int32 `json:"offset,omitempty"`

	// A list of all of the seller's payment business policies defined for the specified marketplace. This array will be returned as empty if no payment business policies are defined for the specified marketplace.
	PaymentPolicies []PaymentPolicy `json:"paymentPolicies,omitempty"`

	// This field is for future use.
	Prev string `json:"prev,omitempty"`

	// The total number of payment business policies retrieved in the result set.  <br/><br/>If no payment business policies are defined for the specified marketplace, this field is returned with a value of <code>0</code>.
	Total int32 `json:"total,omitempty"`
}

// AssertPaymentPolicyResponseRequired checks if the required fields are not zero-ed
func AssertPaymentPolicyResponseRequired(obj PaymentPolicyResponse) error {
	for _, el := range obj.PaymentPolicies {
		if err := AssertPaymentPolicyRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertPaymentPolicyResponseConstraints checks if the values respects the defined constraints
func AssertPaymentPolicyResponseConstraints(obj PaymentPolicyResponse) error {
	return nil
}
