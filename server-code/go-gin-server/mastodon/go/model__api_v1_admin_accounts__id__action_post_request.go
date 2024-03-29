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

type ApiV1AdminAccountsIdActionPostRequest struct {

	// ID of an associated report that caused this action to be taken
	ReportId string `json:"report_id,omitempty"`

	// Whether an email should be sent to the user with the above information.
	SendEmailNotification bool `json:"send_email_notification,omitempty"`

	// Additional text for clarification of why this action was taken
	Text string `json:"text,omitempty"`

	// Type of action to be taken. Enumerable oneOf: none disable silence suspend
	Type string `json:"type,omitempty"`

	// ID of a preset warning
	WarningPresetId string `json:"warning_preset_id,omitempty"`
}
