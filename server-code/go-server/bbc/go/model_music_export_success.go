/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type MusicExportSuccess struct {

	Method string `json:"method"`

	RepliedAt string `json:"replied_at"`

	Schema string `json:"schema"`
}

// AssertMusicExportSuccessRequired checks if the required fields are not zero-ed
func AssertMusicExportSuccessRequired(obj MusicExportSuccess) error {
	elements := map[string]interface{}{
		"method": obj.Method,
		"replied_at": obj.RepliedAt,
		"schema": obj.Schema,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertMusicExportSuccessConstraints checks if the values respects the defined constraints
func AssertMusicExportSuccessConstraints(obj MusicExportSuccess) error {
	return nil
}
