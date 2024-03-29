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
