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

type ConferenceSpRatingOffense struct {

	Explosiveness float32 `json:"explosiveness,omitempty"`

	Pace float32 `json:"pace,omitempty"`

	Passing float32 `json:"passing,omitempty"`

	PassingDowns float32 `json:"passingDowns,omitempty"`

	Rating float32 `json:"rating,omitempty"`

	RunRate float32 `json:"runRate,omitempty"`

	Rushing float32 `json:"rushing,omitempty"`

	StandardDowns float32 `json:"standardDowns,omitempty"`

	Success float32 `json:"success,omitempty"`
}
