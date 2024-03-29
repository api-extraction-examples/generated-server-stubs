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

type StreamSdkVersion struct {

	Links StreamBySdkLinks `json:"_links,omitempty"`

	SdkVersions []StreamSdkVersionData `json:"sdkVersions,omitempty"`
}
