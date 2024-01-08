/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ProjectTemplateResponse struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// Name of the project template.
	Name string `json:"name,omitempty"`

	// Color of the project template.
	Color *string `json:"color,omitempty"`

	// Free-form textual information associated with the project template
	Description string `json:"description,omitempty"`

	// The description of the project template with formatting as HTML.
	HtmlDescription string `json:"html_description,omitempty"`

	Owner *ProjectTemplateBaseAllOfOwner `json:"owner,omitempty"`

	// True if the project template is public to its team.
	Public bool `json:"public,omitempty"`

	// Array of date variables in this project template. Calendar dates must be provided for these variables when instantiating a project.
	RequestedDates []DateVariableCompact `json:"requested_dates,omitempty"`

	Team ProjectTemplateBaseAllOfTeam `json:"team,omitempty"`
}

// AssertProjectTemplateResponseRequired checks if the required fields are not zero-ed
func AssertProjectTemplateResponseRequired(obj ProjectTemplateResponse) error {
	if obj.Owner != nil {
		if err := AssertProjectTemplateBaseAllOfOwnerRequired(*obj.Owner); err != nil {
			return err
		}
	}
	for _, el := range obj.RequestedDates {
		if err := AssertDateVariableCompactRequired(el); err != nil {
			return err
		}
	}
	if err := AssertProjectTemplateBaseAllOfTeamRequired(obj.Team); err != nil {
		return err
	}
	return nil
}

// AssertProjectTemplateResponseConstraints checks if the values respects the defined constraints
func AssertProjectTemplateResponseConstraints(obj ProjectTemplateResponse) error {
	return nil
}
