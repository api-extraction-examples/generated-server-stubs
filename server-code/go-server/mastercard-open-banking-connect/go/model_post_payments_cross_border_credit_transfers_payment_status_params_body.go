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




type PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody struct {

	// Payment identification
	PaymentId string `json:"paymentId"`

	RequestInfo PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBodyRequestInfo `json:"requestInfo"`
}

// AssertPostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBodyRequired checks if the required fields are not zero-ed
func AssertPostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBodyRequired(obj PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody) error {
	elements := map[string]interface{}{
		"paymentId": obj.PaymentId,
		"requestInfo": obj.RequestInfo,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertPostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBodyRequestInfoRequired(obj.RequestInfo); err != nil {
		return err
	}
	return nil
}

// AssertPostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBodyConstraints checks if the values respects the defined constraints
func AssertPostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBodyConstraints(obj PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody) error {
	return nil
}
