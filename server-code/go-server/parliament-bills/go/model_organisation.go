/*
 * Bills API
 *
 * API to get and search for information regarding Bills, their stages, associated amendments and publications.
 *
 * API version: v1
 * Contact: softwareengineering@parliament.uk
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type Organisation struct {

	Name *string `json:"name,omitempty"`

	Url *string `json:"url,omitempty"`
}

// AssertOrganisationRequired checks if the required fields are not zero-ed
func AssertOrganisationRequired(obj Organisation) error {
	return nil
}

// AssertOrganisationConstraints checks if the values respects the defined constraints
func AssertOrganisationConstraints(obj Organisation) error {
	return nil
}