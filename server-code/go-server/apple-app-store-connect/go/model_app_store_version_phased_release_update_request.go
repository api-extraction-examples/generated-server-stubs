/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreVersionPhasedReleaseUpdateRequest struct {

	Data AppStoreVersionPhasedReleaseUpdateRequestData `json:"data"`
}

// AssertAppStoreVersionPhasedReleaseUpdateRequestRequired checks if the required fields are not zero-ed
func AssertAppStoreVersionPhasedReleaseUpdateRequestRequired(obj AppStoreVersionPhasedReleaseUpdateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppStoreVersionPhasedReleaseUpdateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreVersionPhasedReleaseUpdateRequestConstraints checks if the values respects the defined constraints
func AssertAppStoreVersionPhasedReleaseUpdateRequestConstraints(obj AppStoreVersionPhasedReleaseUpdateRequest) error {
	return nil
}
