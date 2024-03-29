/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AddTagForTaskRequest struct {

	Data TaskAddTagRequest `json:"data,omitempty"`
}

// AssertAddTagForTaskRequestRequired checks if the required fields are not zero-ed
func AssertAddTagForTaskRequestRequired(obj AddTagForTaskRequest) error {
	if err := AssertTaskAddTagRequestRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAddTagForTaskRequestConstraints checks if the values respects the defined constraints
func AssertAddTagForTaskRequestConstraints(obj AddTagForTaskRequest) error {
	return nil
}
