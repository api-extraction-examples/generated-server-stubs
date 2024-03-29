/*
 * COVID-19 data API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.2.6
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type GetListOfCountries200ResponseInner struct {

	Alpha2Code string `json:"alpha-2-code,omitempty"`

	Alpha3Code string `json:"alpha-3-code,omitempty"`

	Latitude float32 `json:"latitude,omitempty"`

	Longitude float32 `json:"longitude,omitempty"`

	Name string `json:"name,omitempty"`
}

// AssertGetListOfCountries200ResponseInnerRequired checks if the required fields are not zero-ed
func AssertGetListOfCountries200ResponseInnerRequired(obj GetListOfCountries200ResponseInner) error {
	return nil
}

// AssertGetListOfCountries200ResponseInnerConstraints checks if the values respects the defined constraints
func AssertGetListOfCountries200ResponseInnerConstraints(obj GetListOfCountries200ResponseInner) error {
	return nil
}
