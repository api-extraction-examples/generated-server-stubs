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

// CreatedIssues - Details about the issues created and the errors for requests that failed.
type CreatedIssues struct {

	// Error details for failed issue creation requests.
	Errors []BulkOperationErrorResult `json:"errors,omitempty"`

	// Details of the issues created.
	Issues []CreatedIssue `json:"issues,omitempty"`
}