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

// DashboardGadgetResponse - The list of gadgets on the dashboard.
type DashboardGadgetResponse struct {

	// The list of gadgets.
	Gadgets []DashboardGadget `json:"gadgets"`
}