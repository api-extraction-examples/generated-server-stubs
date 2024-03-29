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




type RideLocation struct {

	// The latitude component of a location
	Lat float64 `json:"lat"`

	// The longitude component of a location
	Lng float64 `json:"lng"`

	// A human readable address at/near the given location
	Address string `json:"address,omitempty"`

	// Estimated seconds for a driver to pickup or reach destination based on ride status
	EtaSeconds int32 `json:"eta_seconds,omitempty"`
}

// AssertRideLocationRequired checks if the required fields are not zero-ed
func AssertRideLocationRequired(obj RideLocation) error {
	elements := map[string]interface{}{
		"lat": obj.Lat,
		"lng": obj.Lng,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertRideLocationConstraints checks if the values respects the defined constraints
func AssertRideLocationConstraints(obj RideLocation) error {
	return nil
}
