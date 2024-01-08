/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPreviewSetRelationshipsAppStoreVersionLocalization struct {

	Data AppPreviewSetRelationshipsAppStoreVersionLocalizationData `json:"data,omitempty"`

	Links AppRelationshipsAppInfosLinks `json:"links,omitempty"`
}

// AssertAppPreviewSetRelationshipsAppStoreVersionLocalizationRequired checks if the required fields are not zero-ed
func AssertAppPreviewSetRelationshipsAppStoreVersionLocalizationRequired(obj AppPreviewSetRelationshipsAppStoreVersionLocalization) error {
	if err := AssertAppPreviewSetRelationshipsAppStoreVersionLocalizationDataRequired(obj.Data); err != nil {
		return err
	}
	if err := AssertAppRelationshipsAppInfosLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertAppPreviewSetRelationshipsAppStoreVersionLocalizationConstraints checks if the values respects the defined constraints
func AssertAppPreviewSetRelationshipsAppStoreVersionLocalizationConstraints(obj AppPreviewSetRelationshipsAppStoreVersionLocalization) error {
	return nil
}
