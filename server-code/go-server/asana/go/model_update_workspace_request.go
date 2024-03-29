/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type UpdateWorkspaceRequest struct {

	Data WorkspaceCompact `json:"data,omitempty"`
}

// AssertUpdateWorkspaceRequestRequired checks if the required fields are not zero-ed
func AssertUpdateWorkspaceRequestRequired(obj UpdateWorkspaceRequest) error {
	if err := AssertWorkspaceCompactRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertUpdateWorkspaceRequestConstraints checks if the values respects the defined constraints
func AssertUpdateWorkspaceRequestConstraints(obj UpdateWorkspaceRequest) error {
	return nil
}
