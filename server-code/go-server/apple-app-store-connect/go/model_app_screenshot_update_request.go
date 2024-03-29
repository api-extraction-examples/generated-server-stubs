/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppScreenshotUpdateRequest struct {

	Data AppScreenshotUpdateRequestData `json:"data"`
}

// AssertAppScreenshotUpdateRequestRequired checks if the required fields are not zero-ed
func AssertAppScreenshotUpdateRequestRequired(obj AppScreenshotUpdateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppScreenshotUpdateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAppScreenshotUpdateRequestConstraints checks if the values respects the defined constraints
func AssertAppScreenshotUpdateRequestConstraints(obj AppScreenshotUpdateRequest) error {
	return nil
}
