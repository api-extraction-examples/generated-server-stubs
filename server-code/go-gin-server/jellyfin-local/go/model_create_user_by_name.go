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
