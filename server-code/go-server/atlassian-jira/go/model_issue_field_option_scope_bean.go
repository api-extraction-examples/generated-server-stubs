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




type IssueFieldOptionScopeBean struct {

	Global GlobalScopeBean `json:"global,omitempty"`

	// DEPRECATED
	Projects []int64 `json:"projects,omitempty"`

	// Defines the projects in which the option is available and the behavior of the option within each project. Specify one object per project. The behavior of the option in a project context overrides the behavior in the global context.
	Projects2 []ProjectScopeBean `json:"projects2,omitempty"`
}

// AssertIssueFieldOptionScopeBeanRequired checks if the required fields are not zero-ed
func AssertIssueFieldOptionScopeBeanRequired(obj IssueFieldOptionScopeBean) error {
	if err := AssertGlobalScopeBeanRequired(obj.Global); err != nil {
		return err
	}
	for _, el := range obj.Projects2 {
		if err := AssertProjectScopeBeanRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertIssueFieldOptionScopeBeanConstraints checks if the values respects the defined constraints
func AssertIssueFieldOptionScopeBeanConstraints(obj IssueFieldOptionScopeBean) error {
	return nil
}
