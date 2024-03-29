/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"time"
)



type AppStoreVersionAttributes struct {

	AppStoreState AppStoreVersionState `json:"appStoreState,omitempty"`

	Copyright string `json:"copyright,omitempty"`

	CreatedDate time.Time `json:"createdDate,omitempty"`

	Downloadable bool `json:"downloadable,omitempty"`

	EarliestReleaseDate time.Time `json:"earliestReleaseDate,omitempty"`

	Platform Platform `json:"platform,omitempty"`

	ReleaseType string `json:"releaseType,omitempty"`

	UsesIdfa bool `json:"usesIdfa,omitempty"`

	VersionString string `json:"versionString,omitempty"`
}

// AssertAppStoreVersionAttributesRequired checks if the required fields are not zero-ed
func AssertAppStoreVersionAttributesRequired(obj AppStoreVersionAttributes) error {
	return nil
}

// AssertAppStoreVersionAttributesConstraints checks if the values respects the defined constraints
func AssertAppStoreVersionAttributesConstraints(obj AppStoreVersionAttributes) error {
	return nil
}
