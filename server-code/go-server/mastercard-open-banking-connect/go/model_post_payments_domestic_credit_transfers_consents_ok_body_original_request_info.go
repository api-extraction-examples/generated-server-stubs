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




type PostPaymentsDomesticCreditTransfersConsentsOkBodyOriginalRequestInfo struct {

	// Original xRequestId given by the client on request
	XRequestId string `json:"xRequestId"`
}

// AssertPostPaymentsDomesticCreditTransfersConsentsOkBodyOriginalRequestInfoRequired checks if the required fields are not zero-ed
func AssertPostPaymentsDomesticCreditTransfersConsentsOkBodyOriginalRequestInfoRequired(obj PostPaymentsDomesticCreditTransfersConsentsOkBodyOriginalRequestInfo) error {
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

// AssertPostPaymentsDomesticCreditTransfersConsentsOkBodyOriginalRequestInfoConstraints checks if the values respects the defined constraints
func AssertPostPaymentsDomesticCreditTransfersConsentsOkBodyOriginalRequestInfoConstraints(obj PostPaymentsDomesticCreditTransfersConsentsOkBodyOriginalRequestInfo) error {
	return nil
}
