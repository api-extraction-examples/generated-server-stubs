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

// Dashboard - Details of a dashboard.
type Dashboard struct {

	// The automatic refresh interval for the dashboard in milliseconds.
	AutomaticRefreshMs int32 `json:"automaticRefreshMs,omitempty"`

	Description string `json:"description,omitempty"`

	// The details of any edit share permissions for the dashboard.
	EditPermissions []SharePermission `json:"editPermissions,omitempty"`

	// The ID of the dashboard.
	Id string `json:"id,omitempty"`

	// Whether the dashboard is selected as a favorite by the user.
	IsFavourite bool `json:"isFavourite,omitempty"`

	// Whether the current user has permission to edit the dashboard.
	IsWritable bool `json:"isWritable,omitempty"`

	// The name of the dashboard.
	Name string `json:"name,omitempty"`

	Owner DashboardOwner `json:"owner,omitempty"`

	// The number of users who have this dashboard as a favorite.
	Popularity int64 `json:"popularity,omitempty"`

	// The rank of this dashboard.
	Rank int32 `json:"rank,omitempty"`

	// The URL of these dashboard details.
	Self string `json:"self,omitempty"`

	// The details of any view share permissions for the dashboard.
	SharePermissions []SharePermission `json:"sharePermissions,omitempty"`

	// Whether the current dashboard is system dashboard.
	SystemDashboard bool `json:"systemDashboard,omitempty"`

	// The URL of the dashboard.
	View string `json:"view,omitempty"`
}