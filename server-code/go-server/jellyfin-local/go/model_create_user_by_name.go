/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// CreateUserByName - The create user by name request body.
type CreateUserByName struct {

	// Gets or sets the username.
	Name *string `json:"Name,omitempty"`

	// Gets or sets the password.
	Password *string `json:"Password,omitempty"`
}

// AssertCreateUserByNameRequired checks if the required fields are not zero-ed
func AssertCreateUserByNameRequired(obj CreateUserByName) error {
	return nil
}

// AssertCreateUserByNameConstraints checks if the values respects the defined constraints
func AssertCreateUserByNameConstraints(obj CreateUserByName) error {
	return nil
}