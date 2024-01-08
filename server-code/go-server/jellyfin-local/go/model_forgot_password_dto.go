/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// ForgotPasswordDto - Forgot Password request body DTO.
type ForgotPasswordDto struct {

	// Gets or sets the entered username to have its password reset.
	EnteredUsername string `json:"EnteredUsername"`
}

// AssertForgotPasswordDtoRequired checks if the required fields are not zero-ed
func AssertForgotPasswordDtoRequired(obj ForgotPasswordDto) error {
	elements := map[string]interface{}{
		"EnteredUsername": obj.EnteredUsername,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertForgotPasswordDtoConstraints checks if the values respects the defined constraints
func AssertForgotPasswordDtoConstraints(obj ForgotPasswordDto) error {
	return nil
}