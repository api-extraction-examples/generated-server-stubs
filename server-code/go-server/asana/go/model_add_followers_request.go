/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AddFollowersRequest struct {

	Data TaskAddFollowersRequest `json:"data,omitempty"`
}

// AssertAddFollowersRequestRequired checks if the required fields are not zero-ed
func AssertAddFollowersRequestRequired(obj AddFollowersRequest) error {
	if err := AssertTaskAddFollowersRequestRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAddFollowersRequestConstraints checks if the values respects the defined constraints
func AssertAddFollowersRequestConstraints(obj AddFollowersRequest) error {
	return nil
}
