/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// PathSubstitution - Defines the MediaBrowser.Model.Configuration.PathSubstitution.
type PathSubstitution struct {

	// Gets or sets the value to substitute.
	From *string `json:"From,omitempty"`

	// Gets or sets the value to substitution with.
	To *string `json:"To,omitempty"`
}

// AssertPathSubstitutionRequired checks if the required fields are not zero-ed
func AssertPathSubstitutionRequired(obj PathSubstitution) error {
	return nil
}

// AssertPathSubstitutionConstraints checks if the values respects the defined constraints
func AssertPathSubstitutionConstraints(obj PathSubstitution) error {
	return nil
}
