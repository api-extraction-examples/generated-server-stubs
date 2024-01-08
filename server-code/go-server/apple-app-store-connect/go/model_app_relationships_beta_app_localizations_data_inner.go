/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppRelationshipsBetaAppLocalizationsDataInner struct {

	Id string `json:"id"`

	Type string `json:"type"`
}

// AssertAppRelationshipsBetaAppLocalizationsDataInnerRequired checks if the required fields are not zero-ed
func AssertAppRelationshipsBetaAppLocalizationsDataInnerRequired(obj AppRelationshipsBetaAppLocalizationsDataInner) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertAppRelationshipsBetaAppLocalizationsDataInnerConstraints checks if the values respects the defined constraints
func AssertAppRelationshipsBetaAppLocalizationsDataInnerConstraints(obj AppRelationshipsBetaAppLocalizationsDataInner) error {
	return nil
}
