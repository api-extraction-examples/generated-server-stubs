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

type PostDestinationRequest struct {

	// destination-specific configuration.
	Config map[string]interface{} `json:"config"`

	// The data export destination type. Available choices are kinesis, google-pubsub, mparticle, or segment.
	Kind string `json:"kind"`

	// A human-readable name for your data export destination.
	Name string `json:"name"`

	// Whether the data export destination is on or not.
	True bool `json:"true,omitempty"`
}
