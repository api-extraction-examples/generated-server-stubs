/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppScreenshotSetCreateRequestData struct {

	Attributes AppScreenshotSetCreateRequestDataAttributes `json:"attributes"`

	Relationships AppPreviewSetCreateRequestDataRelationships `json:"relationships"`

	Type string `json:"type"`
}

// AssertAppScreenshotSetCreateRequestDataRequired checks if the required fields are not zero-ed
func AssertAppScreenshotSetCreateRequestDataRequired(obj AppScreenshotSetCreateRequestData) error {
	elements := map[string]interface{}{
		"attributes": obj.Attributes,
		"relationships": obj.Relationships,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppScreenshotSetCreateRequestDataAttributesRequired(obj.Attributes); err != nil {
		return err
	}
	if err := AssertAppPreviewSetCreateRequestDataRelationshipsRequired(obj.Relationships); err != nil {
		return err
	}
	return nil
}

// AssertAppScreenshotSetCreateRequestDataConstraints checks if the values respects the defined constraints
func AssertAppScreenshotSetCreateRequestDataConstraints(obj AppScreenshotSetCreateRequestData) error {
	return nil
}