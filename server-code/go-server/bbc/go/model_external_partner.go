/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ExternalPartner struct {

	Type string `json:"type"`

	Value string `json:"value"`
}

// AssertExternalPartnerRequired checks if the required fields are not zero-ed
func AssertExternalPartnerRequired(obj ExternalPartner) error {
	elements := map[string]interface{}{
		"type": obj.Type,
		"value": obj.Value,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertExternalPartnerConstraints checks if the values respects the defined constraints
func AssertExternalPartnerConstraints(obj ExternalPartner) error {
	return nil
}
