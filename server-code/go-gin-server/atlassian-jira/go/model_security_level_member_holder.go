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

// SecurityLevelMemberHolder - The user or group being granted the permission. It consists of a `type` and a type-dependent `parameter`. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.
type SecurityLevelMemberHolder struct {

	// Expand options that include additional permission holder details in the response.
	Expand string `json:"expand,omitempty"`

	// As a group's name can change, use of `value` is recommended. The identifier associated withthe `type` value that defines the holder of the permission.
	Parameter string `json:"parameter,omitempty"`

	// The type of permission holder.
	Type string `json:"type"`

	// The identifier associated with the `type` value that defines the holder of the permission.
	Value string `json:"value,omitempty"`
}
