/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// UserBaseResponseAllOfPhoto - A map of the user’s profile photo in various sizes, or null if no photo is set. Sizes provided are 21, 27, 36, 60, 128, and 1024. All images are in PNG format, except for 1024 (which is in JPEG format).
type UserBaseResponseAllOfPhoto struct {

	Image1024x1024 string `json:"image_1024x1024,omitempty"`

	Image128x128 string `json:"image_128x128,omitempty"`

	Image21x21 string `json:"image_21x21,omitempty"`

	Image27x27 string `json:"image_27x27,omitempty"`

	Image36x36 string `json:"image_36x36,omitempty"`

	Image60x60 string `json:"image_60x60,omitempty"`
}

// AssertUserBaseResponseAllOfPhotoRequired checks if the required fields are not zero-ed
func AssertUserBaseResponseAllOfPhotoRequired(obj UserBaseResponseAllOfPhoto) error {
	return nil
}

// AssertUserBaseResponseAllOfPhotoConstraints checks if the values respects the defined constraints
func AssertUserBaseResponseAllOfPhotoConstraints(obj UserBaseResponseAllOfPhoto) error {
	return nil
}
