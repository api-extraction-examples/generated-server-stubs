/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type SectionRequest struct {

	// An existing section within this project after which the added section should be inserted. Cannot be provided together with insert_before.
	InsertAfter string `json:"insert_after,omitempty"`

	// An existing section within this project before which the added section should be inserted. Cannot be provided together with insert_after.
	InsertBefore string `json:"insert_before,omitempty"`

	// The text to be displayed as the section name. This cannot be an empty string.
	Name string `json:"name"`
}