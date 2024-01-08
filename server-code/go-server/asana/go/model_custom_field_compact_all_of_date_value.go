/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// CustomFieldCompactAllOfDateValue - *Conditional*. Only relevant for custom fields of type `date`. This object reflects the chosen date (and optionally, time) value of a `date` custom field. If no date is selected, the value of `date_value` will be `null`.
type CustomFieldCompactAllOfDateValue struct {

	// A string representing the date in YYYY-MM-DD format.
	Date string `json:"date,omitempty"`

	// A string representing the date in ISO 8601 format. If no time value is selected, the value of `date-time` will be `null`.
	DateTime string `json:"date_time,omitempty"`
}

// AssertCustomFieldCompactAllOfDateValueRequired checks if the required fields are not zero-ed
func AssertCustomFieldCompactAllOfDateValueRequired(obj CustomFieldCompactAllOfDateValue) error {
	return nil
}

// AssertCustomFieldCompactAllOfDateValueConstraints checks if the values respects the defined constraints
func AssertCustomFieldCompactAllOfDateValueConstraints(obj CustomFieldCompactAllOfDateValue) error {
	return nil
}