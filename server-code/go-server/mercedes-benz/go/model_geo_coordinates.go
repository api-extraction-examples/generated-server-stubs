/*
 * Dealer
 *
 * The Dealer API provides Dealer search functions.
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type GeoCoordinates struct {

	// latitude - in decimal degrees
	Latitude float64 `json:"latitude"`

	// longitude - in decimal degrees
	Longitude float64 `json:"longitude"`
}

// AssertGeoCoordinatesRequired checks if the required fields are not zero-ed
func AssertGeoCoordinatesRequired(obj GeoCoordinates) error {
	elements := map[string]interface{}{
		"latitude": obj.Latitude,
		"longitude": obj.Longitude,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertGeoCoordinatesConstraints checks if the values respects the defined constraints
func AssertGeoCoordinatesConstraints(obj GeoCoordinates) error {
	return nil
}