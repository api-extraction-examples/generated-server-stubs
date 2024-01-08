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




// IssueSecuritySchemeToProjectMapping - Details about an project using security scheme mapping.
type IssueSecuritySchemeToProjectMapping struct {

	IssueSecuritySchemeId string `json:"issueSecuritySchemeId,omitempty"`

	ProjectId string `json:"projectId,omitempty"`
}

// AssertIssueSecuritySchemeToProjectMappingRequired checks if the required fields are not zero-ed
func AssertIssueSecuritySchemeToProjectMappingRequired(obj IssueSecuritySchemeToProjectMapping) error {
	return nil
}

// AssertIssueSecuritySchemeToProjectMappingConstraints checks if the values respects the defined constraints
func AssertIssueSecuritySchemeToProjectMappingConstraints(obj IssueSecuritySchemeToProjectMapping) error {
	return nil
}
