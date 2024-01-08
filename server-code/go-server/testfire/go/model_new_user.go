/*
 * AltoroJ REST API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0.2
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type NewUser struct {

	Firstname string `json:"firstname"`

	Lastname string `json:"lastname"`

	Password1 string `json:"password1"`

	Password2 string `json:"password2"`

	Username string `json:"username"`
}

// AssertNewUserRequired checks if the required fields are not zero-ed
func AssertNewUserRequired(obj NewUser) error {
	elements := map[string]interface{}{
		"firstname": obj.Firstname,
		"lastname": obj.Lastname,
		"password1": obj.Password1,
		"password2": obj.Password2,
		"username": obj.Username,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertNewUserConstraints checks if the values respects the defined constraints
func AssertNewUserConstraints(obj NewUser) error {
	return nil
}