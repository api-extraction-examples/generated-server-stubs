/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BetaBuildLocalizationCreateRequestDataAttributes struct {

	Locale string `json:"locale"`

	WhatsNew string `json:"whatsNew,omitempty"`
}

// AssertBetaBuildLocalizationCreateRequestDataAttributesRequired checks if the required fields are not zero-ed
func AssertBetaBuildLocalizationCreateRequestDataAttributesRequired(obj BetaBuildLocalizationCreateRequestDataAttributes) error {
	elements := map[string]interface{}{
		"locale": obj.Locale,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertBetaBuildLocalizationCreateRequestDataAttributesConstraints checks if the values respects the defined constraints
func AssertBetaBuildLocalizationCreateRequestDataAttributesConstraints(obj BetaBuildLocalizationCreateRequestDataAttributes) error {
	return nil
}
