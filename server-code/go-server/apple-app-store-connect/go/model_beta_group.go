/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BetaGroup struct {

	Attributes BetaGroupAttributes `json:"attributes,omitempty"`

	Id string `json:"id"`

	Links ResourceLinks `json:"links"`

	Relationships BetaGroupRelationships `json:"relationships,omitempty"`

	Type string `json:"type"`
}

// AssertBetaGroupRequired checks if the required fields are not zero-ed
func AssertBetaGroupRequired(obj BetaGroup) error {
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

	if err := AssertBetaGroupAttributesRequired(obj.Attributes); err != nil {
		return err
	}
	if err := AssertResourceLinksRequired(obj.Links); err != nil {
		return err
	}
	if err := AssertBetaGroupRelationshipsRequired(obj.Relationships); err != nil {
		return err
	}
	return nil
}

// AssertBetaGroupConstraints checks if the values respects the defined constraints
func AssertBetaGroupConstraints(obj BetaGroup) error {
	return nil
}
