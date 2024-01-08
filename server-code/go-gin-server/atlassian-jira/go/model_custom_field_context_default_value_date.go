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

// CustomFieldContextDefaultValueDate - The default value for a Date custom field.
type CustomFieldContextDefaultValueDate struct {

	// The default date in ISO format. Ignored if `useCurrent` is true.
	Date string `json:"date,omitempty"`

	Type string `json:"type"`

	// Whether to use the current date.
	UseCurrent bool `json:"useCurrent,omitempty"`
}