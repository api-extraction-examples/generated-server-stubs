/*
 * Dealer
 *
 * The Dealer API provides Dealer search functions.
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type Country struct {

	// the country id
	CountryId string `json:"countryId"`

	// the country iso code
	IsoCode string `json:"isoCode"`

	// the country name
	Name string `json:"name"`
}

// AssertCountryRequired checks if the required fields are not zero-ed
func AssertCountryRequired(obj Country) error {
	elements := map[string]interface{}{
		"countryId": obj.CountryId,
		"isoCode": obj.IsoCode,
		"name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertCountryConstraints checks if the values respects the defined constraints
func AssertCountryConstraints(obj Country) error {
	return nil
}