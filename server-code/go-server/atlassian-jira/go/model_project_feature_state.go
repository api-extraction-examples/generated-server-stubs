/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// ProjectFeatureState - Details of the feature state.
type ProjectFeatureState struct {

	// The feature state.
	State string `json:"state,omitempty"`
}

// AssertProjectFeatureStateRequired checks if the required fields are not zero-ed
func AssertProjectFeatureStateRequired(obj ProjectFeatureState) error {
	return nil
}

// AssertProjectFeatureStateConstraints checks if the values respects the defined constraints
func AssertProjectFeatureStateConstraints(obj ProjectFeatureState) error {
	return nil
}