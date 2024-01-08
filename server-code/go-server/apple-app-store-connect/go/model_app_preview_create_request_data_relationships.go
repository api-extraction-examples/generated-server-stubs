/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPreviewCreateRequestDataRelationships struct {

	AppPreviewSet AppPreviewCreateRequestDataRelationshipsAppPreviewSet `json:"appPreviewSet"`
}

// AssertAppPreviewCreateRequestDataRelationshipsRequired checks if the required fields are not zero-ed
func AssertAppPreviewCreateRequestDataRelationshipsRequired(obj AppPreviewCreateRequestDataRelationships) error {
	elements := map[string]interface{}{
		"appPreviewSet": obj.AppPreviewSet,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppPreviewCreateRequestDataRelationshipsAppPreviewSetRequired(obj.AppPreviewSet); err != nil {
		return err
	}
	return nil
}

// AssertAppPreviewCreateRequestDataRelationshipsConstraints checks if the values respects the defined constraints
func AssertAppPreviewCreateRequestDataRelationshipsConstraints(obj AppPreviewCreateRequestDataRelationships) error {
	return nil
}