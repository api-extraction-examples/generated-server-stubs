/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppRelationshipsBetaLicenseAgreementData struct {

	Id string `json:"id"`

	Type string `json:"type"`
}

// AssertAppRelationshipsBetaLicenseAgreementDataRequired checks if the required fields are not zero-ed
func AssertAppRelationshipsBetaLicenseAgreementDataRequired(obj AppRelationshipsBetaLicenseAgreementData) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertAppRelationshipsBetaLicenseAgreementDataConstraints checks if the values respects the defined constraints
func AssertAppRelationshipsBetaLicenseAgreementDataConstraints(obj AppRelationshipsBetaLicenseAgreementData) error {
	return nil
}
