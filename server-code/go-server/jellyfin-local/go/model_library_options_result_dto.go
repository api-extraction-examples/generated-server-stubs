/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// LibraryOptionsResultDto - Library options result dto.
type LibraryOptionsResultDto struct {

	// Gets or sets the metadata readers.
	MetadataReaders *[]LibraryOptionInfoDto `json:"MetadataReaders,omitempty"`

	// Gets or sets the metadata savers.
	MetadataSavers *[]LibraryOptionInfoDto `json:"MetadataSavers,omitempty"`

	// Gets or sets the subtitle fetchers.
	SubtitleFetchers *[]LibraryOptionInfoDto `json:"SubtitleFetchers,omitempty"`

	// Gets or sets the type options.
	TypeOptions *[]LibraryTypeOptionsDto `json:"TypeOptions,omitempty"`
}

// AssertLibraryOptionsResultDtoRequired checks if the required fields are not zero-ed
func AssertLibraryOptionsResultDtoRequired(obj LibraryOptionsResultDto) error {
	if obj.MetadataReaders != nil {
		for _, el := range *obj.MetadataReaders {
			if err := AssertLibraryOptionInfoDtoRequired(el); err != nil {
				return err
			}
		}
	}
	if obj.MetadataSavers != nil {
		for _, el := range *obj.MetadataSavers {
			if err := AssertLibraryOptionInfoDtoRequired(el); err != nil {
				return err
			}
		}
	}
	if obj.SubtitleFetchers != nil {
		for _, el := range *obj.SubtitleFetchers {
			if err := AssertLibraryOptionInfoDtoRequired(el); err != nil {
				return err
			}
		}
	}
	if obj.TypeOptions != nil {
		for _, el := range *obj.TypeOptions {
			if err := AssertLibraryTypeOptionsDtoRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertLibraryOptionsResultDtoConstraints checks if the values respects the defined constraints
func AssertLibraryOptionsResultDtoConstraints(obj LibraryOptionsResultDto) error {
	return nil
}
