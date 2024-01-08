/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization struct {

	Data AppPreviewSetRelationshipsAppStoreVersionLocalizationData `json:"data"`
}

// AssertAppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalizationRequired checks if the required fields are not zero-ed
func AssertAppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalizationRequired(obj AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppPreviewSetRelationshipsAppStoreVersionLocalizationDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalizationConstraints checks if the values respects the defined constraints
func AssertAppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalizationConstraints(obj AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization) error {
	return nil
}