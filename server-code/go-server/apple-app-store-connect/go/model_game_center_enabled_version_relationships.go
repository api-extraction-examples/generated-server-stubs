/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type GameCenterEnabledVersionRelationships struct {

	App AppEncryptionDeclarationRelationshipsApp `json:"app,omitempty"`

	CompatibleVersions AppRelationshipsGameCenterEnabledVersions `json:"compatibleVersions,omitempty"`
}

// AssertGameCenterEnabledVersionRelationshipsRequired checks if the required fields are not zero-ed
func AssertGameCenterEnabledVersionRelationshipsRequired(obj GameCenterEnabledVersionRelationships) error {
	if err := AssertAppEncryptionDeclarationRelationshipsAppRequired(obj.App); err != nil {
		return err
	}
	if err := AssertAppRelationshipsGameCenterEnabledVersionsRequired(obj.CompatibleVersions); err != nil {
		return err
	}
	return nil
}

// AssertGameCenterEnabledVersionRelationshipsConstraints checks if the values respects the defined constraints
func AssertGameCenterEnabledVersionRelationshipsConstraints(obj GameCenterEnabledVersionRelationships) error {
	return nil
}
