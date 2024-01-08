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




type PostPaymentsCrossBorderCreditTransfersParamsBodyRequestInfo struct {

	// Identification of ASPSP
	AspspId string `json:"aspspId"`

	// The authorization query / data received after PSU has authorized the consent
	Authorization string `json:"authorization"`

	Merchant Merchant `json:"merchant,omitempty"`

	// Request id given by the client
	XRequestId string `json:"xRequestId"`
}

// AssertPostPaymentsCrossBorderCreditTransfersParamsBodyRequestInfoRequired checks if the required fields are not zero-ed
func AssertPostPaymentsCrossBorderCreditTransfersParamsBodyRequestInfoRequired(obj PostPaymentsCrossBorderCreditTransfersParamsBodyRequestInfo) error {
	elements := map[string]interface{}{
		"aspspId": obj.AspspId,
		"authorization": obj.Authorization,
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

// AssertPostPaymentsCrossBorderCreditTransfersParamsBodyRequestInfoConstraints checks if the values respects the defined constraints
func AssertPostPaymentsCrossBorderCreditTransfersParamsBodyRequestInfoConstraints(obj PostPaymentsCrossBorderCreditTransfersParamsBodyRequestInfo) error {
	return nil
}
