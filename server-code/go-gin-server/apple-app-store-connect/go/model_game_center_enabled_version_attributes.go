/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type GameCenterEnabledVersionAttributes struct {

	IconAsset ImageAsset `json:"iconAsset,omitempty"`

	Platform Platform `json:"platform,omitempty"`

	VersionString string `json:"versionString,omitempty"`
}