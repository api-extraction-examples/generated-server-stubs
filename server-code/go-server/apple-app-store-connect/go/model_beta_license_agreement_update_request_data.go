/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BetaLicenseAgreementUpdateRequestData struct {

	Attributes BetaLicenseAgreementAttributes `json:"attributes,omitempty"`

	Id string `json:"id"`

	Type string `json:"type"`
}

// AssertBetaLicenseAgreementUpdateRequestDataRequired checks if the required fields are not zero-ed
func AssertBetaLicenseAgreementUpdateRequestDataRequired(obj BetaLicenseAgreementUpdateRequestData) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertBetaLicenseAgreementAttributesRequired(obj.Attributes); err != nil {
		return err
	}
	return nil
}

// AssertBetaLicenseAgreementUpdateRequestDataConstraints checks if the values respects the defined constraints
func AssertBetaLicenseAgreementUpdateRequestDataConstraints(obj BetaLicenseAgreementUpdateRequestData) error {
	return nil
}
