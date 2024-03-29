/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BuildRelationshipsAppEncryptionDeclaration struct {

	Data BuildRelationshipsAppEncryptionDeclarationData `json:"data,omitempty"`

	Links AppRelationshipsAppInfosLinks `json:"links,omitempty"`
}

// AssertBuildRelationshipsAppEncryptionDeclarationRequired checks if the required fields are not zero-ed
func AssertBuildRelationshipsAppEncryptionDeclarationRequired(obj BuildRelationshipsAppEncryptionDeclaration) error {
	if err := AssertBuildRelationshipsAppEncryptionDeclarationDataRequired(obj.Data); err != nil {
		return err
	}
	if err := AssertAppRelationshipsAppInfosLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertBuildRelationshipsAppEncryptionDeclarationConstraints checks if the values respects the defined constraints
func AssertBuildRelationshipsAppEncryptionDeclarationConstraints(obj BuildRelationshipsAppEncryptionDeclaration) error {
	return nil
}
