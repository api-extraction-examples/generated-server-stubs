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

type Play struct {

	Away string `json:"away,omitempty"`

	Clock DriveEndTime `json:"clock,omitempty"`

	Defense string `json:"defense,omitempty"`

	DefenseConference string `json:"defense_conference,omitempty"`

	DefenseScore int32 `json:"defense_score,omitempty"`

	DefenseTimeouts int32 `json:"defense_timeouts,omitempty"`

	Distance int32 `json:"distance,omitempty"`

	Down int32 `json:"down,omitempty"`

	DriveId int32 `json:"drive_id,omitempty"`

	DriveNumber int32 `json:"drive_number,omitempty"`

	GameId int32 `json:"game_id,omitempty"`

	Home string `json:"home,omitempty"`

	Id int32 `json:"id,omitempty"`

	Offense string `json:"offense,omitempty"`

	OffenseConference string `json:"offense_conference,omitempty"`

	OffenseScore int32 `json:"offense_score,omitempty"`

	OffenseTimeouts int32 `json:"offense_timeouts,omitempty"`

	Period int32 `json:"period,omitempty"`

	PlayNumber int32 `json:"play_number,omitempty"`

	PlayText string `json:"play_text,omitempty"`

	PlayType string `json:"play_type,omitempty"`

	Ppa float32 `json:"ppa,omitempty"`

	Scoring bool `json:"scoring,omitempty"`

	Wallclock string `json:"wallclock,omitempty"`

	YardLine int32 `json:"yard_line,omitempty"`

	YardsGained int32 `json:"yards_gained,omitempty"`

	YardsToGoal int32 `json:"yards_to_goal,omitempty"`
}
