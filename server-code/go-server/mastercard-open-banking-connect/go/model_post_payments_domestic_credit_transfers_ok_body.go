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




type PostPaymentsDomesticCreditTransfersOkBody struct {

	Consent PaymentConsent `json:"consent"`

	OriginalRequestInfo PostPaymentsDomesticCreditTransfersOkBodyOriginalRequestInfo `json:"originalRequestInfo"`

	Transfer PostPaymentsDomesticCreditTransfersOkBodyTransfer `json:"transfer"`
}

// AssertPostPaymentsDomesticCreditTransfersOkBodyRequired checks if the required fields are not zero-ed
func AssertPostPaymentsDomesticCreditTransfersOkBodyRequired(obj PostPaymentsDomesticCreditTransfersOkBody) error {
	elements := map[string]interface{}{
		"consent": obj.Consent,
		"originalRequestInfo": obj.OriginalRequestInfo,
		"transfer": obj.Transfer,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertPaymentConsentRequired(obj.Consent); err != nil {
		return err
	}
	if err := AssertPostPaymentsDomesticCreditTransfersOkBodyOriginalRequestInfoRequired(obj.OriginalRequestInfo); err != nil {
		return err
	}
	if err := AssertPostPaymentsDomesticCreditTransfersOkBodyTransferRequired(obj.Transfer); err != nil {
		return err
	}
	return nil
}

// AssertPostPaymentsDomesticCreditTransfersOkBodyConstraints checks if the values respects the defined constraints
func AssertPostPaymentsDomesticCreditTransfersOkBodyConstraints(obj PostPaymentsDomesticCreditTransfersOkBody) error {
	return nil
}