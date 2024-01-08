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




// ProjectDetails - Details about a project.
type ProjectDetails struct {

	AvatarUrls ProjectAvatarUrls `json:"avatarUrls,omitempty"`

	// The ID of the project.
	Id string `json:"id,omitempty"`

	// The key of the project.
	Key string `json:"key,omitempty"`

	// The name of the project.
	Name string `json:"name,omitempty"`

	ProjectCategory ProjectDetailsProjectCategory `json:"projectCategory,omitempty"`

	// The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
	ProjectTypeKey string `json:"projectTypeKey,omitempty"`

	// The URL of the project details.
	Self string `json:"self,omitempty"`

	// Whether or not the project is simplified.
	Simplified bool `json:"simplified,omitempty"`
}

// AssertProjectDetailsRequired checks if the required fields are not zero-ed
func AssertProjectDetailsRequired(obj ProjectDetails) error {
	if err := AssertProjectAvatarUrlsRequired(obj.AvatarUrls); err != nil {
		return err
	}
	if err := AssertProjectDetailsProjectCategoryRequired(obj.ProjectCategory); err != nil {
		return err
	}
	return nil
}

// AssertProjectDetailsConstraints checks if the values respects the defined constraints
func AssertProjectDetailsConstraints(obj ProjectDetails) error {
	return nil
}