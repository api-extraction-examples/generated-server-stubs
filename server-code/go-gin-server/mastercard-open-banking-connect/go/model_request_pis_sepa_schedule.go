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

type RequestPisSepaSchedule struct {

	// End date for the schedule
	EndDate string `json:"endDate,omitempty"`

	// Frequency type
	Frequency string `json:"frequency"`

	// Start date for the schedule
	StartDate string `json:"startDate"`
}