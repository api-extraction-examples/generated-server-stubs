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

type Project struct {

	// The unique resource id.
	Id string `json:"_id,omitempty"`

	Links Links `json:"_links,omitempty"`

	DefaultClientSideAvailability ClientSideAvailability `json:"defaultClientSideAvailability,omitempty"`

	Environments []Environment `json:"environments,omitempty"`

	IncludeInSnippetByDefault bool `json:"includeInSnippetByDefault,omitempty"`

	Key string `json:"key,omitempty"`

	Name string `json:"name,omitempty"`

	// An array of tags for this project.
	Tags []string `json:"tags,omitempty"`
}
