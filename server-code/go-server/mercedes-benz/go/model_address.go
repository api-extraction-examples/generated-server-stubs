/*
 * Dealer
 *
 * The Dealer API provides Dealer search functions.
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type Address struct {

	// address addition
	AddressAddition string `json:"addressAddition,omitempty"`

	// city
	City string `json:"city,omitempty"`

	// ISO A2 country code
	CountryIsoCode string `json:"countryIsoCode,omitempty"`

	// district, area of city
	District string `json:"district,omitempty"`

	// street and house number, if applicable
	Street string `json:"street,omitempty"`

	// postal code
	ZipCode string `json:"zipCode,omitempty"`
}

// AssertAddressRequired checks if the required fields are not zero-ed
func AssertAddressRequired(obj Address) error {
	return nil
}

// AssertAddressConstraints checks if the values respects the defined constraints
func AssertAddressConstraints(obj Address) error {
	return nil
}