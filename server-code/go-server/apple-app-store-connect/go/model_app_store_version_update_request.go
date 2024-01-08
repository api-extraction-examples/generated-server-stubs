/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreVersionUpdateRequest struct {

	Data AppStoreVersionUpdateRequestData `json:"data"`
}

// AssertAppStoreVersionUpdateRequestRequired checks if the required fields are not zero-ed
func AssertAppStoreVersionUpdateRequestRequired(obj AppStoreVersionUpdateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppStoreVersionUpdateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreVersionUpdateRequestConstraints checks if the values respects the defined constraints
func AssertAppStoreVersionUpdateRequestConstraints(obj AppStoreVersionUpdateRequest) error {
	return nil
}
