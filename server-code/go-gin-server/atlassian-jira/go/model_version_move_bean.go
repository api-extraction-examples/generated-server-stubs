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

type VersionMoveBean struct {

	// The URL (self link) of the version after which to place the moved version. Cannot be used with `position`.
	After string `json:"after,omitempty"`

	// An absolute position in which to place the moved version. Cannot be used with `after`.
	Position string `json:"position,omitempty"`
}
