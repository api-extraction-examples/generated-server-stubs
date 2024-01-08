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



type MetadataRefreshMode string

// List of MetadataRefreshMode
const (
	NONE MetadataRefreshMode = "None"
	VALIDATION_ONLY MetadataRefreshMode = "ValidationOnly"
	DEFAULT MetadataRefreshMode = "Default"
	FULL_REFRESH MetadataRefreshMode = "FullRefresh"
)

// AllowedMetadataRefreshModeEnumValues is all the allowed values of MetadataRefreshMode enum
var AllowedMetadataRefreshModeEnumValues = []MetadataRefreshMode{
	"None",
	"ValidationOnly",
	"Default",
	"FullRefresh",
}

// validMetadataRefreshModeEnumValue provides a map of MetadataRefreshModes for fast verification of use input
var validMetadataRefreshModeEnumValues = map[MetadataRefreshMode]struct{}{
	"None": {},
	"ValidationOnly": {},
	"Default": {},
	"FullRefresh": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v MetadataRefreshMode) IsValid() bool {
	_, ok := validMetadataRefreshModeEnumValues[v]
	return ok
}

// NewMetadataRefreshModeFromValue returns a pointer to a valid MetadataRefreshMode
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewMetadataRefreshModeFromValue(v string) (MetadataRefreshMode, error) {
	ev := MetadataRefreshMode(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for MetadataRefreshMode: valid values are %v", v, AllowedMetadataRefreshModeEnumValues)
	}
}



// AssertMetadataRefreshModeRequired checks if the required fields are not zero-ed
func AssertMetadataRefreshModeRequired(obj MetadataRefreshMode) error {
	return nil
}

// AssertMetadataRefreshModeConstraints checks if the values respects the defined constraints
func AssertMetadataRefreshModeConstraints(obj MetadataRefreshMode) error {
	return nil
}