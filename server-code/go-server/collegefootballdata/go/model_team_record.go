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




type TeamRecord struct {

	AwayGames TeamRecordAwayGames `json:"awayGames,omitempty"`

	Conference string `json:"conference,omitempty"`

	ConferenceGames TeamRecordAwayGames `json:"conferenceGames,omitempty"`

	Division string `json:"division,omitempty"`

	ExpectedWins float32 `json:"expectedWins,omitempty"`

	HomeGames TeamRecordAwayGames `json:"homeGames,omitempty"`

	Team string `json:"team,omitempty"`

	Total TeamRecordAwayGames `json:"total,omitempty"`

	Year int32 `json:"year,omitempty"`
}

// AssertTeamRecordRequired checks if the required fields are not zero-ed
func AssertTeamRecordRequired(obj TeamRecord) error {
	if err := AssertTeamRecordAwayGamesRequired(obj.AwayGames); err != nil {
		return err
	}
	if err := AssertTeamRecordAwayGamesRequired(obj.ConferenceGames); err != nil {
		return err
	}
	if err := AssertTeamRecordAwayGamesRequired(obj.HomeGames); err != nil {
		return err
	}
	if err := AssertTeamRecordAwayGamesRequired(obj.Total); err != nil {
		return err
	}
	return nil
}

// AssertTeamRecordConstraints checks if the values respects the defined constraints
func AssertTeamRecordConstraints(obj TeamRecord) error {
	return nil
}
