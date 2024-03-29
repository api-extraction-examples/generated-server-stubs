/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreVersionPhasedReleaseCreateRequest struct {

	Data AppStoreVersionPhasedReleaseCreateRequestData `json:"data"`
}

// AssertAppStoreVersionPhasedReleaseCreateRequestRequired checks if the required fields are not zero-ed
func AssertAppStoreVersionPhasedReleaseCreateRequestRequired(obj AppStoreVersionPhasedReleaseCreateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppStoreVersionPhasedReleaseCreateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreVersionPhasedReleaseCreateRequestConstraints checks if the values respects the defined constraints
func AssertAppStoreVersionPhasedReleaseCreateRequestConstraints(obj AppStoreVersionPhasedReleaseCreateRequest) error {
	return nil
}
