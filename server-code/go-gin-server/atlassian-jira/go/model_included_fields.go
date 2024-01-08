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

type IncludedFields struct {

	ActuallyIncluded []string `json:"actuallyIncluded,omitempty"`

	Excluded []string `json:"excluded,omitempty"`

	Included []string `json:"included,omitempty"`
}