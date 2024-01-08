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




type PostPaymentsCrossBorderCreditTransfersConsentsOkBodyLinks struct {

	// Redirect URL for SCA
	ScaRedirect string `json:"scaRedirect,omitempty"`
}

// AssertPostPaymentsCrossBorderCreditTransfersConsentsOkBodyLinksRequired checks if the required fields are not zero-ed
func AssertPostPaymentsCrossBorderCreditTransfersConsentsOkBodyLinksRequired(obj PostPaymentsCrossBorderCreditTransfersConsentsOkBodyLinks) error {
	return nil
}

// AssertPostPaymentsCrossBorderCreditTransfersConsentsOkBodyLinksConstraints checks if the values respects the defined constraints
func AssertPostPaymentsCrossBorderCreditTransfersConsentsOkBodyLinksConstraints(obj PostPaymentsCrossBorderCreditTransfersConsentsOkBodyLinks) error {
	return nil
}