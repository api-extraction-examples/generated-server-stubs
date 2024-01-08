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

type OperationMessage struct {

	// The human-readable message that describes the result.
	Message string `json:"message"`

	// The status code of the response.
	StatusCode int32 `json:"statusCode"`
}
