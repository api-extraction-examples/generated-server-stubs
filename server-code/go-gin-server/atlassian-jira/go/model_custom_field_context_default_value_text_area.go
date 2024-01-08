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

// CustomFieldContextDefaultValueTextArea - The default text for a text area custom field.
type CustomFieldContextDefaultValueTextArea struct {

	// The default text. The maximum length is 32767 characters.
	Text string `json:"text,omitempty"`

	Type string `json:"type"`
}
