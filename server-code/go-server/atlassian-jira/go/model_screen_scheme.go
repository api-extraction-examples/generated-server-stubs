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




// ScreenScheme - A screen scheme.
type ScreenScheme struct {

	// The description of the screen scheme.
	Description string `json:"description,omitempty"`

	// The ID of the screen scheme.
	Id int64 `json:"id,omitempty"`

	IssueTypeScreenSchemes PageBeanIssueTypeScreenScheme `json:"issueTypeScreenSchemes,omitempty"`

	// The name of the screen scheme.
	Name string `json:"name,omitempty"`

	Screens ScreenTypes `json:"screens,omitempty"`
}

// AssertScreenSchemeRequired checks if the required fields are not zero-ed
func AssertScreenSchemeRequired(obj ScreenScheme) error {
	if err := AssertPageBeanIssueTypeScreenSchemeRequired(obj.IssueTypeScreenSchemes); err != nil {
		return err
	}
	if err := AssertScreenTypesRequired(obj.Screens); err != nil {
		return err
	}
	return nil
}

// AssertScreenSchemeConstraints checks if the values respects the defined constraints
func AssertScreenSchemeConstraints(obj ScreenScheme) error {
	return nil
}
