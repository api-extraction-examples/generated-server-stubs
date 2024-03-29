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




type PlayerUsageUsage struct {

	FirstDown float32 `json:"firstDown,omitempty"`

	Overall float32 `json:"overall,omitempty"`

	Pass float32 `json:"pass,omitempty"`

	PassingDowns float32 `json:"passingDowns,omitempty"`

	Rush float32 `json:"rush,omitempty"`

	SecondDown float32 `json:"secondDown,omitempty"`

	StandardDowns float32 `json:"standardDowns,omitempty"`

	ThirdDown float32 `json:"thirdDown,omitempty"`
}

// AssertPlayerUsageUsageRequired checks if the required fields are not zero-ed
func AssertPlayerUsageUsageRequired(obj PlayerUsageUsage) error {
	return nil
}

// AssertPlayerUsageUsageConstraints checks if the values respects the defined constraints
func AssertPlayerUsageUsageConstraints(obj PlayerUsageUsage) error {
	return nil
}
