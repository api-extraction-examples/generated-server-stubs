/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppScreenshotCreateRequestDataAttributes struct {

	FileName string `json:"fileName"`

	FileSize int32 `json:"fileSize"`
}

// AssertAppScreenshotCreateRequestDataAttributesRequired checks if the required fields are not zero-ed
func AssertAppScreenshotCreateRequestDataAttributesRequired(obj AppScreenshotCreateRequestDataAttributes) error {
	elements := map[string]interface{}{
		"fileName": obj.FileName,
		"fileSize": obj.FileSize,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertAppScreenshotCreateRequestDataAttributesConstraints checks if the values respects the defined constraints
func AssertAppScreenshotCreateRequestDataAttributesConstraints(obj AppScreenshotCreateRequestDataAttributes) error {
	return nil
}
