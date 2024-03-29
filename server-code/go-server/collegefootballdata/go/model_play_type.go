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




type PlayType struct {

	Abbreviation string `json:"abbreviation,omitempty"`

	Id int32 `json:"id,omitempty"`

	Text string `json:"text,omitempty"`
}

// AssertPlayTypeRequired checks if the required fields are not zero-ed
func AssertPlayTypeRequired(obj PlayType) error {
	return nil
}

// AssertPlayTypeConstraints checks if the values respects the defined constraints
func AssertPlayTypeConstraints(obj PlayType) error {
	return nil
}
