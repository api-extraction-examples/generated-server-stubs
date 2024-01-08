/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ProjectDuplicateRequest struct {

	// The elements that will be duplicated to the new project. Tasks are always included.
	Include string `json:"include,omitempty"`

	// The name of the new project.
	Name string `json:"name"`

	ScheduleDates ProjectDuplicateRequestScheduleDates `json:"schedule_dates,omitempty"`

	// Sets the team of the new project. If team is not defined, the new project will be in the same team as the the original project.
	Team string `json:"team,omitempty"`
}

// AssertProjectDuplicateRequestRequired checks if the required fields are not zero-ed
func AssertProjectDuplicateRequestRequired(obj ProjectDuplicateRequest) error {
	elements := map[string]interface{}{
		"name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertProjectDuplicateRequestScheduleDatesRequired(obj.ScheduleDates); err != nil {
		return err
	}
	return nil
}

// AssertProjectDuplicateRequestConstraints checks if the values respects the defined constraints
func AssertProjectDuplicateRequestConstraints(obj ProjectDuplicateRequest) error {
	return nil
}