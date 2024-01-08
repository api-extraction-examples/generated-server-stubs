/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type NameIdPair struct {

	// Gets or sets the identifier.
	Id *string `json:"Id,omitempty"`

	// Gets or sets the name.
	Name *string `json:"Name,omitempty"`
}

// AssertNameIdPairRequired checks if the required fields are not zero-ed
func AssertNameIdPairRequired(obj NameIdPair) error {
	return nil
}

// AssertNameIdPairConstraints checks if the values respects the defined constraints
func AssertNameIdPairConstraints(obj NameIdPair) error {
	return nil
}
