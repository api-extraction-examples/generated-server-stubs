/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppRelationships struct {

	AppInfos AppRelationshipsAppInfos `json:"appInfos,omitempty"`

	AppStoreVersions AppRelationshipsAppStoreVersions `json:"appStoreVersions,omitempty"`

	AvailableTerritories AppRelationshipsAvailableTerritories `json:"availableTerritories,omitempty"`

	BetaAppLocalizations AppRelationshipsBetaAppLocalizations `json:"betaAppLocalizations,omitempty"`

	BetaAppReviewDetail AppRelationshipsBetaAppReviewDetail `json:"betaAppReviewDetail,omitempty"`

	BetaGroups AppRelationshipsBetaGroups `json:"betaGroups,omitempty"`

	BetaLicenseAgreement AppRelationshipsBetaLicenseAgreement `json:"betaLicenseAgreement,omitempty"`

	Builds AppRelationshipsBuilds `json:"builds,omitempty"`

	EndUserLicenseAgreement AppRelationshipsEndUserLicenseAgreement `json:"endUserLicenseAgreement,omitempty"`

	GameCenterEnabledVersions AppRelationshipsGameCenterEnabledVersions `json:"gameCenterEnabledVersions,omitempty"`

	InAppPurchases AppRelationshipsInAppPurchases `json:"inAppPurchases,omitempty"`

	PreOrder AppRelationshipsPreOrder `json:"preOrder,omitempty"`

	PreReleaseVersions AppRelationshipsPreReleaseVersions `json:"preReleaseVersions,omitempty"`

	Prices AppRelationshipsPrices `json:"prices,omitempty"`
}

// AssertAppRelationshipsRequired checks if the required fields are not zero-ed
func AssertAppRelationshipsRequired(obj AppRelationships) error {
	if err := AssertAppRelationshipsAppInfosRequired(obj.AppInfos); err != nil {
		return err
	}
	if err := AssertAppRelationshipsAppStoreVersionsRequired(obj.AppStoreVersions); err != nil {
		return err
	}
	if err := AssertAppRelationshipsAvailableTerritoriesRequired(obj.AvailableTerritories); err != nil {
		return err
	}
	if err := AssertAppRelationshipsBetaAppLocalizationsRequired(obj.BetaAppLocalizations); err != nil {
		return err
	}
	if err := AssertAppRelationshipsBetaAppReviewDetailRequired(obj.BetaAppReviewDetail); err != nil {
		return err
	}
	if err := AssertAppRelationshipsBetaGroupsRequired(obj.BetaGroups); err != nil {
		return err
	}
	if err := AssertAppRelationshipsBetaLicenseAgreementRequired(obj.BetaLicenseAgreement); err != nil {
		return err
	}
	if err := AssertAppRelationshipsBuildsRequired(obj.Builds); err != nil {
		return err
	}
	if err := AssertAppRelationshipsEndUserLicenseAgreementRequired(obj.EndUserLicenseAgreement); err != nil {
		return err
	}
	if err := AssertAppRelationshipsGameCenterEnabledVersionsRequired(obj.GameCenterEnabledVersions); err != nil {
		return err
	}
	if err := AssertAppRelationshipsInAppPurchasesRequired(obj.InAppPurchases); err != nil {
		return err
	}
	if err := AssertAppRelationshipsPreOrderRequired(obj.PreOrder); err != nil {
		return err
	}
	if err := AssertAppRelationshipsPreReleaseVersionsRequired(obj.PreReleaseVersions); err != nil {
		return err
	}
	if err := AssertAppRelationshipsPricesRequired(obj.Prices); err != nil {
		return err
	}
	return nil
}

// AssertAppRelationshipsConstraints checks if the values respects the defined constraints
func AssertAppRelationshipsConstraints(obj AppRelationships) error {
	return nil
}
