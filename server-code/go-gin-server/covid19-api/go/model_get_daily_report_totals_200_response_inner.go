/*
 * COVID-19 data API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.2.6
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type GetDailyReportTotals200ResponseInner struct {

	Active int32 `json:"active,omitempty"`

	Confirmed int32 `json:"confirmed,omitempty"`

	Critical int32 `json:"critical,omitempty"`

	Date string `json:"date,omitempty"`

	Deaths int32 `json:"deaths,omitempty"`

	Recovered int32 `json:"recovered,omitempty"`
}