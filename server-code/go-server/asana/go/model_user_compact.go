/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type UserCompact struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// *Read-only except when same user as requester*. The user’s name.
	Name string `json:"name,omitempty"`
}

// AssertUserCompactRequired checks if the required fields are not zero-ed
func AssertUserCompactRequired(obj UserCompact) error {
	return nil
}

// AssertUserCompactConstraints checks if the values respects the defined constraints
func AssertUserCompactConstraints(obj UserCompact) error {
	return nil
}
