/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type TaskRemoveProjectRequest struct {

	// The project to remove the task from.
	Project string `json:"project"`
}

// AssertTaskRemoveProjectRequestRequired checks if the required fields are not zero-ed
func AssertTaskRemoveProjectRequestRequired(obj TaskRemoveProjectRequest) error {
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

// AssertTaskRemoveProjectRequestConstraints checks if the values respects the defined constraints
func AssertTaskRemoveProjectRequestConstraints(obj TaskRemoveProjectRequest) error {
	return nil
}
