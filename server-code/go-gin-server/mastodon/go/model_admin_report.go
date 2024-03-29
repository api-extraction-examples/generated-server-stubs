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

import (
	"time"
)

// AdminReport - Admin-level information about a filed report.
type AdminReport struct {

	Account Account `json:"account,omitempty"`

	// The action taken to resolve this report. Enumerable oneOf.
	ActionTaken string `json:"action_taken,omitempty"`

	AssignedAccount Account `json:"assigned_account,omitempty"`

	// An optional reason for reporting.
	Comment string `json:"comment,omitempty"`

	// The time the report was filed.
	CreatedAt time.Time `json:"created_at,omitempty"`

	// The ID of the report in the database. Cast from an integer, but not guaranteed to be a number.
	Id string `json:"id,omitempty"`

	// Statuses attached to the report, for context.
	Statuses []Status `json:"statuses,omitempty"`

	TargetAccount Account `json:"target_account,omitempty"`

	// The time of last action on this report.
	UpdatedAt time.Time `json:"updated_at,omitempty"`
}
