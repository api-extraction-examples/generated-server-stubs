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


import (
	"fmt"
)


// AdditionalDataField : Additional ASPSP field Types to be returned
type AdditionalDataField string

// List of AdditionalDataField
const (
	CAPABILITIES AdditionalDataField = "capabilities"
	LOGO AdditionalDataField = "logo"
)

// AllowedAdditionalDataFieldEnumValues is all the allowed values of AdditionalDataField enum
var AllowedAdditionalDataFieldEnumValues = []AdditionalDataField{
	"capabilities",
	"logo",
}

// validAdditionalDataFieldEnumValue provides a map of AdditionalDataFields for fast verification of use input
var validAdditionalDataFieldEnumValues = map[AdditionalDataField]struct{}{
	"capabilities": {},
	"logo": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v AdditionalDataField) IsValid() bool {
	_, ok := validAdditionalDataFieldEnumValues[v]
	return ok
}

// NewAdditionalDataFieldFromValue returns a pointer to a valid AdditionalDataField
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewAdditionalDataFieldFromValue(v string) (AdditionalDataField, error) {
	ev := AdditionalDataField(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for AdditionalDataField: valid values are %v", v, AllowedAdditionalDataFieldEnumValues)
	}
}



// AssertAdditionalDataFieldRequired checks if the required fields are not zero-ed
func AssertAdditionalDataFieldRequired(obj AdditionalDataField) error {
	return nil
}

// AssertAdditionalDataFieldConstraints checks if the values respects the defined constraints
func AssertAdditionalDataFieldConstraints(obj AdditionalDataField) error {
	return nil
}
