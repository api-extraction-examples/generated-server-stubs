/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppResponseIncludedInner struct {

	Attributes PerfPowerMetricAttributes `json:"attributes,omitempty"`

	Id string `json:"id"`

	Links ResourceLinks `json:"links"`

	Relationships GameCenterEnabledVersionRelationships `json:"relationships,omitempty"`

	Type string `json:"type"`
}

// AssertAppResponseIncludedInnerRequired checks if the required fields are not zero-ed
func AssertAppResponseIncludedInnerRequired(obj AppResponseIncludedInner) error {
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

	if err := AssertPerfPowerMetricAttributesRequired(obj.Attributes); err != nil {
		return err
	}
	if err := AssertResourceLinksRequired(obj.Links); err != nil {
		return err
	}
	if err := AssertGameCenterEnabledVersionRelationshipsRequired(obj.Relationships); err != nil {
		return err
	}
	return nil
}

// AssertAppResponseIncludedInnerConstraints checks if the values respects the defined constraints
func AssertAppResponseIncludedInnerConstraints(obj AppResponseIncludedInner) error {
	return nil
}
