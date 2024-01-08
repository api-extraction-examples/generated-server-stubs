/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type RemoveTagForTaskRequest struct {

	Data TaskRemoveTagRequest `json:"data,omitempty"`
}

// AssertRemoveTagForTaskRequestRequired checks if the required fields are not zero-ed
func AssertRemoveTagForTaskRequestRequired(obj RemoveTagForTaskRequest) error {
	if err := AssertTaskRemoveTagRequestRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertRemoveTagForTaskRequestConstraints checks if the values respects the defined constraints
func AssertRemoveTagForTaskRequestConstraints(obj RemoveTagForTaskRequest) error {
	return nil
}
