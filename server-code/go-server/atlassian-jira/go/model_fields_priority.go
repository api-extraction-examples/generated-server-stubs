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




// FieldsPriority - The priority of the linked issue.
type FieldsPriority struct {

	// The description of the issue priority.
	Description string `json:"description,omitempty"`

	// The URL of the icon for the issue priority.
	IconUrl string `json:"iconUrl,omitempty"`

	// The ID of the issue priority.
	Id string `json:"id,omitempty"`

	// Whether this priority is the default.
	IsDefault bool `json:"isDefault,omitempty"`

	// The name of the issue priority.
	Name string `json:"name,omitempty"`

	// The URL of the issue priority.
	Self string `json:"self,omitempty"`

	// The color used to indicate the issue priority.
	StatusColor string `json:"statusColor,omitempty"`
}

// AssertFieldsPriorityRequired checks if the required fields are not zero-ed
func AssertFieldsPriorityRequired(obj FieldsPriority) error {
	return nil
}

// AssertFieldsPriorityConstraints checks if the values respects the defined constraints
func AssertFieldsPriorityConstraints(obj FieldsPriority) error {
	return nil
}
