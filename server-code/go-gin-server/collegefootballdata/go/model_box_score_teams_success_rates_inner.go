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

type BoxScoreTeamsSuccessRatesInner struct {

	Overall BoxScoreTeamsCumulativePpaInnerOverall `json:"overall,omitempty"`

	PassingDowns BoxScoreTeamsCumulativePpaInnerOverall `json:"passingDowns,omitempty"`

	StandardDowns BoxScoreTeamsCumulativePpaInnerOverall `json:"standardDowns,omitempty"`

	Team string `json:"team,omitempty"`
}
