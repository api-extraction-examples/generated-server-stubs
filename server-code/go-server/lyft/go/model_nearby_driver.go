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




type NearbyDriver struct {

	// the lastest recorded driver locations up to 5 sorted in chronological order.
	Locations []LatLng `json:"locations,omitempty"`
}

// AssertNearbyDriverRequired checks if the required fields are not zero-ed
func AssertNearbyDriverRequired(obj NearbyDriver) error {
	for _, el := range obj.Locations {
		if err := AssertLatLngRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertNearbyDriverConstraints checks if the values respects the defined constraints
func AssertNearbyDriverConstraints(obj NearbyDriver) error {
	return nil
}
