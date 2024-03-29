/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * API version: 5.3.0
 * Contact: support@launchdarkly.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type EnvironmentPost struct {

	// A color swatch (as an RGB hex value with no leading '#', e.g. C8C8C8).
	Color string `json:"color"`

	// Determines if this environment requires confirmation for flag and segment changes.
	ConfirmChanges bool `json:"confirmChanges,omitempty"`

	// Set to true to send detailed event information for newly created flags.
	DefaultTrackEvents bool `json:"defaultTrackEvents,omitempty"`

	// The default TTL for the new environment.
	DefaultTtl float32 `json:"defaultTtl,omitempty"`

	// A project-unique key for the new environment.
	Key string `json:"key"`

	// The name of the new environment.
	Name string `json:"name"`

	// Determines if this environment requires comments for flag and segment changes.
	RequireComments bool `json:"requireComments,omitempty"`

	// Determines whether the environment is in secure mode.
	SecureMode bool `json:"secureMode,omitempty"`

	// An array of tags for this environment.
	Tags []string `json:"tags,omitempty"`
}

// AssertEnvironmentPostRequired checks if the required fields are not zero-ed
func AssertEnvironmentPostRequired(obj EnvironmentPost) error {
	elements := map[string]interface{}{
		"color": obj.Color,
		"key": obj.Key,
		"name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertEnvironmentPostConstraints checks if the values respects the defined constraints
func AssertEnvironmentPostConstraints(obj EnvironmentPost) error {
	return nil
}
