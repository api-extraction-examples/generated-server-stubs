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

// FoundUsersAndGroups - List of users and groups found in a search.
type FoundUsersAndGroups struct {

	Groups FoundGroups `json:"groups,omitempty"`

	Users FoundUsers `json:"users,omitempty"`
}