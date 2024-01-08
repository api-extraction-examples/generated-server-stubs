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

// FieldsStatus - The status of the linked issue.
type FieldsStatus struct {

	// The description of the status.
	Description string `json:"description,omitempty"`

	// The URL of the icon used to represent the status.
	IconUrl string `json:"iconUrl,omitempty"`

	// The ID of the status.
	Id string `json:"id,omitempty"`

	// The name of the status.
	Name string `json:"name,omitempty"`

	// The URL of the status.
	Self string `json:"self,omitempty"`

	StatusCategory StatusDetailsStatusCategory `json:"statusCategory,omitempty"`
}
