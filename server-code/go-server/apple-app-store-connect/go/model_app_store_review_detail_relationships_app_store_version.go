/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreReviewDetailRelationshipsAppStoreVersion struct {

	Data AppRelationshipsAppStoreVersionsDataInner `json:"data,omitempty"`

	Links AppRelationshipsAppInfosLinks `json:"links,omitempty"`
}

// AssertAppStoreReviewDetailRelationshipsAppStoreVersionRequired checks if the required fields are not zero-ed
func AssertAppStoreReviewDetailRelationshipsAppStoreVersionRequired(obj AppStoreReviewDetailRelationshipsAppStoreVersion) error {
	if err := AssertAppRelationshipsAppStoreVersionsDataInnerRequired(obj.Data); err != nil {
		return err
	}
	if err := AssertAppRelationshipsAppInfosLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreReviewDetailRelationshipsAppStoreVersionConstraints checks if the values respects the defined constraints
func AssertAppStoreReviewDetailRelationshipsAppStoreVersionConstraints(obj AppStoreReviewDetailRelationshipsAppStoreVersion) error {
	return nil
}