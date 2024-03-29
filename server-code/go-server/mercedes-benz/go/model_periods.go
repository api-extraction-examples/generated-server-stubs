/*
 * Dealer
 *
 * The Dealer API provides Dealer search functions.
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type Periods struct {

	// from
	From string `json:"from"`

	// until
	Until string `json:"until"`
}

// AssertPeriodsRequired checks if the required fields are not zero-ed
func AssertPeriodsRequired(obj Periods) error {
	elements := map[string]interface{}{
		"from": obj.From,
		"until": obj.Until,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPeriodsConstraints checks if the values respects the defined constraints
func AssertPeriodsConstraints(obj Periods) error {
	return nil
}
