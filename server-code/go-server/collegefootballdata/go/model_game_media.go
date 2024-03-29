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




type GameMedia struct {

	AwayConference string `json:"awayConference,omitempty"`

	AwayTeam string `json:"awayTeam,omitempty"`

	HomeConference string `json:"homeConference,omitempty"`

	HomeTeam string `json:"homeTeam,omitempty"`

	Id int32 `json:"id,omitempty"`

	IsStartTimeTBD bool `json:"isStartTimeTBD,omitempty"`

	MediaType string `json:"mediaType,omitempty"`

	Outlet string `json:"outlet,omitempty"`

	Season int32 `json:"season,omitempty"`

	SeasonType string `json:"seasonType,omitempty"`

	StartTime string `json:"startTime,omitempty"`

	Week int32 `json:"week,omitempty"`
}

// AssertGameMediaRequired checks if the required fields are not zero-ed
func AssertGameMediaRequired(obj GameMedia) error {
	return nil
}

// AssertGameMediaConstraints checks if the values respects the defined constraints
func AssertGameMediaConstraints(obj GameMedia) error {
	return nil
}
