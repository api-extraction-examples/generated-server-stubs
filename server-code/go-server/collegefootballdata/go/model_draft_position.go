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




type DraftPosition struct {

	Abbreviation string `json:"abbreviation,omitempty"`

	Name string `json:"name,omitempty"`
}

// AssertDraftPositionRequired checks if the required fields are not zero-ed
func AssertDraftPositionRequired(obj DraftPosition) error {
	return nil
}

// AssertDraftPositionConstraints checks if the values respects the defined constraints
func AssertDraftPositionConstraints(obj DraftPosition) error {
	return nil
}
