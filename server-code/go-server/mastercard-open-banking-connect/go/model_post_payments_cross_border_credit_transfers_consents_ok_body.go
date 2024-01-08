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




type PostPaymentsCrossBorderCreditTransfersConsentsOkBody struct {

	Links PostPaymentsCrossBorderCreditTransfersConsentsOkBodyLinks `json:"_links,omitempty"`

	AdditionalData PostPaymentsCrossBorderCreditTransfersConsentsOkBodyAdditionalData `json:"additionalData,omitempty"`

	AspspSCAApproach string `json:"aspspSCAApproach,omitempty"`

	ConsentRequestId string `json:"consentRequestId,omitempty"`

	OriginalRequestInfo PostPaymentsCrossBorderCreditTransfersConsentsOkBodyOriginalRequestInfo `json:"originalRequestInfo"`
}

// AssertPostPaymentsCrossBorderCreditTransfersConsentsOkBodyRequired checks if the required fields are not zero-ed
func AssertPostPaymentsCrossBorderCreditTransfersConsentsOkBodyRequired(obj PostPaymentsCrossBorderCreditTransfersConsentsOkBody) error {
	elements := map[string]interface{}{
		"originalRequestInfo": obj.OriginalRequestInfo,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertPostPaymentsCrossBorderCreditTransfersConsentsOkBodyLinksRequired(obj.Links); err != nil {
		return err
	}
	if err := AssertPostPaymentsCrossBorderCreditTransfersConsentsOkBodyAdditionalDataRequired(obj.AdditionalData); err != nil {
		return err
	}
	if err := AssertPostPaymentsCrossBorderCreditTransfersConsentsOkBodyOriginalRequestInfoRequired(obj.OriginalRequestInfo); err != nil {
		return err
	}
	return nil
}

// AssertPostPaymentsCrossBorderCreditTransfersConsentsOkBodyConstraints checks if the values respects the defined constraints
func AssertPostPaymentsCrossBorderCreditTransfersConsentsOkBodyConstraints(obj PostPaymentsCrossBorderCreditTransfersConsentsOkBody) error {
	return nil
}