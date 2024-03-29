/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CreateEnumOptionForCustomFieldRequest struct {

	Data EnumOptionRequest `json:"data,omitempty"`
}

// AssertCreateEnumOptionForCustomFieldRequestRequired checks if the required fields are not zero-ed
func AssertCreateEnumOptionForCustomFieldRequestRequired(obj CreateEnumOptionForCustomFieldRequest) error {
	if err := AssertEnumOptionRequestRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertCreateEnumOptionForCustomFieldRequestConstraints checks if the values respects the defined constraints
func AssertCreateEnumOptionForCustomFieldRequestConstraints(obj CreateEnumOptionForCustomFieldRequest) error {
	return nil
}
