/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppScreenshotUpdateRequestDataAttributes struct {

	SourceFileChecksum string `json:"sourceFileChecksum,omitempty"`

	Uploaded bool `json:"uploaded,omitempty"`
}

// AssertAppScreenshotUpdateRequestDataAttributesRequired checks if the required fields are not zero-ed
func AssertAppScreenshotUpdateRequestDataAttributesRequired(obj AppScreenshotUpdateRequestDataAttributes) error {
	return nil
}

// AssertAppScreenshotUpdateRequestDataAttributesConstraints checks if the values respects the defined constraints
func AssertAppScreenshotUpdateRequestDataAttributesConstraints(obj AppScreenshotUpdateRequestDataAttributes) error {
	return nil
}
