/*
 * CircleCI REST API
 *
 * The CircleCI API is a RESTful, fully-featured API that allows you to do almost anything in CircleCI. You can access all information and trigger all actions. The only thing we don’t provide access to is billing functions, which must be done from the CircleCI web UI. 
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"time"
)

type BuildSummary struct {

	AddedAt time.Time `json:"added_at,omitempty"`

	BuildNum int32 `json:"build_num,omitempty"`

	Outcome Outcome `json:"outcome,omitempty"`

	PushedAt time.Time `json:"pushed_at,omitempty"`

	Status Status `json:"status,omitempty"`

	VcsRevision string `json:"vcs_revision,omitempty"`
}
