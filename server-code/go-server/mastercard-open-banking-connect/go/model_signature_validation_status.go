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


// SignatureValidationStatus : For CMA9 ASPSPs: Status of validation of ASPSP's signature present in authorization code that TPP included in the request for credit transfer
type SignatureValidationStatus string

// List of SignatureValidationStatus
const (
	VALID SignatureValidationStatus = "VALID"
	UNKNOWN SignatureValidationStatus = "UNKNOWN"
	UNSIGNED SignatureValidationStatus = "UNSIGNED"
	NONCOMPLIANT SignatureValidationStatus = "NONCOMPLIANT"
)

// AllowedSignatureValidationStatusEnumValues is all the allowed values of SignatureValidationStatus enum
var AllowedSignatureValidationStatusEnumValues = []SignatureValidationStatus{
	"VALID",
	"UNKNOWN",
	"UNSIGNED",
	"NONCOMPLIANT",
}

// validSignatureValidationStatusEnumValue provides a map of SignatureValidationStatuss for fast verification of use input
var validSignatureValidationStatusEnumValues = map[SignatureValidationStatus]struct{}{
	"VALID": {},
	"UNKNOWN": {},
	"UNSIGNED": {},
	"NONCOMPLIANT": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v SignatureValidationStatus) IsValid() bool {
	_, ok := validSignatureValidationStatusEnumValues[v]
	return ok
}

// NewSignatureValidationStatusFromValue returns a pointer to a valid SignatureValidationStatus
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewSignatureValidationStatusFromValue(v string) (SignatureValidationStatus, error) {
	ev := SignatureValidationStatus(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for SignatureValidationStatus: valid values are %v", v, AllowedSignatureValidationStatusEnumValues)
	}
}



// AssertSignatureValidationStatusRequired checks if the required fields are not zero-ed
func AssertSignatureValidationStatusRequired(obj SignatureValidationStatus) error {
	return nil
}

// AssertSignatureValidationStatusConstraints checks if the values respects the defined constraints
func AssertSignatureValidationStatusConstraints(obj SignatureValidationStatus) error {
	return nil
}
