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

// JsonContextVariable - A JSON object with custom content.
type JsonContextVariable struct {

	// Type of custom context variable.
	Type string `json:"type"`

	// A JSON object containing custom content.
	Value map[string]interface{} `json:"value,omitempty"`
}
