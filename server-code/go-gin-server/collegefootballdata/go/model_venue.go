/*
 * College Football Data API
 *
 * This is an API for accessing all sorts of college football data.  Please note that API keys should be supplied with \"Bearer \" prepended (e.g. \"Bearer your_key\"). API keys can be acquired from the CollegeFootballData.com website.
 *
 * API version: 4.4.12
 * Contact: admin@collegefootballdata.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type Venue struct {

	Capacity int32 `json:"capacity,omitempty"`

	City string `json:"city,omitempty"`

	CountryCode string `json:"country_code,omitempty"`

	Dome bool `json:"dome,omitempty"`

	Elevation float32 `json:"elevation,omitempty"`

	Grass bool `json:"grass,omitempty"`

	Id int32 `json:"id,omitempty"`

	Location VenueLocation `json:"location,omitempty"`

	Name string `json:"name,omitempty"`

	State string `json:"state,omitempty"`

	Timezone string `json:"timezone,omitempty"`

	YearConstructed int32 `json:"year_constructed,omitempty"`

	Zip string `json:"zip,omitempty"`
}
