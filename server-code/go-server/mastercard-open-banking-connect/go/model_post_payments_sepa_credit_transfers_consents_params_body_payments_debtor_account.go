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




type PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount struct {

	// Account IBAN
	Iban string `json:"iban"`
}

// AssertPostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccountRequired checks if the required fields are not zero-ed
func AssertPostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccountRequired(obj PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount) error {
	elements := map[string]interface{}{
		"iban": obj.Iban,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccountConstraints checks if the values respects the defined constraints
func AssertPostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccountConstraints(obj PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount) error {
	return nil
}
