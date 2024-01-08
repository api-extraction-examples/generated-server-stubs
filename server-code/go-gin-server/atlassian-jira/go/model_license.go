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

// License - Details about a license for the Jira instance.
type License struct {

	// The applications under this license.
	Applications []LicensedApplication `json:"applications"`
}
