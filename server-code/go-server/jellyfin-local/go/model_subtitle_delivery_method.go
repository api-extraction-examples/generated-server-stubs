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



type SubtitleDeliveryMethod string

// List of SubtitleDeliveryMethod
const (
	ENCODE SubtitleDeliveryMethod = "Encode"
	EMBED SubtitleDeliveryMethod = "Embed"
	EXTERNAL SubtitleDeliveryMethod = "External"
	HLS SubtitleDeliveryMethod = "Hls"
)

// AllowedSubtitleDeliveryMethodEnumValues is all the allowed values of SubtitleDeliveryMethod enum
var AllowedSubtitleDeliveryMethodEnumValues = []SubtitleDeliveryMethod{
	"Encode",
	"Embed",
	"External",
	"Hls",
}

// validSubtitleDeliveryMethodEnumValue provides a map of SubtitleDeliveryMethods for fast verification of use input
var validSubtitleDeliveryMethodEnumValues = map[SubtitleDeliveryMethod]struct{}{
	"Encode": {},
	"Embed": {},
	"External": {},
	"Hls": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v SubtitleDeliveryMethod) IsValid() bool {
	_, ok := validSubtitleDeliveryMethodEnumValues[v]
	return ok
}

// NewSubtitleDeliveryMethodFromValue returns a pointer to a valid SubtitleDeliveryMethod
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewSubtitleDeliveryMethodFromValue(v string) (SubtitleDeliveryMethod, error) {
	ev := SubtitleDeliveryMethod(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for SubtitleDeliveryMethod: valid values are %v", v, AllowedSubtitleDeliveryMethodEnumValues)
	}
}



// AssertSubtitleDeliveryMethodRequired checks if the required fields are not zero-ed
func AssertSubtitleDeliveryMethodRequired(obj SubtitleDeliveryMethod) error {
	return nil
}

// AssertSubtitleDeliveryMethodConstraints checks if the values respects the defined constraints
func AssertSubtitleDeliveryMethodConstraints(obj SubtitleDeliveryMethod) error {
	return nil
}
