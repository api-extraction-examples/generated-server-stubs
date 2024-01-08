/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppScreenshotCreateRequest struct {

	Data AppScreenshotCreateRequestData `json:"data"`
}

// AssertAppScreenshotCreateRequestRequired checks if the required fields are not zero-ed
func AssertAppScreenshotCreateRequestRequired(obj AppScreenshotCreateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppScreenshotCreateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAppScreenshotCreateRequestConstraints checks if the values respects the defined constraints
func AssertAppScreenshotCreateRequestConstraints(obj AppScreenshotCreateRequest) error {
	return nil
}