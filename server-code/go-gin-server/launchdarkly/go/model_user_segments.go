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

type UserSegments struct {

	Links Links `json:"_links,omitempty"`

	Items []UserSegment `json:"items,omitempty"`
}
