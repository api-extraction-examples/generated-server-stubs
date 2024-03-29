/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreReviewDetailRelationships struct {

	AppStoreReviewAttachments AppStoreReviewDetailRelationshipsAppStoreReviewAttachments `json:"appStoreReviewAttachments,omitempty"`

	AppStoreVersion AppStoreReviewDetailRelationshipsAppStoreVersion `json:"appStoreVersion,omitempty"`
}

// AssertAppStoreReviewDetailRelationshipsRequired checks if the required fields are not zero-ed
func AssertAppStoreReviewDetailRelationshipsRequired(obj AppStoreReviewDetailRelationships) error {
	if err := AssertAppStoreReviewDetailRelationshipsAppStoreReviewAttachmentsRequired(obj.AppStoreReviewAttachments); err != nil {
		return err
	}
	if err := AssertAppStoreReviewDetailRelationshipsAppStoreVersionRequired(obj.AppStoreVersion); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreReviewDetailRelationshipsConstraints checks if the values respects the defined constraints
func AssertAppStoreReviewDetailRelationshipsConstraints(obj AppStoreReviewDetailRelationships) error {
	return nil
}
