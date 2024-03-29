/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AddCustomFieldSettingForPortfolio200Response struct {

	Data CustomFieldSettingResponse `json:"data,omitempty"`
}

// AssertAddCustomFieldSettingForPortfolio200ResponseRequired checks if the required fields are not zero-ed
func AssertAddCustomFieldSettingForPortfolio200ResponseRequired(obj AddCustomFieldSettingForPortfolio200Response) error {
	if err := AssertCustomFieldSettingResponseRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAddCustomFieldSettingForPortfolio200ResponseConstraints checks if the values respects the defined constraints
func AssertAddCustomFieldSettingForPortfolio200ResponseConstraints(obj AddCustomFieldSettingForPortfolio200Response) error {
	return nil
}
