/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AddDependentsForTaskRequest struct {

	Data ModifyDependentsRequest `json:"data,omitempty"`
}

// AssertAddDependentsForTaskRequestRequired checks if the required fields are not zero-ed
func AssertAddDependentsForTaskRequestRequired(obj AddDependentsForTaskRequest) error {
	if err := AssertModifyDependentsRequestRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAddDependentsForTaskRequestConstraints checks if the values respects the defined constraints
func AssertAddDependentsForTaskRequestConstraints(obj AddDependentsForTaskRequest) error {
	return nil
}
