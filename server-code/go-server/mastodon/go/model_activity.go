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




// Activity - Represents a weekly bucket of instance activity.
type Activity struct {

	// User logins since the week began, String (cast from an integer).
	Logins string `json:"logins,omitempty"`

	// User registrations since the week began, String (cast from an integer).
	Registrations string `json:"registrations,omitempty"`

	// Statuses created since the week began, String (cast from an integer).
	Statuses string `json:"statuses,omitempty"`

	// Midnight at the first day of the week.  (UNIX Timestamp).
	Week string `json:"week,omitempty"`
}

// AssertActivityRequired checks if the required fields are not zero-ed
func AssertActivityRequired(obj Activity) error {
	return nil
}

// AssertActivityConstraints checks if the values respects the defined constraints
func AssertActivityConstraints(obj Activity) error {
	return nil
}
