/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type RemoveMembersRequest struct {

	// An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user.
	Members string `json:"members"`
}

// AssertRemoveMembersRequestRequired checks if the required fields are not zero-ed
func AssertRemoveMembersRequestRequired(obj RemoveMembersRequest) error {
	elements := map[string]interface{}{
		"members": obj.Members,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertRemoveMembersRequestConstraints checks if the values respects the defined constraints
func AssertRemoveMembersRequestConstraints(obj RemoveMembersRequest) error {
	return nil
}