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




type PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount struct {

	// Account identification
	Identification string `json:"identification"`

	// Scheme for the account identification
	SchemeName string `json:"schemeName"`
}

// AssertPostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccountRequired checks if the required fields are not zero-ed
func AssertPostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccountRequired(obj PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount) error {
	elements := map[string]interface{}{
		"identification": obj.Identification,
		"schemeName": obj.SchemeName,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccountConstraints checks if the values respects the defined constraints
func AssertPostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccountConstraints(obj PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount) error {
	return nil
}