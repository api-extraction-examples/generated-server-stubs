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




type StreamUsageError struct {

	Code string `json:"code,omitempty"`

	Message string `json:"message,omitempty"`
}

// AssertStreamUsageErrorRequired checks if the required fields are not zero-ed
func AssertStreamUsageErrorRequired(obj StreamUsageError) error {
	return nil
}

// AssertStreamUsageErrorConstraints checks if the values respects the defined constraints
func AssertStreamUsageErrorConstraints(obj StreamUsageError) error {
	return nil
}
