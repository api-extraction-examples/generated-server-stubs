/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type RemoveProjectForTaskRequest struct {

	Data TaskRemoveProjectRequest `json:"data,omitempty"`
}

// AssertRemoveProjectForTaskRequestRequired checks if the required fields are not zero-ed
func AssertRemoveProjectForTaskRequestRequired(obj RemoveProjectForTaskRequest) error {
	if err := AssertTaskRemoveProjectRequestRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertRemoveProjectForTaskRequestConstraints checks if the values respects the defined constraints
func AssertRemoveProjectForTaskRequestConstraints(obj RemoveProjectForTaskRequest) error {
	return nil
}