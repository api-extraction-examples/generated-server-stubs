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

type User struct {

	Anonymous bool `json:"anonymous,omitempty"`

	Avatar string `json:"avatar,omitempty"`

	Country string `json:"country,omitempty"`

	Custom map[string]interface{} `json:"custom,omitempty"`

	Email string `json:"email,omitempty"`

	FirstName string `json:"firstName,omitempty"`

	Ip string `json:"ip,omitempty"`

	Key string `json:"key,omitempty"`

	LastName string `json:"lastName,omitempty"`

	Name string `json:"name,omitempty"`

	Secondary string `json:"secondary,omitempty"`
}
