/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BuildRelationships struct {

	App AppEncryptionDeclarationRelationshipsApp `json:"app,omitempty"`

	AppEncryptionDeclaration BuildRelationshipsAppEncryptionDeclaration `json:"appEncryptionDeclaration,omitempty"`

	AppStoreVersion AppStoreReviewDetailRelationshipsAppStoreVersion `json:"appStoreVersion,omitempty"`

	BetaAppReviewSubmission BuildRelationshipsBetaAppReviewSubmission `json:"betaAppReviewSubmission,omitempty"`

	BetaBuildLocalizations BuildRelationshipsBetaBuildLocalizations `json:"betaBuildLocalizations,omitempty"`

	BuildBetaDetail BuildRelationshipsBuildBetaDetail `json:"buildBetaDetail,omitempty"`

	Icons BuildRelationshipsIcons `json:"icons,omitempty"`

	IndividualTesters BetaGroupRelationshipsBetaTesters `json:"individualTesters,omitempty"`

	PreReleaseVersion BuildRelationshipsPreReleaseVersion `json:"preReleaseVersion,omitempty"`
}

// AssertBuildRelationshipsRequired checks if the required fields are not zero-ed
func AssertBuildRelationshipsRequired(obj BuildRelationships) error {
	if err := AssertAppEncryptionDeclarationRelationshipsAppRequired(obj.App); err != nil {
		return err
	}
	if err := AssertBuildRelationshipsAppEncryptionDeclarationRequired(obj.AppEncryptionDeclaration); err != nil {
		return err
	}
	if err := AssertAppStoreReviewDetailRelationshipsAppStoreVersionRequired(obj.AppStoreVersion); err != nil {
		return err
	}
	if err := AssertBuildRelationshipsBetaAppReviewSubmissionRequired(obj.BetaAppReviewSubmission); err != nil {
		return err
	}
	if err := AssertBuildRelationshipsBetaBuildLocalizationsRequired(obj.BetaBuildLocalizations); err != nil {
		return err
	}
	if err := AssertBuildRelationshipsBuildBetaDetailRequired(obj.BuildBetaDetail); err != nil {
		return err
	}
	if err := AssertBuildRelationshipsIconsRequired(obj.Icons); err != nil {
		return err
	}
	if err := AssertBetaGroupRelationshipsBetaTestersRequired(obj.IndividualTesters); err != nil {
		return err
	}
	if err := AssertBuildRelationshipsPreReleaseVersionRequired(obj.PreReleaseVersion); err != nil {
		return err
	}
	return nil
}

// AssertBuildRelationshipsConstraints checks if the values respects the defined constraints
func AssertBuildRelationshipsConstraints(obj BuildRelationships) error {
	return nil
}
