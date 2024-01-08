/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type MusicPopularityTracks struct {

	Limit int32 `json:"limit,omitempty"`

	Method string `json:"method"`

	Offset int32 `json:"offset,omitempty"`

	RepliedAt string `json:"repliedAt"`

	Results []MusicPopularityTrack `json:"results"`

	Schema string `json:"schema"`

	Total int32 `json:"total"`
}

// AssertMusicPopularityTracksRequired checks if the required fields are not zero-ed
func AssertMusicPopularityTracksRequired(obj MusicPopularityTracks) error {
	elements := map[string]interface{}{
		"method": obj.Method,
		"repliedAt": obj.RepliedAt,
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
		if err := AssertMusicPopularityTrackRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertMusicPopularityTracksConstraints checks if the values respects the defined constraints
func AssertMusicPopularityTracksConstraints(obj MusicPopularityTracks) error {
	return nil
}