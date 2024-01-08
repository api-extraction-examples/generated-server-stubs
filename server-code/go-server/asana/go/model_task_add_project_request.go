/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type TaskAddProjectRequest struct {

	// A task in the project to insert the task after, or `null` to insert at the beginning of the list.
	InsertAfter *string `json:"insert_after,omitempty"`

	// A task in the project to insert the task before, or `null` to insert at the end of the list.
	InsertBefore *string `json:"insert_before,omitempty"`

	// The project to add the task to.
	Project string `json:"project"`

	// A section in the project to insert the task into. The task will be inserted at the bottom of the section.
	Section *string `json:"section,omitempty"`
}

// AssertTaskAddProjectRequestRequired checks if the required fields are not zero-ed
func AssertTaskAddProjectRequestRequired(obj TaskAddProjectRequest) error {
	elements := map[string]interface{}{
		"project": obj.Project,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertTaskAddProjectRequestConstraints checks if the values respects the defined constraints
func AssertTaskAddProjectRequestConstraints(obj TaskAddProjectRequest) error {
	return nil
}
