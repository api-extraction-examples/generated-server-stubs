/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPreview struct {

	Attributes AppPreviewAttributes `json:"attributes,omitempty"`

	Id string `json:"id"`

	Links ResourceLinks `json:"links"`

	Relationships AppPreviewRelationships `json:"relationships,omitempty"`

	Type string `json:"type"`
}

// AssertAppPreviewRequired checks if the required fields are not zero-ed
func AssertAppPreviewRequired(obj AppPreview) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"links": obj.Links,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppPreviewAttributesRequired(obj.Attributes); err != nil {
		return err
	}
	if err := AssertResourceLinksRequired(obj.Links); err != nil {
		return err
	}
	if err := AssertAppPreviewRelationshipsRequired(obj.Relationships); err != nil {
		return err
	}
	return nil
}

// AssertAppPreviewConstraints checks if the values respects the defined constraints
func AssertAppPreviewConstraints(obj AppPreview) error {
	return nil
}
