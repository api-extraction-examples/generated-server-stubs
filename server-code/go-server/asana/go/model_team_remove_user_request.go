/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// TeamRemoveUserRequest - A user identification object for specification with the addUser/removeUser endpoints.
type TeamRemoveUserRequest struct {

	// A string identifying a user. This can either be the string \"me\", an email, or the gid of a user.
	User string `json:"user,omitempty"`
}

// AssertTeamRemoveUserRequestRequired checks if the required fields are not zero-ed
func AssertTeamRemoveUserRequestRequired(obj TeamRemoveUserRequest) error {
	return nil
}

// AssertTeamRemoveUserRequestConstraints checks if the values respects the defined constraints
func AssertTeamRemoveUserRequestConstraints(obj TeamRemoveUserRequest) error {
	return nil
}
