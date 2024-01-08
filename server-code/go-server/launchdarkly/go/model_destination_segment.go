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




type DestinationSegment struct {

	WriteKey string `json:"writeKey,omitempty"`
}

// AssertDestinationSegmentRequired checks if the required fields are not zero-ed
func AssertDestinationSegmentRequired(obj DestinationSegment) error {
	return nil
}

// AssertDestinationSegmentConstraints checks if the values respects the defined constraints
func AssertDestinationSegmentConstraints(obj DestinationSegment) error {
	return nil
}
