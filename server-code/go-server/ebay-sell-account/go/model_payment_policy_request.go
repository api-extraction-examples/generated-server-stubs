/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// PaymentPolicyRequest - This root container defines a seller's payment business policy for a specific marketplace and category group. This type is used when creating or updating a payment business policy.
type PaymentPolicyRequest struct {

	// This container is used to specify whether the payment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
	CategoryTypes []CategoryType `json:"categoryTypes,omitempty"`

	Deposit Deposit `json:"deposit,omitempty"`

	// A seller-defined description of the payment business policy. This description is only for the seller's use, and is not exposed on any eBay pages.  <br/><br/><b>Max length</b>: 250
	Description string `json:"description,omitempty"`

	FullPaymentDueIn TimeDuration `json:"fullPaymentDueIn,omitempty"`

	// This field should be included and set to <code>true</code> if the seller wants to require immediate payment from the buyer for: <ul><li>A fixed-price item</li><li>An auction item where the buyer is using the 'Buy it Now' option</li><li>A deposit for a motor vehicle listing</li></ul><br /><b>Default:</b> False
	ImmediatePay bool `json:"immediatePay,omitempty"`

	// The ID of the eBay marketplace to which this payment business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>
	MarketplaceId string `json:"marketplaceId,omitempty"`

	// A seller-defined name for this payment business policy. Names must be unique for policies assigned to the same marketplace.<br /><br /><b>Max length:</b> 64
	Name string `json:"name,omitempty"`

	// <p class=\"tablenote\"><b>Note:</b> DO NOT USE THIS FIELD. Payment instructions are no longer supported by payment business policies.</p>A free-form string field that allows sellers to add detailed payment instructions to their listings.
	PaymentInstructions string `json:"paymentInstructions,omitempty"`

	// <p class=\"tablenote\"><b>Note:</b> This field applies only when the seller needs to specify one or more offline payment methods. eBay now manages the electronic payment options available to buyers to pay for the item.</p>This array is used to specify one or more offline payment methods that will be accepted for payment that occurs off of eBay's platform.
	PaymentMethods []PaymentMethod `json:"paymentMethods,omitempty"`
}

// AssertPaymentPolicyRequestRequired checks if the required fields are not zero-ed
func AssertPaymentPolicyRequestRequired(obj PaymentPolicyRequest) error {
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
	return nil
}

// AssertPaymentPolicyRequestConstraints checks if the values respects the defined constraints
func AssertPaymentPolicyRequestConstraints(obj PaymentPolicyRequest) error {
	return nil
}
