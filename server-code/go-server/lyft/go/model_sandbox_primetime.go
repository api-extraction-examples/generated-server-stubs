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




type SandboxPrimetime struct {

	// The latitude component of a location
	Lat float64 `json:"lat"`

	// The longitude component of a location
	Lng float64 `json:"lng"`

	// The Prime Time to be applied as a string, e.g., '25%'
	PrimetimePercentage string `json:"primetime_percentage"`
}

// AssertSandboxPrimetimeRequired checks if the required fields are not zero-ed
func AssertSandboxPrimetimeRequired(obj SandboxPrimetime) error {
	elements := map[string]interface{}{
		"lat": obj.Lat,
		"lng": obj.Lng,
		"primetime_percentage": obj.PrimetimePercentage,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertSandboxPrimetimeConstraints checks if the values respects the defined constraints
func AssertSandboxPrimetimeConstraints(obj SandboxPrimetime) error {
	return nil
}