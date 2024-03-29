/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreVersionLocalizationRelationships struct {

	AppPreviewSets AppStoreVersionLocalizationRelationshipsAppPreviewSets `json:"appPreviewSets,omitempty"`

	AppScreenshotSets AppStoreVersionLocalizationRelationshipsAppScreenshotSets `json:"appScreenshotSets,omitempty"`

	AppStoreVersion AppStoreReviewDetailRelationshipsAppStoreVersion `json:"appStoreVersion,omitempty"`
}

// AssertAppStoreVersionLocalizationRelationshipsRequired checks if the required fields are not zero-ed
func AssertAppStoreVersionLocalizationRelationshipsRequired(obj AppStoreVersionLocalizationRelationships) error {
	if err := AssertAppStoreVersionLocalizationRelationshipsAppPreviewSetsRequired(obj.AppPreviewSets); err != nil {
		return err
	}
	if err := AssertAppStoreVersionLocalizationRelationshipsAppScreenshotSetsRequired(obj.AppScreenshotSets); err != nil {
		return err
	}
	if err := AssertAppStoreReviewDetailRelationshipsAppStoreVersionRequired(obj.AppStoreVersion); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreVersionLocalizationRelationshipsConstraints checks if the values respects the defined constraints
func AssertAppStoreVersionLocalizationRelationshipsConstraints(obj AppStoreVersionLocalizationRelationships) error {
	return nil
}
