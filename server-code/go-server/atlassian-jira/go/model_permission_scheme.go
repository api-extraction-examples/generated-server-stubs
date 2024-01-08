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




// PermissionScheme - Details of a permission scheme.
type PermissionScheme struct {

	// A description for the permission scheme.
	Description string `json:"description,omitempty"`

	// The expand options available for the permission scheme.
	Expand string `json:"expand,omitempty"`

	// The ID of the permission scheme.
	Id int64 `json:"id,omitempty"`

	// The name of the permission scheme. Must be unique.
	Name string `json:"name"`

	// The permission scheme to create or update. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more information.
	Permissions []PermissionGrant `json:"permissions,omitempty"`

	Scope Scope `json:"scope,omitempty"`

	// The URL of the permission scheme.
	Self string `json:"self,omitempty"`
}

// AssertPermissionSchemeRequired checks if the required fields are not zero-ed
func AssertPermissionSchemeRequired(obj PermissionScheme) error {
	elements := map[string]interface{}{
		"name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Permissions {
		if err := AssertPermissionGrantRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertPermissionSchemeConstraints checks if the values respects the defined constraints
func AssertPermissionSchemeConstraints(obj PermissionScheme) error {
	return nil
}