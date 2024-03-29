/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0
 * Contact: sardo@hey.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type OauthTokenPost200Response struct {

	AccessToken string `json:"access_token,omitempty"`

	// UNIX timestamp
	CreatedAt int32 `json:"created_at,omitempty"`

	Scope string `json:"scope,omitempty"`

	TokenType string `json:"token_type,omitempty"`
}
