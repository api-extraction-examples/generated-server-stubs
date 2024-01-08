/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type IdfaDeclarationAttributes struct {

	AttributesActionWithPreviousAd bool `json:"attributesActionWithPreviousAd,omitempty"`

	AttributesAppInstallationToPreviousAd bool `json:"attributesAppInstallationToPreviousAd,omitempty"`

	HonorsLimitedAdTracking bool `json:"honorsLimitedAdTracking,omitempty"`

	ServesAds bool `json:"servesAds,omitempty"`
}

// AssertIdfaDeclarationAttributesRequired checks if the required fields are not zero-ed
func AssertIdfaDeclarationAttributesRequired(obj IdfaDeclarationAttributes) error {
	return nil
}

// AssertIdfaDeclarationAttributesConstraints checks if the values respects the defined constraints
func AssertIdfaDeclarationAttributesConstraints(obj IdfaDeclarationAttributes) error {
	return nil
}