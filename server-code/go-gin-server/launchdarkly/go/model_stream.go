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

type Stream struct {

	Links StreamUsageLinks `json:"_links,omitempty"`

	Metadata []StreamUsageMetadata `json:"metadata,omitempty"`

	Series []StreamUsageSeries `json:"series,omitempty"`
}
