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

type BoxScoreTeams struct {

	CumulativePpa []BoxScoreTeamsCumulativePpaInner `json:"cumulativePpa,omitempty"`

	Explosiveness []BoxScoreTeamsExplosivenessInner `json:"explosiveness,omitempty"`

	FieldPosition []BoxScoreTeamsFieldPositionInner `json:"fieldPosition,omitempty"`

	Havoc []BoxScoreTeamsHavocInner `json:"havoc,omitempty"`

	Ppa []BoxScoreTeamsCumulativePpaInner `json:"ppa,omitempty"`

	Rushing []BoxScoreTeamsRushingInner `json:"rushing,omitempty"`

	ScoringOpportunities []BoxScoreTeamsScoringOpportunitiesInner `json:"scoringOpportunities,omitempty"`

	SuccessRates []BoxScoreTeamsSuccessRatesInner `json:"successRates,omitempty"`
}
