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
	"time"
)



// UtcTimeResponse - Class UtcTimeResponse.
type UtcTimeResponse struct {

	// Gets the UTC time when request has been received.
	RequestReceptionTime time.Time `json:"RequestReceptionTime,omitempty"`

	// Gets the UTC time when response has been sent.
	ResponseTransmissionTime time.Time `json:"ResponseTransmissionTime,omitempty"`
}

// AssertUtcTimeResponseRequired checks if the required fields are not zero-ed
func AssertUtcTimeResponseRequired(obj UtcTimeResponse) error {
	return nil
}

// AssertUtcTimeResponseConstraints checks if the values respects the defined constraints
func AssertUtcTimeResponseConstraints(obj UtcTimeResponse) error {
	return nil
}