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



// BuildDetail - previous build
type BuildDetail struct {

	AllCommitDetails []CommitDetail `json:"all_commit_details,omitempty"`

	Compare *string `json:"compare,omitempty"`

	JobName string `json:"job_name,omitempty"`

	Node *interface{} `json:"node,omitempty"`

	PreviousSuccessfulBuild PreviousBuild `json:"previous_successful_build,omitempty"`

	Retries *bool `json:"retries,omitempty"`

	SshEnabled *bool `json:"ssh_enabled,omitempty"`

	Timedout *bool `json:"timedout,omitempty"`

	UsageQueuedAt time.Time `json:"usage_queued_at,omitempty"`

	User User `json:"user,omitempty"`
}

// AssertBuildDetailRequired checks if the required fields are not zero-ed
func AssertBuildDetailRequired(obj BuildDetail) error {
	for _, el := range obj.AllCommitDetails {
		if err := AssertCommitDetailRequired(el); err != nil {
			return err
		}
	}
	if err := AssertPreviousBuildRequired(obj.PreviousSuccessfulBuild); err != nil {
		return err
	}
	if err := AssertUserRequired(obj.User); err != nil {
		return err
	}
	return nil
}

// AssertBuildDetailConstraints checks if the values respects the defined constraints
func AssertBuildDetailConstraints(obj BuildDetail) error {
	return nil
}
