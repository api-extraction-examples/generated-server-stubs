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

// IssueMatches - A list of matched issues or errors for each JQL query, in the order the JQL queries were passed.
type IssueMatches struct {

	Matches []IssueMatchesForJql `json:"matches"`
}
