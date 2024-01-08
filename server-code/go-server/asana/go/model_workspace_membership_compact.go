/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type WorkspaceMembershipCompact struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	User UserCompact `json:"user,omitempty"`

	Workspace WorkspaceCompact `json:"workspace,omitempty"`
}

// AssertWorkspaceMembershipCompactRequired checks if the required fields are not zero-ed
func AssertWorkspaceMembershipCompactRequired(obj WorkspaceMembershipCompact) error {
	if err := AssertUserCompactRequired(obj.User); err != nil {
		return err
	}
	if err := AssertWorkspaceCompactRequired(obj.Workspace); err != nil {
		return err
	}
	return nil
}

// AssertWorkspaceMembershipCompactConstraints checks if the values respects the defined constraints
func AssertWorkspaceMembershipCompactConstraints(obj WorkspaceMembershipCompact) error {
	return nil
}