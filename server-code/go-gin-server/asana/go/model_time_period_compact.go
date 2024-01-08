/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type TimePeriodCompact struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// A string representing the cadence code and the fiscal year.
	DisplayName string `json:"display_name,omitempty"`

	// The localized end date of the time period in `YYYY-MM-DD` format.
	EndOn string `json:"end_on,omitempty"`

	// The cadence and index of the time period. The value is one of: `FY`, `H1`, `H2`, `Q1`, `Q2`, `Q3`, or `Q4`.
	Period string `json:"period,omitempty"`

	// The localized start date of the time period in `YYYY-MM-DD` format.
	StartOn string `json:"start_on,omitempty"`
}