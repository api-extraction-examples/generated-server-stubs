/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// BaseItemDtoImageBlurHashes - Gets or sets the blurhashes for the image tags.  Maps image type to dictionary mapping image tag to blurhash value.
type BaseItemDtoImageBlurHashes struct {

	Art map[string]string `json:"Art,omitempty"`

	Backdrop map[string]string `json:"Backdrop,omitempty"`

	Banner map[string]string `json:"Banner,omitempty"`

	Box map[string]string `json:"Box,omitempty"`

	BoxRear map[string]string `json:"BoxRear,omitempty"`

	Chapter map[string]string `json:"Chapter,omitempty"`

	Disc map[string]string `json:"Disc,omitempty"`

	Logo map[string]string `json:"Logo,omitempty"`

	Menu map[string]string `json:"Menu,omitempty"`

	Primary map[string]string `json:"Primary,omitempty"`

	Profile map[string]string `json:"Profile,omitempty"`

	Screenshot map[string]string `json:"Screenshot,omitempty"`

	Thumb map[string]string `json:"Thumb,omitempty"`
}

// AssertBaseItemDtoImageBlurHashesRequired checks if the required fields are not zero-ed
func AssertBaseItemDtoImageBlurHashesRequired(obj BaseItemDtoImageBlurHashes) error {
	return nil
}

// AssertBaseItemDtoImageBlurHashesConstraints checks if the values respects the defined constraints
func AssertBaseItemDtoImageBlurHashesConstraints(obj BaseItemDtoImageBlurHashes) error {
	return nil
}
