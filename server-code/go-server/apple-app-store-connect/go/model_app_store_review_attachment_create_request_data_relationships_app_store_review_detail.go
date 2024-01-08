/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail struct {

	Data AppStoreReviewAttachmentRelationshipsAppStoreReviewDetailData `json:"data"`
}

// AssertAppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetailRequired checks if the required fields are not zero-ed
func AssertAppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetailRequired(obj AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppStoreReviewAttachmentRelationshipsAppStoreReviewDetailDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetailConstraints checks if the values respects the defined constraints
func AssertAppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetailConstraints(obj AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail) error {
	return nil
}