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




// ProjectCategory - A project category.
type ProjectCategory struct {

	// The description of the project category.
	Description string `json:"description,omitempty"`

	// The ID of the project category.
	Id string `json:"id,omitempty"`

	// The name of the project category. Required on create, optional on update.
	Name string `json:"name,omitempty"`

	// The URL of the project category.
	Self string `json:"self,omitempty"`
}

// AssertProjectCategoryRequired checks if the required fields are not zero-ed
func AssertProjectCategoryRequired(obj ProjectCategory) error {
	return nil
}

// AssertProjectCategoryConstraints checks if the values respects the defined constraints
func AssertProjectCategoryConstraints(obj ProjectCategory) error {
	return nil
}