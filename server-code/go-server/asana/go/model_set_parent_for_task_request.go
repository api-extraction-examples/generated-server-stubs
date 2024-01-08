/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type SetParentForTaskRequest struct {

	Data TaskSetParentRequest `json:"data,omitempty"`
}

// AssertSetParentForTaskRequestRequired checks if the required fields are not zero-ed
func AssertSetParentForTaskRequestRequired(obj SetParentForTaskRequest) error {
	if err := AssertTaskSetParentRequestRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertSetParentForTaskRequestConstraints checks if the values respects the defined constraints
func AssertSetParentForTaskRequestConstraints(obj SetParentForTaskRequest) error {
	return nil
}