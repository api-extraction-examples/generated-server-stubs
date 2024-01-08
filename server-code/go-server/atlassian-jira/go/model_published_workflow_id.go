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




// PublishedWorkflowId - Properties that identify a published workflow.
type PublishedWorkflowId struct {

	// The entity ID of the workflow.
	EntityId string `json:"entityId,omitempty"`

	// The name of the workflow.
	Name string `json:"name"`
}

// AssertPublishedWorkflowIdRequired checks if the required fields are not zero-ed
func AssertPublishedWorkflowIdRequired(obj PublishedWorkflowId) error {
	elements := map[string]interface{}{
		"name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPublishedWorkflowIdConstraints checks if the values respects the defined constraints
func AssertPublishedWorkflowIdConstraints(obj PublishedWorkflowId) error {
	return nil
}
