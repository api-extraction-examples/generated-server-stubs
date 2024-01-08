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

type FeatureFlagStatusAcrossEnvironments struct {

	Links FeatureFlagStatusLinks `json:"_links,omitempty"`

	Environments map[string]FeatureFlagStatusForQueriedEnvironment `json:"environments,omitempty"`

	Key string `json:"key,omitempty"`
}
