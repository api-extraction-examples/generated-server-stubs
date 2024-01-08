/*
 * 1Password Connect
 *
 * REST API interface for 1Password Connect.
 *
 * API version: 1.5.7
 * Contact: support@1password.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PatchInner struct {

	Op string `json:"op"`

	// An RFC6901 JSON Pointer pointing to the Item document, an Item Attribute, and Item Field by Field ID, or an Item Field Attribute
	Path string `json:"path"`

	Value map[string]interface{} `json:"value,omitempty"`
}

// AssertPatchInnerRequired checks if the required fields are not zero-ed
func AssertPatchInnerRequired(obj PatchInner) error {
	elements := map[string]interface{}{
		"op": obj.Op,
		"path": obj.Path,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPatchInnerConstraints checks if the values respects the defined constraints
func AssertPatchInnerConstraints(obj PatchInner) error {
	return nil
}
