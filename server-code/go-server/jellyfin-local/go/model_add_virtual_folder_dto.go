/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// AddVirtualFolderDto - Add virtual folder dto.
type AddVirtualFolderDto struct {

	LibraryOptions LibraryOptions `json:"LibraryOptions,omitempty"`
}

// AssertAddVirtualFolderDtoRequired checks if the required fields are not zero-ed
func AssertAddVirtualFolderDtoRequired(obj AddVirtualFolderDto) error {
	if err := AssertLibraryOptionsRequired(obj.LibraryOptions); err != nil {
		return err
	}
	return nil
}

// AssertAddVirtualFolderDtoConstraints checks if the values respects the defined constraints
func AssertAddVirtualFolderDtoConstraints(obj AddVirtualFolderDto) error {
	return nil
}