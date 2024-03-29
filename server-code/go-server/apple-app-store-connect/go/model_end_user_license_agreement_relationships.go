/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type EndUserLicenseAgreementRelationships struct {

	App AppEncryptionDeclarationRelationshipsApp `json:"app,omitempty"`

	Territories AppRelationshipsAvailableTerritories `json:"territories,omitempty"`
}

// AssertEndUserLicenseAgreementRelationshipsRequired checks if the required fields are not zero-ed
func AssertEndUserLicenseAgreementRelationshipsRequired(obj EndUserLicenseAgreementRelationships) error {
	if err := AssertAppEncryptionDeclarationRelationshipsAppRequired(obj.App); err != nil {
		return err
	}
	if err := AssertAppRelationshipsAvailableTerritoriesRequired(obj.Territories); err != nil {
		return err
	}
	return nil
}

// AssertEndUserLicenseAgreementRelationshipsConstraints checks if the values respects the defined constraints
func AssertEndUserLicenseAgreementRelationshipsConstraints(obj EndUserLicenseAgreementRelationships) error {
	return nil
}
