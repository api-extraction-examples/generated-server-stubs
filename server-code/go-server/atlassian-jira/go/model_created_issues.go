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

// AssertCreatedIssuesRequired checks if the required fields are not zero-ed
func AssertCreatedIssuesRequired(obj CreatedIssues) error {
	for _, el := range obj.Errors {
		if err := AssertBulkOperationErrorResultRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Issues {
		if err := AssertCreatedIssueRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCreatedIssuesConstraints checks if the values respects the defined constraints
func AssertCreatedIssuesConstraints(obj CreatedIssues) error {
	return nil
}