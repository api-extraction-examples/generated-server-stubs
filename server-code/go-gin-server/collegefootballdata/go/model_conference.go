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

type Conference struct {

	Abbreviation string `json:"abbreviation,omitempty"`

	Classification string `json:"classification,omitempty"`

	Id int32 `json:"id,omitempty"`

	Name string `json:"name,omitempty"`

	ShortName string `json:"short_name,omitempty"`
}
