/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type UserBaseResponse struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// *Read-only except when same user as requester*. The user’s name.
	Name string `json:"name,omitempty"`

	// The user's email address.
	Email string `json:"email,omitempty"`

	Photo *UserBaseResponseAllOfPhoto `json:"photo,omitempty"`
}

// AssertUserBaseResponseRequired checks if the required fields are not zero-ed
func AssertUserBaseResponseRequired(obj UserBaseResponse) error {
	if obj.Photo != nil {
		if err := AssertUserBaseResponseAllOfPhotoRequired(*obj.Photo); err != nil {
			return err
		}
	}
	return nil
}

// AssertUserBaseResponseConstraints checks if the values respects the defined constraints
func AssertUserBaseResponseConstraints(obj UserBaseResponse) error {
	return nil
}