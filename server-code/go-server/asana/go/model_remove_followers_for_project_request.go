/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type RemoveFollowersForProjectRequest struct {

	Data RemoveFollowersRequest `json:"data,omitempty"`
}

// AssertRemoveFollowersForProjectRequestRequired checks if the required fields are not zero-ed
func AssertRemoveFollowersForProjectRequestRequired(obj RemoveFollowersForProjectRequest) error {
	if err := AssertRemoveFollowersRequestRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertRemoveFollowersForProjectRequestConstraints checks if the values respects the defined constraints
func AssertRemoveFollowersForProjectRequestConstraints(obj RemoveFollowersForProjectRequest) error {
	return nil
}
