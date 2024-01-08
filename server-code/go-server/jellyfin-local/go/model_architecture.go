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



type Architecture string

// List of Architecture
const (
	X86 Architecture = "X86"
	X64 Architecture = "X64"
	ARM Architecture = "Arm"
	ARM64 Architecture = "Arm64"
	WASM Architecture = "Wasm"
)

// AllowedArchitectureEnumValues is all the allowed values of Architecture enum
var AllowedArchitectureEnumValues = []Architecture{
	"X86",
	"X64",
	"Arm",
	"Arm64",
	"Wasm",
}

// validArchitectureEnumValue provides a map of Architectures for fast verification of use input
var validArchitectureEnumValues = map[Architecture]struct{}{
	"X86": {},
	"X64": {},
	"Arm": {},
	"Arm64": {},
	"Wasm": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v Architecture) IsValid() bool {
	_, ok := validArchitectureEnumValues[v]
	return ok
}

// NewArchitectureFromValue returns a pointer to a valid Architecture
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewArchitectureFromValue(v string) (Architecture, error) {
	ev := Architecture(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for Architecture: valid values are %v", v, AllowedArchitectureEnumValues)
	}
}



// AssertArchitectureRequired checks if the required fields are not zero-ed
func AssertArchitectureRequired(obj Architecture) error {
	return nil
}

// AssertArchitectureConstraints checks if the values respects the defined constraints
func AssertArchitectureConstraints(obj Architecture) error {
	return nil
}