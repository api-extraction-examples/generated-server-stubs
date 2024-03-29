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

// SandboxRideUpdate - Response when a sandbox ride is propagated through ride status
type SandboxRideUpdate struct {

	// The ID of the ride
	RideId string `json:"ride_id,omitempty"`

	Status RideStatusEnum `json:"status,omitempty"`
}
