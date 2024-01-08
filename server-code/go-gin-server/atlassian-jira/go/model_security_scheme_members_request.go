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

// SecuritySchemeMembersRequest - Details of issue security scheme level new members.
type SecuritySchemeMembersRequest struct {

	// The list of level members which should be added to the issue security scheme level.
	Members []SecuritySchemeLevelMemberBean `json:"members,omitempty"`
}