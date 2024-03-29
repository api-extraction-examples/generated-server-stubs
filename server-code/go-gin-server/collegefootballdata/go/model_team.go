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

type Team struct {

	Abbreviation string `json:"abbreviation,omitempty"`

	AltColor string `json:"alt_color,omitempty"`

	AltName1 string `json:"alt_name_1,omitempty"`

	AltName2 string `json:"alt_name_2,omitempty"`

	AltName3 string `json:"alt_name_3,omitempty"`

	Classification string `json:"classification,omitempty"`

	Color string `json:"color,omitempty"`

	Conference string `json:"conference,omitempty"`

	Division string `json:"division,omitempty"`

	Id int32 `json:"id,omitempty"`

	Location TeamLocation `json:"location,omitempty"`

	Logos []string `json:"logos,omitempty"`

	Mascot string `json:"mascot,omitempty"`

	School string `json:"school,omitempty"`

	Twitter string `json:"twitter,omitempty"`
}
