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

type Statement struct {

	Actions []string `json:"actions,omitempty"`

	Effect string `json:"effect,omitempty"`

	// Targeted actions will be those actions NOT in this list. The \"actions\" field must be empty to use this field.
	NotActions []string `json:"notActions,omitempty"`

	// Targeted resource will be those resources NOT in this list. The \"resources`\" field must be empty to use this field.
	NotResources []string `json:"notResources,omitempty"`

	Resources []string `json:"resources,omitempty"`
}
