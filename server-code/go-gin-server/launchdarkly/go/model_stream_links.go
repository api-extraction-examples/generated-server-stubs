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

type StreamLinks struct {

	Parent Link `json:"parent,omitempty"`

	Self Link `json:"self,omitempty"`

	// Links to endpoints that are in the request path.
	Subseries []Link `json:"subseries,omitempty"`
}
