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

// Eta - Estimated Time of Arrival
type Eta struct {

	// A human readable description of the ride type
	DisplayName string `json:"display_name,omitempty"`

	// Estimated seconds for a driver to arrive
	EtaSeconds int32 `json:"eta_seconds,omitempty"`

	// Estimated upper bound of seconds for a driver to arrive
	EtaSecondsMax int32 `json:"eta_seconds_max,omitempty"`

	// The validity of the ETA estimate returned
	IsValidEstimate bool `json:"is_valid_estimate,omitempty"`

	RideType RideTypeEnum `json:"ride_type,omitempty"`
}
