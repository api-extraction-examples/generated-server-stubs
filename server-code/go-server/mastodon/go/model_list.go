/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0
 * Contact: sardo@hey.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// List - Represents a list of some users that the authenticated user follows.
type List struct {

	// The internal database ID of the list. Cast from an integer, but not guaranteed to be a number.
	Id string `json:"id"`

	// The user-defined title of the list.
	RepliesPolicy string `json:"replies_policy"`

	// The user-defined title of the list.
	Title string `json:"title"`
}

// AssertListRequired checks if the required fields are not zero-ed
func AssertListRequired(obj List) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"replies_policy": obj.RepliesPolicy,
		"title": obj.Title,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertListConstraints checks if the values respects the defined constraints
func AssertListConstraints(obj List) error {
	return nil
}