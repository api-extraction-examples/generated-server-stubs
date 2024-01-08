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

type ConferenceSpRatingDefense struct {

	Explosiveness float32 `json:"explosiveness,omitempty"`

	Havoc AdvancedSeasonStatDefenseHavoc `json:"havoc,omitempty"`

	Pasing float32 `json:"pasing,omitempty"`

	PassingDowns float32 `json:"passingDowns,omitempty"`

	Rating float32 `json:"rating,omitempty"`

	Rushing float32 `json:"rushing,omitempty"`

	StandardDowns float32 `json:"standardDowns,omitempty"`

	Success float32 `json:"success,omitempty"`
}