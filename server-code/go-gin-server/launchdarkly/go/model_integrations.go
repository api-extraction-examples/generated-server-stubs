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

type Integrations struct {

	// A mapping of integration types to their respective API endpoints.
	Links map[string]interface{} `json:"_links,omitempty"`

	Items []IntegrationSubscription `json:"items,omitempty"`
}