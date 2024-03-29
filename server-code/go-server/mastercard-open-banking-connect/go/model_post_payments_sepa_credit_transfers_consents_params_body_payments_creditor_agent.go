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




type PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent struct {

	// Creditor FI
	Bicfi string `json:"bicfi"`
}

// AssertPostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgentRequired checks if the required fields are not zero-ed
func AssertPostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgentRequired(obj PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent) error {
	elements := map[string]interface{}{
		"bicfi": obj.Bicfi,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgentConstraints checks if the values respects the defined constraints
func AssertPostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgentConstraints(obj PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent) error {
	return nil
}
