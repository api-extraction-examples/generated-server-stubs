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




type ErrorErrorsError struct {

	Description string `json:"Description,omitempty"`

	Details string `json:"Details,omitempty"`

	ReasonCode string `json:"ReasonCode,omitempty"`

	Recoverable bool `json:"Recoverable,omitempty"`

	Source string `json:"Source,omitempty"`
}

// AssertErrorErrorsErrorRequired checks if the required fields are not zero-ed
func AssertErrorErrorsErrorRequired(obj ErrorErrorsError) error {
	return nil
}

// AssertErrorErrorsErrorConstraints checks if the values respects the defined constraints
func AssertErrorErrorsErrorConstraints(obj ErrorErrorsError) error {
	return nil
}
