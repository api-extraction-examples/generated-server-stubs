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




type PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount struct {

	// Account number
	Identification string `json:"identification"`

	// Account scheme name
	SchemeName string `json:"schemeName,omitempty"`
}

// AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccountRequired checks if the required fields are not zero-ed
func AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccountRequired(obj PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount) error {
	elements := map[string]interface{}{
		"identification": obj.Identification,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccountConstraints checks if the values respects the defined constraints
func AssertPostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccountConstraints(obj PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount) error {
	return nil
}
