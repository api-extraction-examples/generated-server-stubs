/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPreviewRelationshipsAppPreviewSet struct {

	Data AppPreviewRelationshipsAppPreviewSetData `json:"data,omitempty"`

	Links AppRelationshipsAppInfosLinks `json:"links,omitempty"`
}

// AssertAppPreviewRelationshipsAppPreviewSetRequired checks if the required fields are not zero-ed
func AssertAppPreviewRelationshipsAppPreviewSetRequired(obj AppPreviewRelationshipsAppPreviewSet) error {
	if err := AssertAppPreviewRelationshipsAppPreviewSetDataRequired(obj.Data); err != nil {
		return err
	}
	if err := AssertAppRelationshipsAppInfosLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertAppPreviewRelationshipsAppPreviewSetConstraints checks if the values respects the defined constraints
func AssertAppPreviewRelationshipsAppPreviewSetConstraints(obj AppPreviewRelationshipsAppPreviewSet) error {
	return nil
}
