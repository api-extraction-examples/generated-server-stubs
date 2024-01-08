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

// CustomFieldContextDefaultValueUrl - The default value for a URL custom field.
type CustomFieldContextDefaultValueUrl struct {

	// The ID of the context.
	ContextId string `json:"contextId"`

	Type string `json:"type"`

	// The default URL.
	Url string `json:"url"`
}
