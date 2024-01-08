/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BundleIdRelationships struct {

	App AppEncryptionDeclarationRelationshipsApp `json:"app,omitempty"`

	BundleIdCapabilities BundleIdRelationshipsBundleIdCapabilities `json:"bundleIdCapabilities,omitempty"`

	Profiles BundleIdRelationshipsProfiles `json:"profiles,omitempty"`
}

// AssertBundleIdRelationshipsRequired checks if the required fields are not zero-ed
func AssertBundleIdRelationshipsRequired(obj BundleIdRelationships) error {
	if err := AssertAppEncryptionDeclarationRelationshipsAppRequired(obj.App); err != nil {
		return err
	}
	if err := AssertBundleIdRelationshipsBundleIdCapabilitiesRequired(obj.BundleIdCapabilities); err != nil {
		return err
	}
	if err := AssertBundleIdRelationshipsProfilesRequired(obj.Profiles); err != nil {
		return err
	}
	return nil
}

// AssertBundleIdRelationshipsConstraints checks if the values respects the defined constraints
func AssertBundleIdRelationshipsConstraints(obj BundleIdRelationships) error {
	return nil
}
