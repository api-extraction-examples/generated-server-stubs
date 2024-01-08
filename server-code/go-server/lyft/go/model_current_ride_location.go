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




type CurrentRideLocation struct {

	// The latitude component of a location
	Lat float64 `json:"lat"`

	// The longitude component of a location
	Lng float64 `json:"lng"`

	// Bearing of the driver's car in degrees
	Bearing float64 `json:"bearing,omitempty"`
}

// AssertCurrentRideLocationRequired checks if the required fields are not zero-ed
func AssertCurrentRideLocationRequired(obj CurrentRideLocation) error {
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

// AssertCurrentRideLocationConstraints checks if the values respects the defined constraints
func AssertCurrentRideLocationConstraints(obj CurrentRideLocation) error {
	return nil
}