/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CertificateCreateRequestDataAttributes struct {

	CertificateType CertificateType `json:"certificateType"`

	CsrContent string `json:"csrContent"`
}

// AssertCertificateCreateRequestDataAttributesRequired checks if the required fields are not zero-ed
func AssertCertificateCreateRequestDataAttributesRequired(obj CertificateCreateRequestDataAttributes) error {
	elements := map[string]interface{}{
		"certificateType": obj.CertificateType,
		"csrContent": obj.CsrContent,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertCertificateCreateRequestDataAttributesConstraints checks if the values respects the defined constraints
func AssertCertificateCreateRequestDataAttributesConstraints(obj CertificateCreateRequestDataAttributes) error {
	return nil
}