/*
 * Open Banking - Payments initiation service
 *
 * Open Banking - Payments initiation service
 *
 * API version: 1.16.0
 * Contact: apisupport@mastercard.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ApiHealthConnectors struct {

	// Connector name
	Name string `json:"name"`

	// Overall connect platform availability status
	Status string `json:"status"`

	// Additional informational message
	StatusMessage string `json:"statusMessage,omitempty"`
}

// AssertApiHealthConnectorsRequired checks if the required fields are not zero-ed
func AssertApiHealthConnectorsRequired(obj ApiHealthConnectors) error {
	elements := map[string]interface{}{
		"name": obj.Name,
		"status": obj.Status,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertApiHealthConnectorsConstraints checks if the values respects the defined constraints
func AssertApiHealthConnectorsConstraints(obj ApiHealthConnectors) error {
	return nil
}