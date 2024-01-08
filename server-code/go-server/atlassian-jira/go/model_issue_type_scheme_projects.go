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




// IssueTypeSchemeProjects - Issue type scheme with a list of the projects that use it.
type IssueTypeSchemeProjects struct {

	IssueTypeScheme IssueTypeScheme `json:"issueTypeScheme"`

	// The IDs of the projects using the issue type scheme.
	ProjectIds []string `json:"projectIds"`
}

// AssertIssueTypeSchemeProjectsRequired checks if the required fields are not zero-ed
func AssertIssueTypeSchemeProjectsRequired(obj IssueTypeSchemeProjects) error {
	elements := map[string]interface{}{
		"issueTypeScheme": obj.IssueTypeScheme,
		"projectIds": obj.ProjectIds,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertIssueTypeSchemeRequired(obj.IssueTypeScheme); err != nil {
		return err
	}
	return nil
}

// AssertIssueTypeSchemeProjectsConstraints checks if the values respects the defined constraints
func AssertIssueTypeSchemeProjectsConstraints(obj IssueTypeSchemeProjects) error {
	return nil
}
