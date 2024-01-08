/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type IdfaDeclarationCreateRequestDataAttributes struct {

	AttributesActionWithPreviousAd bool `json:"attributesActionWithPreviousAd"`

	AttributesAppInstallationToPreviousAd bool `json:"attributesAppInstallationToPreviousAd"`

	HonorsLimitedAdTracking bool `json:"honorsLimitedAdTracking"`

	ServesAds bool `json:"servesAds"`
}

// AssertIdfaDeclarationCreateRequestDataAttributesRequired checks if the required fields are not zero-ed
func AssertIdfaDeclarationCreateRequestDataAttributesRequired(obj IdfaDeclarationCreateRequestDataAttributes) error {
	elements := map[string]interface{}{
		"attributesActionWithPreviousAd": obj.AttributesActionWithPreviousAd,
		"attributesAppInstallationToPreviousAd": obj.AttributesAppInstallationToPreviousAd,
		"honorsLimitedAdTracking": obj.HonorsLimitedAdTracking,
		"servesAds": obj.ServesAds,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertIdfaDeclarationCreateRequestDataAttributesConstraints checks if the values respects the defined constraints
func AssertIdfaDeclarationCreateRequestDataAttributesConstraints(obj IdfaDeclarationCreateRequestDataAttributes) error {
	return nil
}
