/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// SetPaymentPolicyResponse - Complex type that that gets populated with a response containing a payment policy.
type SetPaymentPolicyResponse struct {

	// This container indicates whether the payment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
	CategoryTypes []CategoryType `json:"categoryTypes,omitempty"`

	Deposit Deposit `json:"deposit,omitempty"`

	// A seller-defined description of the payment business policy. This description is only for the seller's use, and is not exposed on any eBay pages. This field is returned if set for the policy. <br/><br/><b>Max length</b>: 250
	Description string `json:"description,omitempty"`

	FullPaymentDueIn TimeDuration `json:"fullPaymentDueIn,omitempty"`

	// The value returned in this field will reflect the value set by the seller in the <b>immediatePay</b> request field. A value of <code>true</code> indicates that immediate payment is required from the buyer for: <ul><li>A fixed-price item</li><li>An auction item where the buyer is using the 'Buy it Now' option</li><li>A deposit for a motor vehicle listing</li></ul><br />It is possible for the seller to set this field as <code>true</code> in the payment business policy, but it will not apply in some scenarios. For example, immediate payment is not applicable for auction listings that have a winning bidder, for buyer purchases that involve the Best Offer feature, or for transactions that happen offline between the buyer and seller.
	ImmediatePay bool `json:"immediatePay,omitempty"`

	// The ID of the eBay marketplace to which this payment business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>
	MarketplaceId string `json:"marketplaceId,omitempty"`

	// A seller-defined name for this payment business policy. Names must be unique for policies assigned to the same marketplace.<br /><br /><b>Max length:</b> 64
	Name string `json:"name,omitempty"`

	// <p class=\"tablenote\"><b>Note:</b> NO LONGER SUPPORTED. Although this field may be returned for some older payment business policies, payment instructions are no longer supported by payment business policies. If this field is returned, it can be ignored and these payment instructions will not appear in any listings that use the corresponding business policy.</p>A free-form string field that allows sellers to add detailed payment instructions to their listings.
	PaymentInstructions string `json:"paymentInstructions,omitempty"`

	// This array shows the available payment methods that the seller has set for the payment business policy.<br /><br />Sellers do not have to specify any electronic payment methods for listings, so this array will often be returned empty unless the payment business policy is intended for motor vehicle listings or other items in categories where offline payments are required or supported.
	PaymentMethods []PaymentMethod `json:"paymentMethods,omitempty"`

	// A unique eBay-assigned ID for a payment business policy. This ID is generated when the policy is created.
	PaymentPolicyId string `json:"paymentPolicyId,omitempty"`

	// An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.
	Warnings []Error `json:"warnings,omitempty"`
}

// AssertSetPaymentPolicyResponseRequired checks if the required fields are not zero-ed
func AssertSetPaymentPolicyResponseRequired(obj SetPaymentPolicyResponse) error {
	for _, el := range obj.CategoryTypes {
		if err := AssertCategoryTypeRequired(el); err != nil {
			return err
		}
	}
	if err := AssertDepositRequired(obj.Deposit); err != nil {
		return err
	}
	if err := AssertTimeDurationRequired(obj.FullPaymentDueIn); err != nil {
		return err
	}
	for _, el := range obj.PaymentMethods {
		if err := AssertPaymentMethodRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Warnings {
		if err := AssertErrorRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertSetPaymentPolicyResponseConstraints checks if the values respects the defined constraints
func AssertSetPaymentPolicyResponseConstraints(obj SetPaymentPolicyResponse) error {
	return nil
}
