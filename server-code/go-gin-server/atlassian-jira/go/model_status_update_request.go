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

// StatusUpdateRequest - The list of statuses that will be updated.
type StatusUpdateRequest struct {

	// The list of statuses that will be updated.
	Statuses []StatusUpdate `json:"statuses,omitempty"`
}