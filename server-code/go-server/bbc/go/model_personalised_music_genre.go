/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PersonalisedMusicGenre struct {

	Id string `json:"id,omitempty"`

	Key string `json:"key,omitempty"`

	Title string `json:"title,omitempty"`

	Type string `json:"type,omitempty"`
}

// AssertPersonalisedMusicGenreRequired checks if the required fields are not zero-ed
func AssertPersonalisedMusicGenreRequired(obj PersonalisedMusicGenre) error {
	return nil
}

// AssertPersonalisedMusicGenreConstraints checks if the values respects the defined constraints
func AssertPersonalisedMusicGenreConstraints(obj PersonalisedMusicGenre) error {
	return nil
}
