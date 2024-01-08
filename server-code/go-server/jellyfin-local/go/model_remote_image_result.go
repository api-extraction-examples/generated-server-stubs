/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// RemoteImageResult - Class RemoteImageResult.
type RemoteImageResult struct {

	// Gets or sets the images.
	Images *[]RemoteImageInfo `json:"Images,omitempty"`

	// Gets or sets the providers.
	Providers *[]string `json:"Providers,omitempty"`

	// Gets or sets the total record count.
	TotalRecordCount int32 `json:"TotalRecordCount,omitempty"`
}

// AssertRemoteImageResultRequired checks if the required fields are not zero-ed
func AssertRemoteImageResultRequired(obj RemoteImageResult) error {
	if obj.Images != nil {
		for _, el := range *obj.Images {
			if err := AssertRemoteImageInfoRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertRemoteImageResultConstraints checks if the values respects the defined constraints
func AssertRemoteImageResultConstraints(obj RemoteImageResult) error {
	return nil
}
