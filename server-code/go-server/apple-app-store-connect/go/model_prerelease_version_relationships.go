/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PrereleaseVersionRelationships struct {

	App AppEncryptionDeclarationRelationshipsApp `json:"app,omitempty"`

	Builds AppRelationshipsBuilds `json:"builds,omitempty"`
}

// AssertPrereleaseVersionRelationshipsRequired checks if the required fields are not zero-ed
func AssertPrereleaseVersionRelationshipsRequired(obj PrereleaseVersionRelationships) error {
	if err := AssertAppEncryptionDeclarationRelationshipsAppRequired(obj.App); err != nil {
		return err
	}
	if err := AssertAppRelationshipsBuildsRequired(obj.Builds); err != nil {
		return err
	}
	return nil
}

// AssertPrereleaseVersionRelationshipsConstraints checks if the values respects the defined constraints
func AssertPrereleaseVersionRelationshipsConstraints(obj PrereleaseVersionRelationships) error {
	return nil
}
