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

// CreateWorkflowStatusDetails - The details of a transition status.
type CreateWorkflowStatusDetails struct {

	// The ID of the status.
	Id string `json:"id"`

	// The properties of the status.
	Properties map[string]string `json:"properties,omitempty"`
}