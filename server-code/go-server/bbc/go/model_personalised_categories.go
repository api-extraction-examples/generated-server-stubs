/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PersonalisedCategories struct {

	Created string `json:"created"`

	Type string `json:"type"`
}

// AssertPersonalisedCategoriesRequired checks if the required fields are not zero-ed
func AssertPersonalisedCategoriesRequired(obj PersonalisedCategories) error {
	elements := map[string]interface{}{
		"created": obj.Created,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPersonalisedCategoriesConstraints checks if the values respects the defined constraints
func AssertPersonalisedCategoriesConstraints(obj PersonalisedCategories) error {
	return nil
}
