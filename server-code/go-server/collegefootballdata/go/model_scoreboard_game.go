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




type ScoreboardGame struct {

	AwayTeam ScoreboardGameAwayTeam `json:"awayTeam,omitempty"`

	Betting ScoreboardGameBetting `json:"betting,omitempty"`

	Clock string `json:"clock,omitempty"`

	ConferenceGame bool `json:"conferenceGame,omitempty"`

	HomeTeam ScoreboardGameAwayTeam `json:"homeTeam,omitempty"`

	Id int32 `json:"id,omitempty"`

	NeutralSite bool `json:"neutralSite,omitempty"`

	Period int32 `json:"period,omitempty"`

	Possession string `json:"possession,omitempty"`

	Situation string `json:"situation,omitempty"`

	StartDate string `json:"startDate,omitempty"`

	StartTimeTBD bool `json:"startTimeTBD,omitempty"`

	Status string `json:"status,omitempty"`

	Tv string `json:"tv,omitempty"`

	Venue ScoreboardGameVenue `json:"venue,omitempty"`

	Weather ScoreboardGameWeather `json:"weather,omitempty"`
}

// AssertScoreboardGameRequired checks if the required fields are not zero-ed
func AssertScoreboardGameRequired(obj ScoreboardGame) error {
	if err := AssertScoreboardGameAwayTeamRequired(obj.AwayTeam); err != nil {
		return err
	}
	if err := AssertScoreboardGameBettingRequired(obj.Betting); err != nil {
		return err
	}
	if err := AssertScoreboardGameAwayTeamRequired(obj.HomeTeam); err != nil {
		return err
	}
	if err := AssertScoreboardGameVenueRequired(obj.Venue); err != nil {
		return err
	}
	if err := AssertScoreboardGameWeatherRequired(obj.Weather); err != nil {
		return err
	}
	return nil
}

// AssertScoreboardGameConstraints checks if the values respects the defined constraints
func AssertScoreboardGameConstraints(obj ScoreboardGame) error {
	return nil
}
