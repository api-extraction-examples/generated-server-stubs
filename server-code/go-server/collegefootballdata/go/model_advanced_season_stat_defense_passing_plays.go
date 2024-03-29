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




type AdvancedSeasonStatDefensePassingPlays struct {

	Explosiveness float32 `json:"explosiveness,omitempty"`

	Ppa float32 `json:"ppa,omitempty"`

	Rate float32 `json:"rate,omitempty"`

	SuccessRate float32 `json:"successRate,omitempty"`

	TotalPPA float32 `json:"totalPPA,omitempty"`
}

// AssertAdvancedSeasonStatDefensePassingPlaysRequired checks if the required fields are not zero-ed
func AssertAdvancedSeasonStatDefensePassingPlaysRequired(obj AdvancedSeasonStatDefensePassingPlays) error {
	return nil
}

// AssertAdvancedSeasonStatDefensePassingPlaysConstraints checks if the values respects the defined constraints
func AssertAdvancedSeasonStatDefensePassingPlaysConstraints(obj AdvancedSeasonStatDefensePassingPlays) error {
	return nil
}
