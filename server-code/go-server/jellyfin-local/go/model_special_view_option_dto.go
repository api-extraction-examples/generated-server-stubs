/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// SpecialViewOptionDto - Special view option dto.
type SpecialViewOptionDto struct {

	// Gets or sets view option id.
	Id *string `json:"Id,omitempty"`

	// Gets or sets view option name.
	Name *string `json:"Name,omitempty"`
}

// AssertSpecialViewOptionDtoRequired checks if the required fields are not zero-ed
func AssertSpecialViewOptionDtoRequired(obj SpecialViewOptionDto) error {
	return nil
}

// AssertSpecialViewOptionDtoConstraints checks if the values respects the defined constraints
func AssertSpecialViewOptionDtoConstraints(obj SpecialViewOptionDto) error {
	return nil
}