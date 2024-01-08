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

type SimpleListWrapperApplicationRole struct {

	Callback map[string]interface{} `json:"callback,omitempty"`

	Items []ApplicationRole `json:"items,omitempty"`

	MaxResults int32 `json:"max-results,omitempty"`

	PagingCallback map[string]interface{} `json:"pagingCallback,omitempty"`

	Size int32 `json:"size,omitempty"`
}
