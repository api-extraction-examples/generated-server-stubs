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

type DeleteAndReplaceVersionBean struct {

	// An array of custom field IDs (`customFieldId`) and version IDs (`moveTo`) to update when the fields contain the deleted version.
	CustomFieldReplacementList []CustomFieldReplacement `json:"customFieldReplacementList,omitempty"`

	// The ID of the version to update `affectedVersion` to when the field contains the deleted version.
	MoveAffectedIssuesTo int64 `json:"moveAffectedIssuesTo,omitempty"`

	// The ID of the version to update `fixVersion` to when the field contains the deleted version.
	MoveFixIssuesTo int64 `json:"moveFixIssuesTo,omitempty"`
}
