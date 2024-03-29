/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPreviewRelationships struct {

	AppPreviewSet AppPreviewRelationshipsAppPreviewSet `json:"appPreviewSet,omitempty"`
}

// AssertAppPreviewRelationshipsRequired checks if the required fields are not zero-ed
func AssertAppPreviewRelationshipsRequired(obj AppPreviewRelationships) error {
	if err := AssertAppPreviewRelationshipsAppPreviewSetRequired(obj.AppPreviewSet); err != nil {
		return err
	}
	return nil
}

// AssertAppPreviewRelationshipsConstraints checks if the values respects the defined constraints
func AssertAppPreviewRelationshipsConstraints(obj AppPreviewRelationships) error {
	return nil
}
