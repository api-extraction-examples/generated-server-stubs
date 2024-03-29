/*
 * Dealer
 *
 * The Dealer API provides Dealer search functions.
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ProductGroupOfAFunction struct {

	// The product group code, valid values are:   * PASSENGER-CAR   * VAN
	Code string `json:"code"`

	// product group name
	Name string `json:"name"`
}

// AssertProductGroupOfAFunctionRequired checks if the required fields are not zero-ed
func AssertProductGroupOfAFunctionRequired(obj ProductGroupOfAFunction) error {
	elements := map[string]interface{}{
		"code": obj.Code,
		"name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertProductGroupOfAFunctionConstraints checks if the values respects the defined constraints
func AssertProductGroupOfAFunctionConstraints(obj ProductGroupOfAFunction) error {
	return nil
}
