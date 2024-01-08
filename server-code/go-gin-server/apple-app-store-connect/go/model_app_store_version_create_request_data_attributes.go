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

type AppStoreVersionCreateRequestDataAttributes struct {

	Copyright string `json:"copyright,omitempty"`

	EarliestReleaseDate time.Time `json:"earliestReleaseDate,omitempty"`

	Platform Platform `json:"platform"`

	ReleaseType string `json:"releaseType,omitempty"`

	UsesIdfa bool `json:"usesIdfa,omitempty"`

	VersionString string `json:"versionString"`
}
