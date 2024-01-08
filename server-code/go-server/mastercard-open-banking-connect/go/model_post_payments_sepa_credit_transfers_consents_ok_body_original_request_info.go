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




type PostPaymentsSepaCreditTransfersConsentsOkBodyOriginalRequestInfo struct {

	// Original xRequestId given by the client on request
	XRequestId string `json:"xRequestId"`
}

// AssertPostPaymentsSepaCreditTransfersConsentsOkBodyOriginalRequestInfoRequired checks if the required fields are not zero-ed
func AssertPostPaymentsSepaCreditTransfersConsentsOkBodyOriginalRequestInfoRequired(obj PostPaymentsSepaCreditTransfersConsentsOkBodyOriginalRequestInfo) error {
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

// AssertPostPaymentsSepaCreditTransfersConsentsOkBodyOriginalRequestInfoConstraints checks if the values respects the defined constraints
func AssertPostPaymentsSepaCreditTransfersConsentsOkBodyOriginalRequestInfoConstraints(obj PostPaymentsSepaCreditTransfersConsentsOkBodyOriginalRequestInfo) error {
	return nil
}
