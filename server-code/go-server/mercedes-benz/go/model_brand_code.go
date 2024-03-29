/*
 * Dealer
 *
 * The Dealer API provides Dealer search functions.
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BrandCode struct {

	Brand Brand `json:"brand"`
}

// AssertBrandCodeRequired checks if the required fields are not zero-ed
func AssertBrandCodeRequired(obj BrandCode) error {
	elements := map[string]interface{}{
		"brand": obj.Brand,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertBrandRequired(obj.Brand); err != nil {
		return err
	}
	return nil
}

// AssertBrandCodeConstraints checks if the values respects the defined constraints
func AssertBrandCodeConstraints(obj BrandCode) error {
	return nil
}
