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




type PostPaymentsSepaCreditTransfersConsentsParamsBodyRequestInfo struct {

	// Identification of ASPSP
	AspspId string `json:"aspspId"`

	// Request information flags which can influence the behaviour or returned data
	Flags []string `json:"flags,omitempty"`

	Merchant Merchant `json:"merchant,omitempty"`

	// Call back uri
	TppRedirectURI string `json:"tppRedirectURI"`

	// Request id given by the client
	XRequestId string `json:"xRequestId"`
}

// AssertPostPaymentsSepaCreditTransfersConsentsParamsBodyRequestInfoRequired checks if the required fields are not zero-ed
func AssertPostPaymentsSepaCreditTransfersConsentsParamsBodyRequestInfoRequired(obj PostPaymentsSepaCreditTransfersConsentsParamsBodyRequestInfo) error {
	elements := map[string]interface{}{
		"aspspId": obj.AspspId,
		"tppRedirectURI": obj.TppRedirectURI,
		"xRequestId": obj.XRequestId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertMerchantRequired(obj.Merchant); err != nil {
		return err
	}
	return nil
}

// AssertPostPaymentsSepaCreditTransfersConsentsParamsBodyRequestInfoConstraints checks if the values respects the defined constraints
func AssertPostPaymentsSepaCreditTransfersConsentsParamsBodyRequestInfoConstraints(obj PostPaymentsSepaCreditTransfersConsentsParamsBodyRequestInfo) error {
	return nil
}
