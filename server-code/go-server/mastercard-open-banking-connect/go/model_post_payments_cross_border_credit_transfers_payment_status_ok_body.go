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




type PostPaymentsCrossBorderCreditTransfersPaymentStatusOkBody struct {

	OriginalRequestInfo PostPaymentsCrossBorderCreditTransfersPaymentStatusOkBodyOriginalRequestInfo `json:"originalRequestInfo"`

	Payments PostPaymentsCrossBorderCreditTransfersPaymentStatusOkBodyPayments `json:"payments,omitempty"`
}

// AssertPostPaymentsCrossBorderCreditTransfersPaymentStatusOkBodyRequired checks if the required fields are not zero-ed
func AssertPostPaymentsCrossBorderCreditTransfersPaymentStatusOkBodyRequired(obj PostPaymentsCrossBorderCreditTransfersPaymentStatusOkBody) error {
	elements := map[string]interface{}{
		"originalRequestInfo": obj.OriginalRequestInfo,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertPostPaymentsCrossBorderCreditTransfersPaymentStatusOkBodyOriginalRequestInfoRequired(obj.OriginalRequestInfo); err != nil {
		return err
	}
	if err := AssertPostPaymentsCrossBorderCreditTransfersPaymentStatusOkBodyPaymentsRequired(obj.Payments); err != nil {
		return err
	}
	return nil
}

// AssertPostPaymentsCrossBorderCreditTransfersPaymentStatusOkBodyConstraints checks if the values respects the defined constraints
func AssertPostPaymentsCrossBorderCreditTransfersPaymentStatusOkBodyConstraints(obj PostPaymentsCrossBorderCreditTransfersPaymentStatusOkBody) error {
	return nil
}
