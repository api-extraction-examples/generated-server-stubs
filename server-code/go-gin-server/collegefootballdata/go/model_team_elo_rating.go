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

type TeamEloRating struct {

	Conference string `json:"conference,omitempty"`

	Elo float32 `json:"elo,omitempty"`

	Team string `json:"team,omitempty"`

	Year int32 `json:"year,omitempty"`
}
