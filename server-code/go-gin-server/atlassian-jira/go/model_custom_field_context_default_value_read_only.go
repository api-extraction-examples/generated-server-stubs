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

// CustomFieldContextDefaultValueReadOnly - The default text for a read only custom field.
type CustomFieldContextDefaultValueReadOnly struct {

	// The default text. The maximum length is 255 characters.
	Text string `json:"text,omitempty"`

	Type string `json:"type"`
}
