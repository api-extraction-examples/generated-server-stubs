/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppScreenshotAttributes struct {

	AssetDeliveryState AppMediaAssetState `json:"assetDeliveryState,omitempty"`

	AssetToken string `json:"assetToken,omitempty"`

	AssetType string `json:"assetType,omitempty"`

	FileName string `json:"fileName,omitempty"`

	FileSize int32 `json:"fileSize,omitempty"`

	ImageAsset ImageAsset `json:"imageAsset,omitempty"`

	SourceFileChecksum string `json:"sourceFileChecksum,omitempty"`

	UploadOperations []UploadOperation `json:"uploadOperations,omitempty"`
}

// AssertAppScreenshotAttributesRequired checks if the required fields are not zero-ed
func AssertAppScreenshotAttributesRequired(obj AppScreenshotAttributes) error {
	if err := AssertAppMediaAssetStateRequired(obj.AssetDeliveryState); err != nil {
		return err
	}
	if err := AssertImageAssetRequired(obj.ImageAsset); err != nil {
		return err
	}
	for _, el := range obj.UploadOperations {
		if err := AssertUploadOperationRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertAppScreenshotAttributesConstraints checks if the values respects the defined constraints
func AssertAppScreenshotAttributesConstraints(obj AppScreenshotAttributes) error {
	return nil
}
