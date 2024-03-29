/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreVersionCreateRequest struct {

	Data AppStoreVersionCreateRequestData `json:"data"`
}

// AssertAppStoreVersionCreateRequestRequired checks if the required fields are not zero-ed
func AssertAppStoreVersionCreateRequestRequired(obj AppStoreVersionCreateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppStoreVersionCreateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreVersionCreateRequestConstraints checks if the values respects the defined constraints
func AssertAppStoreVersionCreateRequestConstraints(obj AppStoreVersionCreateRequest) error {
	return nil
}
