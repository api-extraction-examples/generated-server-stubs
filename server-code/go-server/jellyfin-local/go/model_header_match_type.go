/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"fmt"
)



type HeaderMatchType string

// List of HeaderMatchType
const (
	EQUALS HeaderMatchType = "Equals"
	REGEX HeaderMatchType = "Regex"
	SUBSTRING HeaderMatchType = "Substring"
)

// AllowedHeaderMatchTypeEnumValues is all the allowed values of HeaderMatchType enum
var AllowedHeaderMatchTypeEnumValues = []HeaderMatchType{
	"Equals",
	"Regex",
	"Substring",
}

// validHeaderMatchTypeEnumValue provides a map of HeaderMatchTypes for fast verification of use input
var validHeaderMatchTypeEnumValues = map[HeaderMatchType]struct{}{
	"Equals": {},
	"Regex": {},
	"Substring": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v HeaderMatchType) IsValid() bool {
	_, ok := validHeaderMatchTypeEnumValues[v]
	return ok
}

// NewHeaderMatchTypeFromValue returns a pointer to a valid HeaderMatchType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewHeaderMatchTypeFromValue(v string) (HeaderMatchType, error) {
	ev := HeaderMatchType(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for HeaderMatchType: valid values are %v", v, AllowedHeaderMatchTypeEnumValues)
	}
}



// AssertHeaderMatchTypeRequired checks if the required fields are not zero-ed
func AssertHeaderMatchTypeRequired(obj HeaderMatchType) error {
	return nil
}

// AssertHeaderMatchTypeConstraints checks if the values respects the defined constraints
func AssertHeaderMatchTypeConstraints(obj HeaderMatchType) error {
	return nil
}
