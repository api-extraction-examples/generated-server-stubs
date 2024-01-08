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

type NearbyDriversByRideType struct {

	// list of nearby drivers group by ride type sorted by eta
	Drivers []NearbyDriver `json:"drivers,omitempty"`

	// driver's ride type. if driver is eligable for several ride types, he will be duplicated.
	RideType string `json:"ride_type,omitempty"`
}