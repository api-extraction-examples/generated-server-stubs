/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// SetReturnPolicyResponse - A complex type that is populated with a response containing a return policies.
type SetReturnPolicyResponse struct {

	// This field always returns <code>ALL_EXCLUDING_MOTORS_VEHICLES</code> for return business policies, since return business policies are not applicable to motor vehicle listings.
	CategoryTypes []CategoryType `json:"categoryTypes,omitempty"`

	// A seller-defined description of the return business policy. This description is only for the seller's use, and is not exposed on any eBay pages. This field is returned if set for the policy. <br/><br/><b>Max length</b>: 250
	Description string `json:"description,omitempty"`

	// <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer supports extended holiday returns. This field should no longer be returned.</p> 
	ExtendedHolidayReturnsOffered bool `json:"extendedHolidayReturnsOffered,omitempty"`

	InternationalOverride InternationalReturnOverrideType `json:"internationalOverride,omitempty"`

	// The ID of the eBay marketplace to which this return business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>
	MarketplaceId string `json:"marketplaceId,omitempty"`

	// A seller-defined name for this return business policy. Names must be unique for policies assigned to the same marketplace.<br /><br /><b>Max length:</b> 64
	Name string `json:"name,omitempty"`

	// If a seller indicates that they will accept buyer returns, this value will be <code>MONEY_BACK</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:RefundMethodEnum'>eBay API documentation</a>
	RefundMethod string `json:"refundMethod,omitempty"`

	// <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer allows sellers to charge a restocking fee for buyer remorse returns.</p>
	RestockingFeePercentage string `json:"restockingFeePercentage,omitempty"`

	// This text-based field provides more details on seller-specified return instructions. <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is no longer supported on many eBay marketplaces. To see if a marketplace and eBay category does support this field, call <a href=\"/api-docs/sell/metadata/resources/marketplace/methods/getReturnPolicies\">getReturnPolicies</a> method of the <b>Metadata API</b>. Then you will look for the <b>policyDescriptionEnabled</b> field with a value of <code>true</code> for the eBay category.</span></p><br/><b>Max length</b>: 5000 (8000 for DE)
	ReturnInstructions string `json:"returnInstructions,omitempty"`

	// This field will be returned if the seller is willing and able to offer a replacement item as an alternative to 'Money Back'. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a>
	ReturnMethod string `json:"returnMethod,omitempty"`

	ReturnPeriod TimeDuration `json:"returnPeriod,omitempty"`

	// A unique eBay-assigned ID for a return business policy. This ID is generated when the policy is created.
	ReturnPolicyId string `json:"returnPolicyId,omitempty"`

	// This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Note that the seller is always responsible for return shipping costs for SNAD-related issues.  <br/><br/>This container will be returned unless the business policy states that the seller does not accept returns. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a>
	ReturnShippingCostPayer string `json:"returnShippingCostPayer,omitempty"`

	// If set to <code>true</code>, the seller accepts returns. If set to <code>false</code>, this field indicates that the seller does not accept returns.
	ReturnsAccepted bool `json:"returnsAccepted,omitempty"`

	// An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.
	Warnings []Error `json:"warnings,omitempty"`
}
