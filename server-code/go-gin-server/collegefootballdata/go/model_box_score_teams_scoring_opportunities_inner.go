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

type BoxScoreTeamsScoringOpportunitiesInner struct {

	Opportunities int32 `json:"opportunities,omitempty"`

	Points int32 `json:"points,omitempty"`

	PointsPerOpportunity float32 `json:"pointsPerOpportunity,omitempty"`

	Team string `json:"team,omitempty"`
}
