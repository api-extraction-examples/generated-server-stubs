/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// UserTaskListCompactAllOfOwner - The owner of the user task list, i.e. the person whose My Tasks is represented by this resource.
type UserTaskListCompactAllOfOwner struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// *Read-only except when same user as requester*. The user’s name.
	Name string `json:"name,omitempty"`
}

// AssertUserTaskListCompactAllOfOwnerRequired checks if the required fields are not zero-ed
func AssertUserTaskListCompactAllOfOwnerRequired(obj UserTaskListCompactAllOfOwner) error {
	return nil
}

// AssertUserTaskListCompactAllOfOwnerConstraints checks if the values respects the defined constraints
func AssertUserTaskListCompactAllOfOwnerConstraints(obj UserTaskListCompactAllOfOwner) error {
	return nil
}
