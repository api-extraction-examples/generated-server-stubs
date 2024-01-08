/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ProjectSectionInsertRequest struct {

	// Insert the given section immediately after the section specified by this parameter.
	AfterSection string `json:"after_section,omitempty"`

	// Insert the given section immediately before the section specified by this parameter.
	BeforeSection string `json:"before_section,omitempty"`

	// The project in which to reorder the given section.
	Project string `json:"project"`

	// The section to reorder.
	Section string `json:"section"`
}

// AssertProjectSectionInsertRequestRequired checks if the required fields are not zero-ed
func AssertProjectSectionInsertRequestRequired(obj ProjectSectionInsertRequest) error {
	elements := map[string]interface{}{
		"project": obj.Project,
		"section": obj.Section,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertProjectSectionInsertRequestConstraints checks if the values respects the defined constraints
func AssertProjectSectionInsertRequestConstraints(obj ProjectSectionInsertRequest) error {
	return nil
}