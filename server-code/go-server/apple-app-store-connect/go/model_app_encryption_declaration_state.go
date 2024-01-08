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



type AppEncryptionDeclarationState string

// List of AppEncryptionDeclarationState
const (
	IN_REVIEW AppEncryptionDeclarationState = "IN_REVIEW"
	APPROVED AppEncryptionDeclarationState = "APPROVED"
	REJECTED AppEncryptionDeclarationState = "REJECTED"
	INVALID AppEncryptionDeclarationState = "INVALID"
	EXPIRED AppEncryptionDeclarationState = "EXPIRED"
)

// AllowedAppEncryptionDeclarationStateEnumValues is all the allowed values of AppEncryptionDeclarationState enum
var AllowedAppEncryptionDeclarationStateEnumValues = []AppEncryptionDeclarationState{
	"IN_REVIEW",
	"APPROVED",
	"REJECTED",
	"INVALID",
	"EXPIRED",
}

// validAppEncryptionDeclarationStateEnumValue provides a map of AppEncryptionDeclarationStates for fast verification of use input
var validAppEncryptionDeclarationStateEnumValues = map[AppEncryptionDeclarationState]struct{}{
	"IN_REVIEW": {},
	"APPROVED": {},
	"REJECTED": {},
	"INVALID": {},
	"EXPIRED": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v AppEncryptionDeclarationState) IsValid() bool {
	_, ok := validAppEncryptionDeclarationStateEnumValues[v]
	return ok
}

// NewAppEncryptionDeclarationStateFromValue returns a pointer to a valid AppEncryptionDeclarationState
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewAppEncryptionDeclarationStateFromValue(v string) (AppEncryptionDeclarationState, error) {
	ev := AppEncryptionDeclarationState(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for AppEncryptionDeclarationState: valid values are %v", v, AllowedAppEncryptionDeclarationStateEnumValues)
	}
}



// AssertAppEncryptionDeclarationStateRequired checks if the required fields are not zero-ed
func AssertAppEncryptionDeclarationStateRequired(obj AppEncryptionDeclarationState) error {
	return nil
}

// AssertAppEncryptionDeclarationStateConstraints checks if the values respects the defined constraints
func AssertAppEncryptionDeclarationStateConstraints(obj AppEncryptionDeclarationState) error {
	return nil
}
