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

// Report - Reports filed against users and/or statuses, to be taken action on by moderators.
type Report struct {

	ActionTaken bool `json:"action_taken,omitempty"`

	ActionTakenAt time.Time `json:"action_taken_at,omitempty"`

	Category string `json:"category,omitempty"`

	Comment string `json:"comment,omitempty"`

	CreatedAt time.Time `json:"created_at,omitempty"`

	Forwarded bool `json:"forwarded,omitempty"`

	Id string `json:"id,omitempty"`

	RuleIds []int32 `json:"rule_ids,omitempty"`

	StatusIds []int32 `json:"status_ids,omitempty"`

	TargetAccount Account `json:"target_account,omitempty"`
}