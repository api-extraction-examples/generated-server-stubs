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

type ApiV1ScheduledStatusesIdPutRequest struct {

	// ISO 8601 Datetime at which the status will be published. Must be at least 5 minutes into the future.
	ScheduledAt time.Time `json:"scheduled_at,omitempty"`
}