/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type Body3 struct {

	Platform string `json:"platform"`

	ServiceId string `json:"service_id"`
}

// AssertBody3Required checks if the required fields are not zero-ed
func AssertBody3Required(obj Body3) error {
	elements := map[string]interface{}{
		"platform": obj.Platform,
		"service_id": obj.ServiceId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertBody3Constraints checks if the values respects the defined constraints
func AssertBody3Constraints(obj Body3) error {
	return nil
}
