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




// PermissionHolder - Details of a user, group, field, or project role that holds a permission. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.
type PermissionHolder struct {

	// Expand options that include additional permission holder details in the response.
	Expand string `json:"expand,omitempty"`

	// As a group's name can change, use of `value` is recommended. The identifier associated withthe `type` value that defines the holder of the permission.
	Parameter string `json:"parameter,omitempty"`

	// The type of permission holder.
	Type string `json:"type"`

	// The identifier associated with the `type` value that defines the holder of the permission.
	Value string `json:"value,omitempty"`
}

// AssertPermissionHolderRequired checks if the required fields are not zero-ed
func AssertPermissionHolderRequired(obj PermissionHolder) error {
	elements := map[string]interface{}{
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPermissionHolderConstraints checks if the values respects the defined constraints
func AssertPermissionHolderConstraints(obj PermissionHolder) error {
	return nil
}
