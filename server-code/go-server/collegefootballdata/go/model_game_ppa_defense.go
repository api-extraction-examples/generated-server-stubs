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




type GamePpaDefense struct {

	FirstDown float32 `json:"firstDown,omitempty"`

	Overall float32 `json:"overall,omitempty"`

	Passing float32 `json:"passing,omitempty"`

	Rushing float32 `json:"rushing,omitempty"`

	SecondDown float32 `json:"secondDown,omitempty"`

	ThirdDown float32 `json:"thirdDown,omitempty"`
}

// AssertGamePpaDefenseRequired checks if the required fields are not zero-ed
func AssertGamePpaDefenseRequired(obj GamePpaDefense) error {
	return nil
}

// AssertGamePpaDefenseConstraints checks if the values respects the defined constraints
func AssertGamePpaDefenseConstraints(obj GamePpaDefense) error {
	return nil
}
