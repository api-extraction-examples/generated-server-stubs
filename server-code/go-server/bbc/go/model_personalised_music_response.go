/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PersonalisedMusicResponse struct {

	Limit int32 `json:"limit"`

	Method string `json:"method"`

	Offset int32 `json:"offset"`

	RepliedAt string `json:"replied_at"`

	Results []PersonalisedMusicActivity `json:"results"`

	Schema string `json:"schema"`

	Total int32 `json:"total"`
}

// AssertPersonalisedMusicResponseRequired checks if the required fields are not zero-ed
func AssertPersonalisedMusicResponseRequired(obj PersonalisedMusicResponse) error {
	elements := map[string]interface{}{
		"limit": obj.Limit,
		"method": obj.Method,
		"offset": obj.Offset,
		"replied_at": obj.RepliedAt,
		"results": obj.Results,
		"schema": obj.Schema,
		"total": obj.Total,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Results {
		if err := AssertPersonalisedMusicActivityRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertPersonalisedMusicResponseConstraints checks if the values respects the defined constraints
func AssertPersonalisedMusicResponseConstraints(obj PersonalisedMusicResponse) error {
	return nil
}