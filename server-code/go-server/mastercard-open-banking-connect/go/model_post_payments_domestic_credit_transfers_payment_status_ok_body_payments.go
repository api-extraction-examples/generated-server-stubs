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




type PostPaymentsDomesticCreditTransfersPaymentStatusOkBodyPayments struct {

	// Rejection reson code
	StatusReasonCode string `json:"statusReasonCode,omitempty"`

	// Payment transaction status
	TransactionStatus string `json:"transactionStatus"`
}

// AssertPostPaymentsDomesticCreditTransfersPaymentStatusOkBodyPaymentsRequired checks if the required fields are not zero-ed
func AssertPostPaymentsDomesticCreditTransfersPaymentStatusOkBodyPaymentsRequired(obj PostPaymentsDomesticCreditTransfersPaymentStatusOkBodyPayments) error {
	elements := map[string]interface{}{
		"transactionStatus": obj.TransactionStatus,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPostPaymentsDomesticCreditTransfersPaymentStatusOkBodyPaymentsConstraints checks if the values respects the defined constraints
func AssertPostPaymentsDomesticCreditTransfersPaymentStatusOkBodyPaymentsConstraints(obj PostPaymentsDomesticCreditTransfersPaymentStatusOkBodyPayments) error {
	return nil
}