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

// FunctionReferenceData - Details of functions that can be used in advanced searches.
type FunctionReferenceData struct {

	// The display name of the function.
	DisplayName string `json:"displayName,omitempty"`

	// Whether the function can take a list of arguments.
	IsList string `json:"isList,omitempty"`

	// The data types returned by the function.
	Types []string `json:"types,omitempty"`

	// The function identifier.
	Value string `json:"value,omitempty"`
}
