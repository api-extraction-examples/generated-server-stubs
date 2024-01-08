/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPreviewSetCreateRequest struct {

	Data AppPreviewSetCreateRequestData `json:"data"`
}

// AssertAppPreviewSetCreateRequestRequired checks if the required fields are not zero-ed
func AssertAppPreviewSetCreateRequestRequired(obj AppPreviewSetCreateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppPreviewSetCreateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAppPreviewSetCreateRequestConstraints checks if the values respects the defined constraints
func AssertAppPreviewSetCreateRequestConstraints(obj AppPreviewSetCreateRequest) error {
	return nil
}