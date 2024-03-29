/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPricePoint struct {

	Attributes AppPricePointAttributes `json:"attributes,omitempty"`

	Id string `json:"id"`

	Links ResourceLinks `json:"links"`

	Relationships AppPricePointRelationships `json:"relationships,omitempty"`

	Type string `json:"type"`
}

// AssertAppPricePointRequired checks if the required fields are not zero-ed
func AssertAppPricePointRequired(obj AppPricePoint) error {
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

	if err := AssertAppPricePointAttributesRequired(obj.Attributes); err != nil {
		return err
	}
	if err := AssertResourceLinksRequired(obj.Links); err != nil {
		return err
	}
	if err := AssertAppPricePointRelationshipsRequired(obj.Relationships); err != nil {
		return err
	}
	return nil
}

// AssertAppPricePointConstraints checks if the values respects the defined constraints
func AssertAppPricePointConstraints(obj AppPricePoint) error {
	return nil
}
