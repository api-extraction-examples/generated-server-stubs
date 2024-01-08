/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CertificateCreateRequest struct {

	Data CertificateCreateRequestData `json:"data"`
}

// AssertCertificateCreateRequestRequired checks if the required fields are not zero-ed
func AssertCertificateCreateRequestRequired(obj CertificateCreateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertCertificateCreateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertCertificateCreateRequestConstraints checks if the values respects the defined constraints
func AssertCertificateCreateRequestConstraints(obj CertificateCreateRequest) error {
	return nil
}
