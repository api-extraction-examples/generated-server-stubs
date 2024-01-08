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

type ApiV1AccountsIdFollowPostRequest struct {

	// Receive notifications when this account posts a status? Defaults to false.
	Notify bool `json:"notify,omitempty"`

	// Receive this account's reblogs in home timeline? Defaults to true.
	Reblogs bool `json:"reblogs,omitempty"`
}