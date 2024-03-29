/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppEncryptionDeclarationRelationships struct {

	App AppEncryptionDeclarationRelationshipsApp `json:"app,omitempty"`
}

// AssertAppEncryptionDeclarationRelationshipsRequired checks if the required fields are not zero-ed
func AssertAppEncryptionDeclarationRelationshipsRequired(obj AppEncryptionDeclarationRelationships) error {
	if err := AssertAppEncryptionDeclarationRelationshipsAppRequired(obj.App); err != nil {
		return err
	}
	return nil
}

// AssertAppEncryptionDeclarationRelationshipsConstraints checks if the values respects the defined constraints
func AssertAppEncryptionDeclarationRelationshipsConstraints(obj AppEncryptionDeclarationRelationships) error {
	return nil
}
