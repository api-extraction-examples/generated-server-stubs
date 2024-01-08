/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type GetTeamsForUser200Response struct {

	Data []TeamCompact `json:"data,omitempty"`
}

// AssertGetTeamsForUser200ResponseRequired checks if the required fields are not zero-ed
func AssertGetTeamsForUser200ResponseRequired(obj GetTeamsForUser200Response) error {
	for _, el := range obj.Data {
		if err := AssertTeamCompactRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertGetTeamsForUser200ResponseConstraints checks if the values respects the defined constraints
func AssertGetTeamsForUser200ResponseConstraints(obj GetTeamsForUser200Response) error {
	return nil
}