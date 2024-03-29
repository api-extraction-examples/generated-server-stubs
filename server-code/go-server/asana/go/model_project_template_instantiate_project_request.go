/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ProjectTemplateInstantiateProjectRequest struct {

	// *Optional*. If set to `true`, the endpoint returns an \"Unprocessable Entity\" error if you fail to provide a calendar date value for any date variable. If set to `false`, a default date is used for each unfulfilled date variable (e.g., the current date is used as the Start Date of a project).
	IsStrict bool `json:"is_strict,omitempty"`

	// The name of the new project.
	Name string `json:"name"`

	// Sets the project to public to its team.
	Public bool `json:"public"`

	// Array of mappings of date variables to calendar dates.
	RequestedDates []DateVariableRequest `json:"requested_dates,omitempty"`

	// *Conditional*. Sets the team of the new project. If the project template exists in an _organization_, you must specify a value for `team` and not `workspace`.
	Team string `json:"team,omitempty"`

	// *Conditional*. Sets the workspace of the new project. If the project template exists in a _workspace_, you must specify a value for `workspace` and not `team`.
	Workspace string `json:"workspace,omitempty"`
}

// AssertProjectTemplateInstantiateProjectRequestRequired checks if the required fields are not zero-ed
func AssertProjectTemplateInstantiateProjectRequestRequired(obj ProjectTemplateInstantiateProjectRequest) error {
	elements := map[string]interface{}{
		"name": obj.Name,
		"public": obj.Public,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.RequestedDates {
		if err := AssertDateVariableRequestRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertProjectTemplateInstantiateProjectRequestConstraints checks if the values respects the defined constraints
func AssertProjectTemplateInstantiateProjectRequestConstraints(obj ProjectTemplateInstantiateProjectRequest) error {
	return nil
}
