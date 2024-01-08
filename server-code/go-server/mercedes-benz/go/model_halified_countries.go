/*
 * Dealer
 *
 * The Dealer API provides Dealer search functions.
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// HalifiedCountries - countries and navigation links for additional results.
type HalifiedCountries struct {

	Links DefaultLinks `json:"_links"`

	// countries
	Countries []Country `json:"countries,omitempty"`
}

// AssertHalifiedCountriesRequired checks if the required fields are not zero-ed
func AssertHalifiedCountriesRequired(obj HalifiedCountries) error {
	elements := map[string]interface{}{
		"_links": obj.Links,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertDefaultLinksRequired(obj.Links); err != nil {
		return err
	}
	for _, el := range obj.Countries {
		if err := AssertCountryRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertHalifiedCountriesConstraints checks if the values respects the defined constraints
func AssertHalifiedCountriesConstraints(obj HalifiedCountries) error {
	return nil
}