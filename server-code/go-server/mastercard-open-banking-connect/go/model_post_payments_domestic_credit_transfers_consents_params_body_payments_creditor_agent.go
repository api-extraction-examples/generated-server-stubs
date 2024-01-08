/*
 * Open Banking - Payments initiation service
 *
 * Open Banking - Payments initiation service
 *
 * API version: 1.16.0
 * Contact: apisupport@mastercard.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent struct {

	// System identification:   * 'UK.SortCode' - UK FPS 
	ClearingSystemIdentification string `json:"clearingSystemIdentification"`

	// Sort code
	MemberIdentification string `json:"memberIdentification"`
}

// AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgentRequired checks if the required fields are not zero-ed
func AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgentRequired(obj PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent) error {
	elements := map[string]interface{}{
		"clearingSystemIdentification": obj.ClearingSystemIdentification,
		"memberIdentification": obj.MemberIdentification,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgentConstraints checks if the values respects the defined constraints
func AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgentConstraints(obj PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent) error {
	return nil
}
