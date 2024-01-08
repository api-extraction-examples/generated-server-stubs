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

// ContainerForProjectFeatures - The list of features on a project.
type ContainerForProjectFeatures struct {

	// The project features.
	Features []ProjectFeature `json:"features,omitempty"`
}