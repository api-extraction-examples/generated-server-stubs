/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type EndUserLicenseAgreementCreateRequestDataAttributes struct {

	AgreementText string `json:"agreementText"`
}

// AssertEndUserLicenseAgreementCreateRequestDataAttributesRequired checks if the required fields are not zero-ed
func AssertEndUserLicenseAgreementCreateRequestDataAttributesRequired(obj EndUserLicenseAgreementCreateRequestDataAttributes) error {
	elements := map[string]interface{}{
		"agreementText": obj.AgreementText,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertEndUserLicenseAgreementCreateRequestDataAttributesConstraints checks if the values respects the defined constraints
func AssertEndUserLicenseAgreementCreateRequestDataAttributesConstraints(obj EndUserLicenseAgreementCreateRequestDataAttributes) error {
	return nil
}
