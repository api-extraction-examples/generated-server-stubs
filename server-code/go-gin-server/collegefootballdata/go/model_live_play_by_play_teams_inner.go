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

type LivePlayByPlayTeamsInner struct {

	Drives int32 `json:"drives,omitempty"`

	EpaPerPass float32 `json:"epaPerPass,omitempty"`

	EpaPerPlay float32 `json:"epaPerPlay,omitempty"`

	EpaPerRush float32 `json:"epaPerRush,omitempty"`

	Explosiveness float32 `json:"explosiveness,omitempty"`

	HomeAway string `json:"homeAway,omitempty"`

	LineYards int32 `json:"lineYards,omitempty"`

	LineYardsPerRush float32 `json:"lineYardsPerRush,omitempty"`

	OpenFieldYards int32 `json:"openFieldYards,omitempty"`

	OpenFieldYardsPerRush float32 `json:"openFieldYardsPerRush,omitempty"`

	PassingDownSuccessRate float32 `json:"passingDownSuccessRate,omitempty"`

	PassingEpa float32 `json:"passingEpa,omitempty"`

	Plays int32 `json:"plays,omitempty"`

	Points int32 `json:"points,omitempty"`

	PointsPerOpportunity float32 `json:"pointsPerOpportunity,omitempty"`

	RushingEpa float32 `json:"rushingEpa,omitempty"`

	ScoringOpportunities int32 `json:"scoringOpportunities,omitempty"`

	SecondLevelYards int32 `json:"secondLevelYards,omitempty"`

	SecondLevelYardsPerRush float32 `json:"secondLevelYardsPerRush,omitempty"`

	StandardDownSuccessRate float32 `json:"standardDownSuccessRate,omitempty"`

	SuccessRate float32 `json:"successRate,omitempty"`

	Team string `json:"team,omitempty"`

	TeamId int32 `json:"teamId,omitempty"`

	TotalEpa float32 `json:"totalEpa,omitempty"`
}
