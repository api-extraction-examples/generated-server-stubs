/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"fmt"
)



type PreviewType string

// List of PreviewType
const (
	IPHONE_65 PreviewType = "IPHONE_65"
	IPHONE_58 PreviewType = "IPHONE_58"
	IPHONE_55 PreviewType = "IPHONE_55"
	IPHONE_47 PreviewType = "IPHONE_47"
	IPHONE_40 PreviewType = "IPHONE_40"
	IPHONE_35 PreviewType = "IPHONE_35"
	IPAD_PRO_3_GEN_129 PreviewType = "IPAD_PRO_3GEN_129"
	IPAD_PRO_3_GEN_11 PreviewType = "IPAD_PRO_3GEN_11"
	IPAD_PRO_129 PreviewType = "IPAD_PRO_129"
	IPAD_105 PreviewType = "IPAD_105"
	IPAD_97 PreviewType = "IPAD_97"
	DESKTOP PreviewType = "DESKTOP"
	WATCH_SERIES_4 PreviewType = "WATCH_SERIES_4"
	WATCH_SERIES_3 PreviewType = "WATCH_SERIES_3"
	APPLE_TV PreviewType = "APPLE_TV"
)

// AllowedPreviewTypeEnumValues is all the allowed values of PreviewType enum
var AllowedPreviewTypeEnumValues = []PreviewType{
	"IPHONE_65",
	"IPHONE_58",
	"IPHONE_55",
	"IPHONE_47",
	"IPHONE_40",
	"IPHONE_35",
	"IPAD_PRO_3GEN_129",
	"IPAD_PRO_3GEN_11",
	"IPAD_PRO_129",
	"IPAD_105",
	"IPAD_97",
	"DESKTOP",
	"WATCH_SERIES_4",
	"WATCH_SERIES_3",
	"APPLE_TV",
}

// validPreviewTypeEnumValue provides a map of PreviewTypes for fast verification of use input
var validPreviewTypeEnumValues = map[PreviewType]struct{}{
	"IPHONE_65": {},
	"IPHONE_58": {},
	"IPHONE_55": {},
	"IPHONE_47": {},
	"IPHONE_40": {},
	"IPHONE_35": {},
	"IPAD_PRO_3GEN_129": {},
	"IPAD_PRO_3GEN_11": {},
	"IPAD_PRO_129": {},
	"IPAD_105": {},
	"IPAD_97": {},
	"DESKTOP": {},
	"WATCH_SERIES_4": {},
	"WATCH_SERIES_3": {},
	"APPLE_TV": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v PreviewType) IsValid() bool {
	_, ok := validPreviewTypeEnumValues[v]
	return ok
}

// NewPreviewTypeFromValue returns a pointer to a valid PreviewType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewPreviewTypeFromValue(v string) (PreviewType, error) {
	ev := PreviewType(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for PreviewType: valid values are %v", v, AllowedPreviewTypeEnumValues)
	}
}



// AssertPreviewTypeRequired checks if the required fields are not zero-ed
func AssertPreviewTypeRequired(obj PreviewType) error {
	return nil
}

// AssertPreviewTypeConstraints checks if the values respects the defined constraints
func AssertPreviewTypeConstraints(obj PreviewType) error {
	return nil
}
