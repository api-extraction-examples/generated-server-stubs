/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// Votes - The details of votes on an issue.
type Votes struct {

	// Whether the user making this request has voted on the issue.
	HasVoted bool `json:"hasVoted,omitempty"`

	// The URL of these issue vote details.
	Self string `json:"self,omitempty"`

	// List of the users who have voted on this issue. An empty list is returned when the calling user doesn't have the *View voters and watchers* project permission.
	Voters []User `json:"voters,omitempty"`

	// The number of votes on the issue.
	Votes int64 `json:"votes,omitempty"`
}