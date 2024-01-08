/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppScreenshotRelationships struct {

	AppScreenshotSet AppScreenshotRelationshipsAppScreenshotSet `json:"appScreenshotSet,omitempty"`
}

// AssertAppScreenshotRelationshipsRequired checks if the required fields are not zero-ed
func AssertAppScreenshotRelationshipsRequired(obj AppScreenshotRelationships) error {
	if err := AssertAppScreenshotRelationshipsAppScreenshotSetRequired(obj.AppScreenshotSet); err != nil {
		return err
	}
	return nil
}

// AssertAppScreenshotRelationshipsConstraints checks if the values respects the defined constraints
func AssertAppScreenshotRelationshipsConstraints(obj AppScreenshotRelationships) error {
	return nil
}
