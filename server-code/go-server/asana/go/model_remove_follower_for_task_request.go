/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type RemoveFollowerForTaskRequest struct {

	Data TaskRemoveFollowersRequest `json:"data,omitempty"`
}

// AssertRemoveFollowerForTaskRequestRequired checks if the required fields are not zero-ed
func AssertRemoveFollowerForTaskRequestRequired(obj RemoveFollowerForTaskRequest) error {
	if err := AssertTaskRemoveFollowersRequestRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertRemoveFollowerForTaskRequestConstraints checks if the values respects the defined constraints
func AssertRemoveFollowerForTaskRequestConstraints(obj RemoveFollowerForTaskRequest) error {
	return nil
}
