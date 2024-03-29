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




type PostPaymentsSepaCreditTransfersConsentsOkBody struct {

	Links PostPaymentsSepaCreditTransfersConsentsOkBodyLinks `json:"_links,omitempty"`

	AdditionalData PostPaymentsCrossBorderCreditTransfersConsentsOkBodyAdditionalData `json:"additionalData,omitempty"`

	AspspSCAApproach string `json:"aspspSCAApproach,omitempty"`

	ConsentRequestId string `json:"consentRequestId,omitempty"`

	OriginalRequestInfo PostPaymentsSepaCreditTransfersConsentsOkBodyOriginalRequestInfo `json:"originalRequestInfo"`
}

// AssertPostPaymentsSepaCreditTransfersConsentsOkBodyRequired checks if the required fields are not zero-ed
func AssertPostPaymentsSepaCreditTransfersConsentsOkBodyRequired(obj PostPaymentsSepaCreditTransfersConsentsOkBody) error {
	elements := map[string]interface{}{
		"originalRequestInfo": obj.OriginalRequestInfo,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertPostPaymentsSepaCreditTransfersConsentsOkBodyLinksRequired(obj.Links); err != nil {
		return err
	}
	if err := AssertPostPaymentsCrossBorderCreditTransfersConsentsOkBodyAdditionalDataRequired(obj.AdditionalData); err != nil {
		return err
	}
	if err := AssertPostPaymentsSepaCreditTransfersConsentsOkBodyOriginalRequestInfoRequired(obj.OriginalRequestInfo); err != nil {
		return err
	}
	return nil
}

// AssertPostPaymentsSepaCreditTransfersConsentsOkBodyConstraints checks if the values respects the defined constraints
func AssertPostPaymentsSepaCreditTransfersConsentsOkBodyConstraints(obj PostPaymentsSepaCreditTransfersConsentsOkBody) error {
	return nil
}
