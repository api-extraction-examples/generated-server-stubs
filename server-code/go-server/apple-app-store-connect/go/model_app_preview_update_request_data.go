/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPreviewUpdateRequestData struct {

	Attributes AppPreviewUpdateRequestDataAttributes `json:"attributes,omitempty"`

	Id string `json:"id"`

	Type string `json:"type"`
}

// AssertAppPreviewUpdateRequestDataRequired checks if the required fields are not zero-ed
func AssertAppPreviewUpdateRequestDataRequired(obj AppPreviewUpdateRequestData) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppPreviewUpdateRequestDataAttributesRequired(obj.Attributes); err != nil {
		return err
	}
	return nil
}

// AssertAppPreviewUpdateRequestDataConstraints checks if the values respects the defined constraints
func AssertAppPreviewUpdateRequestDataConstraints(obj AppPreviewUpdateRequestData) error {
	return nil
}