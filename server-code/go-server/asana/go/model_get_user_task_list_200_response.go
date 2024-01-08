/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type GetUserTaskList200Response struct {

	Data UserTaskListCompact `json:"data,omitempty"`
}

// AssertGetUserTaskList200ResponseRequired checks if the required fields are not zero-ed
func AssertGetUserTaskList200ResponseRequired(obj GetUserTaskList200Response) error {
	if err := AssertUserTaskListCompactRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertGetUserTaskList200ResponseConstraints checks if the values respects the defined constraints
func AssertGetUserTaskList200ResponseConstraints(obj GetUserTaskList200Response) error {
	return nil
}
