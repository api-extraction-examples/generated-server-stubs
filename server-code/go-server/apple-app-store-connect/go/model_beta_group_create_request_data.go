/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BetaGroupCreateRequestData struct {

	Attributes BetaGroupCreateRequestDataAttributes `json:"attributes"`

	Relationships BetaGroupCreateRequestDataRelationships `json:"relationships"`

	Type string `json:"type"`
}

// AssertBetaGroupCreateRequestDataRequired checks if the required fields are not zero-ed
func AssertBetaGroupCreateRequestDataRequired(obj BetaGroupCreateRequestData) error {
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

	if err := AssertBetaGroupCreateRequestDataAttributesRequired(obj.Attributes); err != nil {
		return err
	}
	if err := AssertBetaGroupCreateRequestDataRelationshipsRequired(obj.Relationships); err != nil {
		return err
	}
	return nil
}

// AssertBetaGroupCreateRequestDataConstraints checks if the values respects the defined constraints
func AssertBetaGroupCreateRequestDataConstraints(obj BetaGroupCreateRequestData) error {
	return nil
}
