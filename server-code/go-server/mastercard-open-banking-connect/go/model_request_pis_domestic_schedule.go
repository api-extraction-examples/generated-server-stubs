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




type RequestPisDomesticSchedule struct {

	// End date for the schedule
	EndDate string `json:"endDate,omitempty"`

	// Frequency type
	Frequency string `json:"frequency"`

	// Start date for the schedule
	StartDate string `json:"startDate"`
}

// AssertRequestPisDomesticScheduleRequired checks if the required fields are not zero-ed
func AssertRequestPisDomesticScheduleRequired(obj RequestPisDomesticSchedule) error {
	elements := map[string]interface{}{
		"frequency": obj.Frequency,
		"startDate": obj.StartDate,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertRequestPisDomesticScheduleConstraints checks if the values respects the defined constraints
func AssertRequestPisDomesticScheduleConstraints(obj RequestPisDomesticSchedule) error {
	return nil
}
