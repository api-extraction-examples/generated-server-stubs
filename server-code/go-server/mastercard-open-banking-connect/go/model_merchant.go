/*
 * Open Banking - Payments initiation service
 *
 * Open Banking - Payments initiation service
 *
 * API version: 1.16.0
 * Contact: apisupport@mastercard.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// Merchant - Marchant Object
type Merchant struct {

	// Merchant id
	Id string `json:"id"`

	// Merchant name
	Name string `json:"name"`
}

// AssertMerchantRequired checks if the required fields are not zero-ed
func AssertMerchantRequired(obj Merchant) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertMerchantConstraints checks if the values respects the defined constraints
func AssertMerchantConstraints(obj Merchant) error {
	return nil
}
