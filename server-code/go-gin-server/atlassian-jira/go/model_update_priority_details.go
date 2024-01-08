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

// UpdatePriorityDetails - Details of an issue priority.
type UpdatePriorityDetails struct {

	// The description of the priority.
	Description string `json:"description,omitempty"`

	// The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.
	IconUrl string `json:"iconUrl,omitempty"`

	// The name of the priority. Must be unique.
	Name string `json:"name,omitempty"`

	// The status color of the priority in 3-digit or 6-digit hexadecimal format.
	StatusColor string `json:"statusColor,omitempty"`
}
