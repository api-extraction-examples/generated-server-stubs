/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// SystemAvatars - List of system avatars.
type SystemAvatars struct {

	// A list of avatar details.
	System []Avatar `json:"system,omitempty"`
}

// AssertSystemAvatarsRequired checks if the required fields are not zero-ed
func AssertSystemAvatarsRequired(obj SystemAvatars) error {
	return nil
}

// AssertSystemAvatarsConstraints checks if the values respects the defined constraints
func AssertSystemAvatarsConstraints(obj SystemAvatars) error {
	return nil
}
