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




type PostPaymentsSepaCreditTransfersPaymentStatusOkBodyOriginalRequestInfo struct {

	// Original xRequestId given by the client on request
	XRequestId string `json:"xRequestId"`
}

// AssertPostPaymentsSepaCreditTransfersPaymentStatusOkBodyOriginalRequestInfoRequired checks if the required fields are not zero-ed
func AssertPostPaymentsSepaCreditTransfersPaymentStatusOkBodyOriginalRequestInfoRequired(obj PostPaymentsSepaCreditTransfersPaymentStatusOkBodyOriginalRequestInfo) error {
	elements := map[string]interface{}{
		"xRequestId": obj.XRequestId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPostPaymentsSepaCreditTransfersPaymentStatusOkBodyOriginalRequestInfoConstraints checks if the values respects the defined constraints
func AssertPostPaymentsSepaCreditTransfersPaymentStatusOkBodyOriginalRequestInfoConstraints(obj PostPaymentsSepaCreditTransfersPaymentStatusOkBodyOriginalRequestInfo) error {
	return nil
}
