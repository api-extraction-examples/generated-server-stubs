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




type PostPaymentsSepaCreditTransfersPaymentStatusOkBody struct {

	OriginalRequestInfo PostPaymentsSepaCreditTransfersPaymentStatusOkBodyOriginalRequestInfo `json:"originalRequestInfo"`

	Payments PostPaymentsSepaCreditTransfersPaymentStatusOkBodyPayments `json:"payments,omitempty"`
}

// AssertPostPaymentsSepaCreditTransfersPaymentStatusOkBodyRequired checks if the required fields are not zero-ed
func AssertPostPaymentsSepaCreditTransfersPaymentStatusOkBodyRequired(obj PostPaymentsSepaCreditTransfersPaymentStatusOkBody) error {
	elements := map[string]interface{}{
		"originalRequestInfo": obj.OriginalRequestInfo,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertPostPaymentsSepaCreditTransfersPaymentStatusOkBodyOriginalRequestInfoRequired(obj.OriginalRequestInfo); err != nil {
		return err
	}
	if err := AssertPostPaymentsSepaCreditTransfersPaymentStatusOkBodyPaymentsRequired(obj.Payments); err != nil {
		return err
	}
	return nil
}

// AssertPostPaymentsSepaCreditTransfersPaymentStatusOkBodyConstraints checks if the values respects the defined constraints
func AssertPostPaymentsSepaCreditTransfersPaymentStatusOkBodyConstraints(obj PostPaymentsSepaCreditTransfersPaymentStatusOkBody) error {
	return nil
}
