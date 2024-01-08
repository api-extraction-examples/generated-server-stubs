/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPreviewSetRelationships struct {

	AppPreviews AppPreviewSetRelationshipsAppPreviews `json:"appPreviews,omitempty"`

	AppStoreVersionLocalization AppPreviewSetRelationshipsAppStoreVersionLocalization `json:"appStoreVersionLocalization,omitempty"`
}

// AssertAppPreviewSetRelationshipsRequired checks if the required fields are not zero-ed
func AssertAppPreviewSetRelationshipsRequired(obj AppPreviewSetRelationships) error {
	if err := AssertAppPreviewSetRelationshipsAppPreviewsRequired(obj.AppPreviews); err != nil {
		return err
	}
	if err := AssertAppPreviewSetRelationshipsAppStoreVersionLocalizationRequired(obj.AppStoreVersionLocalization); err != nil {
		return err
	}
	return nil
}

// AssertAppPreviewSetRelationshipsConstraints checks if the values respects the defined constraints
func AssertAppPreviewSetRelationshipsConstraints(obj AppPreviewSetRelationships) error {
	return nil
}