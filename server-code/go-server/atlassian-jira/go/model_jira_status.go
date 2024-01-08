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




// JiraStatus - Details of a status.
type JiraStatus struct {

	// The description of the status.
	Description string `json:"description,omitempty"`

	// The ID of the status.
	Id string `json:"id,omitempty"`

	// The name of the status.
	Name string `json:"name,omitempty"`

	Scope StatusScope `json:"scope,omitempty"`

	// The category of the status.
	StatusCategory string `json:"statusCategory,omitempty"`

	// Projects and issue types where the status is used. Only available if the `usages` expand is requested.
	Usages []ProjectIssueTypes `json:"usages,omitempty"`
}

// AssertJiraStatusRequired checks if the required fields are not zero-ed
func AssertJiraStatusRequired(obj JiraStatus) error {
	if err := AssertStatusScopeRequired(obj.Scope); err != nil {
		return err
	}
	for _, el := range obj.Usages {
		if err := AssertProjectIssueTypesRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertJiraStatusConstraints checks if the values respects the defined constraints
func AssertJiraStatusConstraints(obj JiraStatus) error {
	return nil
}