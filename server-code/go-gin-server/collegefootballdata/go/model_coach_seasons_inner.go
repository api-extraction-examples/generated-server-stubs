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

type CoachSeasonsInner struct {

	Games int32 `json:"games,omitempty"`

	Losses int32 `json:"losses,omitempty"`

	// Final ranking in the AP poll
	PostseasonRank int32 `json:"postseason_rank,omitempty"`

	// Rank in the AP preseason poll
	PreseasonRank int32 `json:"preseason_rank,omitempty"`

	School string `json:"school,omitempty"`

	// Final SP+ defensive rating
	SpDefense float32 `json:"sp_defense,omitempty"`

	// Final SP+ offensive rating
	SpOffense float32 `json:"sp_offense,omitempty"`

	// Final overall SP+ rating
	SpOverall float32 `json:"sp_overall,omitempty"`

	// Final SRS rankings
	Srs float32 `json:"srs,omitempty"`

	Ties int32 `json:"ties,omitempty"`

	Wins int32 `json:"wins,omitempty"`

	Year string `json:"year,omitempty"`
}
