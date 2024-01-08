/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion struct {

	Data AppRelationshipsAppStoreVersionsDataInner `json:"data"`
}

// AssertAppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersionRequired checks if the required fields are not zero-ed
func AssertAppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersionRequired(obj AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppRelationshipsAppStoreVersionsDataInnerRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersionConstraints checks if the values respects the defined constraints
func AssertAppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersionConstraints(obj AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion) error {
	return nil
}