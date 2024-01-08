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




// PropertyKey - Property key details.
type PropertyKey struct {

	// The key of the property.
	Key string `json:"key,omitempty"`

	// The URL of the property.
	Self string `json:"self,omitempty"`
}

// AssertPropertyKeyRequired checks if the required fields are not zero-ed
func AssertPropertyKeyRequired(obj PropertyKey) error {
	return nil
}

// AssertPropertyKeyConstraints checks if the values respects the defined constraints
func AssertPropertyKeyConstraints(obj PropertyKey) error {
	return nil
}