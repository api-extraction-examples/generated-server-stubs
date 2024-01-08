/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// StartupUserDto - The startup user DTO.
type StartupUserDto struct {

	// Gets or sets the username.
	Name *string `json:"Name,omitempty"`

	// Gets or sets the user's password.
	Password *string `json:"Password,omitempty"`
}

// AssertStartupUserDtoRequired checks if the required fields are not zero-ed
func AssertStartupUserDtoRequired(obj StartupUserDto) error {
	return nil
}

// AssertStartupUserDtoConstraints checks if the values respects the defined constraints
func AssertStartupUserDtoConstraints(obj StartupUserDto) error {
	return nil
}
