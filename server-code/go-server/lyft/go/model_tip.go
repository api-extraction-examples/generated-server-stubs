/*
 * Lyft
 *
 * Drive your app to success with Lyft's API
 *
 * API version: 1.0.0
 * Contact: api-support@lyft.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"errors"
)



type Tip struct {

	// A tip for the driver in cents. To be charged to the user's default charge account.
	Amount int32 `json:"amount,omitempty"`

	// The currency in which you want to tip. e.g. USD
	Currency string `json:"currency,omitempty"`
}

// AssertTipRequired checks if the required fields are not zero-ed
func AssertTipRequired(obj Tip) error {
	return nil
}

// AssertTipConstraints checks if the values respects the defined constraints
func AssertTipConstraints(obj Tip) error {
	if obj.Amount < 0 {
		return &ParsingError{Err: errors.New(errMsgMinValueConstraint)}
	}
	return nil
}
