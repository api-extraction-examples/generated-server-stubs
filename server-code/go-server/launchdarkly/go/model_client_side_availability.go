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




type ClientSideAvailability struct {

	// When set to true, this flag will be available to SDKs using the client-side id.
	UsingEnvironmentId bool `json:"usingEnvironmentId,omitempty"`

	// When set to true, this flag will be available to SDKS using a mobile key.
	UsingMobileKey bool `json:"usingMobileKey,omitempty"`
}

// AssertClientSideAvailabilityRequired checks if the required fields are not zero-ed
func AssertClientSideAvailabilityRequired(obj ClientSideAvailability) error {
	return nil
}

// AssertClientSideAvailabilityConstraints checks if the values respects the defined constraints
func AssertClientSideAvailabilityConstraints(obj ClientSideAvailability) error {
	return nil
}
