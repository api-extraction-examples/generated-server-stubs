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
