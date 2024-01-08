/*
 * CircleCI REST API
 *
 * The CircleCI API is a RESTful, fully-featured API that allows you to do almost anything in CircleCI. You can access all information and trigger all actions. The only thing we don’t provide access to is billing functions, which must be done from the CircleCI web UI. 
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"time"
)



type Key struct {

	Fingerprint string `json:"fingerprint,omitempty"`

	Preferred bool `json:"preferred,omitempty"`

	PublicKey string `json:"public_key,omitempty"`

	// when the key was issued
	Time time.Time `json:"time,omitempty"`

	// can be \"deploy-key\" or \"github-user-key\" 
	Type string `json:"type,omitempty"`
}

// AssertKeyRequired checks if the required fields are not zero-ed
func AssertKeyRequired(obj Key) error {
	return nil
}

// AssertKeyConstraints checks if the values respects the defined constraints
func AssertKeyConstraints(obj Key) error {
	return nil
}
