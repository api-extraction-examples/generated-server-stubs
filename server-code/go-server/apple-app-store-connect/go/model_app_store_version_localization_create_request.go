/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreVersionLocalizationCreateRequest struct {

	Data AppStoreVersionLocalizationCreateRequestData `json:"data"`
}

// AssertAppStoreVersionLocalizationCreateRequestRequired checks if the required fields are not zero-ed
func AssertAppStoreVersionLocalizationCreateRequestRequired(obj AppStoreVersionLocalizationCreateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppStoreVersionLocalizationCreateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreVersionLocalizationCreateRequestConstraints checks if the values respects the defined constraints
func AssertAppStoreVersionLocalizationCreateRequestConstraints(obj AppStoreVersionLocalizationCreateRequest) error {
	return nil
}
