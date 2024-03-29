/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PlayableItem struct {

	Description string `json:"description,omitempty"`

	ImageUrl string `json:"image_url,omitempty"`

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Type string `json:"type,omitempty"`

	VersionPid string `json:"version_pid,omitempty"`
}

// AssertPlayableItemRequired checks if the required fields are not zero-ed
func AssertPlayableItemRequired(obj PlayableItem) error {
	return nil
}

// AssertPlayableItemConstraints checks if the values respects the defined constraints
func AssertPlayableItemConstraints(obj PlayableItem) error {
	return nil
}
