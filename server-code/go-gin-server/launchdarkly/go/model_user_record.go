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

type UserRecord struct {

	Avatar string `json:"avatar,omitempty"`

	EnvironmentId string `json:"environmentId,omitempty"`

	LastPing string `json:"lastPing,omitempty"`

	// The unique resource id.
	OwnerId string `json:"ownerId,omitempty"`

	User User `json:"user,omitempty"`
}
