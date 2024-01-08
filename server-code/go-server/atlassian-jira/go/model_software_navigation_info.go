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




type SoftwareNavigationInfo struct {

	BoardId int64 `json:"boardId,omitempty"`

	BoardName string `json:"boardName,omitempty"`

	SimpleBoard bool `json:"simpleBoard,omitempty"`

	TotalBoardsInProject int64 `json:"totalBoardsInProject,omitempty"`
}

// AssertSoftwareNavigationInfoRequired checks if the required fields are not zero-ed
func AssertSoftwareNavigationInfoRequired(obj SoftwareNavigationInfo) error {
	return nil
}

// AssertSoftwareNavigationInfoConstraints checks if the values respects the defined constraints
func AssertSoftwareNavigationInfoConstraints(obj SoftwareNavigationInfo) error {
	return nil
}
