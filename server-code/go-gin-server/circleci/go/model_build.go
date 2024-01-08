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

type Build struct {

	// commit message body
	Body string `json:"body,omitempty"`

	Branch string `json:"branch,omitempty"`

	BuildTimeMillis int32 `json:"build_time_millis,omitempty"`

	BuildUrl string `json:"build_url,omitempty"`

	CommitterEmail string `json:"committer_email,omitempty"`

	CommitterName string `json:"committer_name,omitempty"`

	// reason why we didn't build, if we didn't build
	DontBuild *string `json:"dont_build,omitempty"`

	Lifecycle Lifecycle `json:"lifecycle,omitempty"`

	Previous PreviousBuild `json:"previous,omitempty"`

	// time build was queued
	QueuedAt time.Time `json:"queued_at,omitempty"`

	Reponame string `json:"reponame,omitempty"`

	// build_num of the build this is a retry of
	RetryOf *int32 `json:"retry_of,omitempty"`

	// time build started
	StartTime time.Time `json:"start_time,omitempty"`

	// time build finished
	StopTime time.Time `json:"stop_time,omitempty"`

	Subject string `json:"subject,omitempty"`

	Username string `json:"username,omitempty"`

	VcsUrl string `json:"vcs_url,omitempty"`

	// short string explaining the reason we built
	Why string `json:"why,omitempty"`
}
