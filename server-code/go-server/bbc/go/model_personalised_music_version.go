/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PersonalisedMusicVersion struct {

	Classical bool `json:"classical,omitempty"`

	Duration string `json:"duration,omitempty"`

	Radio bool `json:"radio,omitempty"`

	Vpid string `json:"vpid,omitempty"`
}

// AssertPersonalisedMusicVersionRequired checks if the required fields are not zero-ed
func AssertPersonalisedMusicVersionRequired(obj PersonalisedMusicVersion) error {
	return nil
}

// AssertPersonalisedMusicVersionConstraints checks if the values respects the defined constraints
func AssertPersonalisedMusicVersionConstraints(obj PersonalisedMusicVersion) error {
	return nil
}