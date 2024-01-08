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




type SimpleApplicationPropertyBean struct {

	// The ID of the application property.
	Id string `json:"id,omitempty"`

	// The new value.
	Value string `json:"value,omitempty"`
}

// AssertSimpleApplicationPropertyBeanRequired checks if the required fields are not zero-ed
func AssertSimpleApplicationPropertyBeanRequired(obj SimpleApplicationPropertyBean) error {
	return nil
}

// AssertSimpleApplicationPropertyBeanConstraints checks if the values respects the defined constraints
func AssertSimpleApplicationPropertyBeanConstraints(obj SimpleApplicationPropertyBean) error {
	return nil
}
