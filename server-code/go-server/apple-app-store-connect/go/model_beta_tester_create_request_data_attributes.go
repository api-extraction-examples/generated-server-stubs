/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BetaTesterCreateRequestDataAttributes struct {

	Email string `json:"email"`

	FirstName string `json:"firstName,omitempty"`

	LastName string `json:"lastName,omitempty"`
}

// AssertBetaTesterCreateRequestDataAttributesRequired checks if the required fields are not zero-ed
func AssertBetaTesterCreateRequestDataAttributesRequired(obj BetaTesterCreateRequestDataAttributes) error {
	elements := map[string]interface{}{
		"email": obj.Email,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertBetaTesterCreateRequestDataAttributesConstraints checks if the values respects the defined constraints
func AssertBetaTesterCreateRequestDataAttributesConstraints(obj BetaTesterCreateRequestDataAttributes) error {
	return nil
}
