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




type IntegrationSubscriptionStatus struct {

	ErrorCount int32 `json:"errorCount,omitempty"`

	// A unix epoch time in milliseconds specifying the last time this integration was successfully used.
	LastSuccess int64 `json:"lastSuccess,omitempty"`

	SuccessCount int32 `json:"successCount,omitempty"`
}

// AssertIntegrationSubscriptionStatusRequired checks if the required fields are not zero-ed
func AssertIntegrationSubscriptionStatusRequired(obj IntegrationSubscriptionStatus) error {
	return nil
}

// AssertIntegrationSubscriptionStatusConstraints checks if the values respects the defined constraints
func AssertIntegrationSubscriptionStatusConstraints(obj IntegrationSubscriptionStatus) error {
	return nil
}
