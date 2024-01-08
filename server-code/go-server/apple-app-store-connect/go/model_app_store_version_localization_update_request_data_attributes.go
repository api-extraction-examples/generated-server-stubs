/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreVersionLocalizationUpdateRequestDataAttributes struct {

	Description string `json:"description,omitempty"`

	Keywords string `json:"keywords,omitempty"`

	MarketingUrl string `json:"marketingUrl,omitempty"`

	PromotionalText string `json:"promotionalText,omitempty"`

	SupportUrl string `json:"supportUrl,omitempty"`

	WhatsNew string `json:"whatsNew,omitempty"`
}

// AssertAppStoreVersionLocalizationUpdateRequestDataAttributesRequired checks if the required fields are not zero-ed
func AssertAppStoreVersionLocalizationUpdateRequestDataAttributesRequired(obj AppStoreVersionLocalizationUpdateRequestDataAttributes) error {
	return nil
}

// AssertAppStoreVersionLocalizationUpdateRequestDataAttributesConstraints checks if the values respects the defined constraints
func AssertAppStoreVersionLocalizationUpdateRequestDataAttributesConstraints(obj AppStoreVersionLocalizationUpdateRequestDataAttributes) error {
	return nil
}
