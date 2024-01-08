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




// FileSection - For files that are in a section, this field describes the section.
type FileSection struct {

	Id string `json:"id,omitempty"`
}

// AssertFileSectionRequired checks if the required fields are not zero-ed
func AssertFileSectionRequired(obj FileSection) error {
	return nil
}

// AssertFileSectionConstraints checks if the values respects the defined constraints
func AssertFileSectionConstraints(obj FileSection) error {
	return nil
}
