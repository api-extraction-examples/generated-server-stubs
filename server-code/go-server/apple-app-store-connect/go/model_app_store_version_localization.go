/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreVersionLocalization struct {

	Attributes AppStoreVersionLocalizationAttributes `json:"attributes,omitempty"`

	Id string `json:"id"`

	Links ResourceLinks `json:"links"`

	Relationships AppStoreVersionLocalizationRelationships `json:"relationships,omitempty"`

	Type string `json:"type"`
}

// AssertAppStoreVersionLocalizationRequired checks if the required fields are not zero-ed
func AssertAppStoreVersionLocalizationRequired(obj AppStoreVersionLocalization) error {
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

	if err := AssertAppStoreVersionLocalizationAttributesRequired(obj.Attributes); err != nil {
		return err
	}
	if err := AssertResourceLinksRequired(obj.Links); err != nil {
		return err
	}
	if err := AssertAppStoreVersionLocalizationRelationshipsRequired(obj.Relationships); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreVersionLocalizationConstraints checks if the values respects the defined constraints
func AssertAppStoreVersionLocalizationConstraints(obj AppStoreVersionLocalization) error {
	return nil
}