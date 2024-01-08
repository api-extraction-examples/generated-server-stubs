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




type PostPaymentsCrossBorderCreditTransfersConsentsParamsBody struct {

	Payments PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments `json:"payments"`

	RequestInfo PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo `json:"requestInfo"`
}

// AssertPostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequired checks if the required fields are not zero-ed
func AssertPostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequired(obj PostPaymentsCrossBorderCreditTransfersConsentsParamsBody) error {
	elements := map[string]interface{}{
		"payments": obj.Payments,
		"requestInfo": obj.RequestInfo,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertPostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsRequired(obj.Payments); err != nil {
		return err
	}
	if err := AssertPostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfoRequired(obj.RequestInfo); err != nil {
		return err
	}
	return nil
}

// AssertPostPaymentsCrossBorderCreditTransfersConsentsParamsBodyConstraints checks if the values respects the defined constraints
func AssertPostPaymentsCrossBorderCreditTransfersConsentsParamsBodyConstraints(obj PostPaymentsCrossBorderCreditTransfersConsentsParamsBody) error {
	return nil
}
