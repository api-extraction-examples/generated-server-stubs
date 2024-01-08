/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// UpdateUserEasyPassword - The update user easy password request body.
type UpdateUserEasyPassword struct {

	// Gets or sets the new sha1-hashed password.
	NewPassword *string `json:"NewPassword,omitempty"`

	// Gets or sets the new password.
	NewPw *string `json:"NewPw,omitempty"`

	// Gets or sets a value indicating whether to reset the password.
	ResetPassword bool `json:"ResetPassword,omitempty"`
}

// AssertUpdateUserEasyPasswordRequired checks if the required fields are not zero-ed
func AssertUpdateUserEasyPasswordRequired(obj UpdateUserEasyPassword) error {
	return nil
}

// AssertUpdateUserEasyPasswordConstraints checks if the values respects the defined constraints
func AssertUpdateUserEasyPasswordConstraints(obj UpdateUserEasyPassword) error {
	return nil
}