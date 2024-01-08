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



type DlnaProfileType string

// List of DlnaProfileType
const (
	AUDIO DlnaProfileType = "Audio"
	VIDEO DlnaProfileType = "Video"
	PHOTO DlnaProfileType = "Photo"
)

// AllowedDlnaProfileTypeEnumValues is all the allowed values of DlnaProfileType enum
var AllowedDlnaProfileTypeEnumValues = []DlnaProfileType{
	"Audio",
	"Video",
	"Photo",
}

// validDlnaProfileTypeEnumValue provides a map of DlnaProfileTypes for fast verification of use input
var validDlnaProfileTypeEnumValues = map[DlnaProfileType]struct{}{
	"Audio": {},
	"Video": {},
	"Photo": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v DlnaProfileType) IsValid() bool {
	_, ok := validDlnaProfileTypeEnumValues[v]
	return ok
}

// NewDlnaProfileTypeFromValue returns a pointer to a valid DlnaProfileType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewDlnaProfileTypeFromValue(v string) (DlnaProfileType, error) {
	ev := DlnaProfileType(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for DlnaProfileType: valid values are %v", v, AllowedDlnaProfileTypeEnumValues)
	}
}



// AssertDlnaProfileTypeRequired checks if the required fields are not zero-ed
func AssertDlnaProfileTypeRequired(obj DlnaProfileType) error {
	return nil
}

// AssertDlnaProfileTypeConstraints checks if the values respects the defined constraints
func AssertDlnaProfileTypeConstraints(obj DlnaProfileType) error {
	return nil
}
