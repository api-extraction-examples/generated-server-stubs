/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0
 * Contact: sardo@hey.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// Error - Represents an error message.
type Error struct {

	Error string `json:"error"`

	ErrorDescription string `json:"error_description,omitempty"`
}

// AssertErrorRequired checks if the required fields are not zero-ed
func AssertErrorRequired(obj Error) error {
	elements := map[string]interface{}{
		"error": obj.Error,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertErrorConstraints checks if the values respects the defined constraints
func AssertErrorConstraints(obj Error) error {
	return nil
}
