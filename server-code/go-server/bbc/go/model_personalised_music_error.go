/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PersonalisedMusicError struct {

	Message string `json:"message"`

	RepliedAt int32 `json:"replied_at"`

	Status int32 `json:"status"`
}

// AssertPersonalisedMusicErrorRequired checks if the required fields are not zero-ed
func AssertPersonalisedMusicErrorRequired(obj PersonalisedMusicError) error {
	elements := map[string]interface{}{
		"message": obj.Message,
		"replied_at": obj.RepliedAt,
		"status": obj.Status,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPersonalisedMusicErrorConstraints checks if the values respects the defined constraints
func AssertPersonalisedMusicErrorConstraints(obj PersonalisedMusicError) error {
	return nil
}