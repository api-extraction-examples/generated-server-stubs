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

type FeatureFlagConfig struct {

	EnvironmentName string `json:"_environmentName,omitempty"`

	Site Site `json:"_site,omitempty"`

	Archived bool `json:"archived,omitempty"`

	Fallthrough Fallthrough `json:"fallthrough,omitempty"`

	LastModified int64 `json:"lastModified,omitempty"`

	OffVariation int32 `json:"offVariation,omitempty"`

	True bool `json:"true,omitempty"`

	Prerequisites []Prerequisite `json:"prerequisites,omitempty"`

	Rules []Rule `json:"rules,omitempty"`

	Salt string `json:"salt,omitempty"`

	Sel string `json:"sel,omitempty"`

	Targets []Target `json:"targets,omitempty"`

	// Set to true to send detailed event information for this flag.
	TrackEvents bool `json:"trackEvents,omitempty"`

	// Set to true to send detailed event information when targeting is enabled but no individual targeting rule is matched.
	TrackEventsFallthrough bool `json:"trackEventsFallthrough,omitempty"`

	Version int32 `json:"version,omitempty"`
}
