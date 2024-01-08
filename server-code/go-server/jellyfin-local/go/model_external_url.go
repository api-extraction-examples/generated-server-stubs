/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ExternalUrl struct {

	// Gets or sets the name.
	Name *string `json:"Name,omitempty"`

	// Gets or sets the type of the item.
	Url *string `json:"Url,omitempty"`
}

// AssertExternalUrlRequired checks if the required fields are not zero-ed
func AssertExternalUrlRequired(obj ExternalUrl) error {
	return nil
}

// AssertExternalUrlConstraints checks if the values respects the defined constraints
func AssertExternalUrlConstraints(obj ExternalUrl) error {
	return nil
}
