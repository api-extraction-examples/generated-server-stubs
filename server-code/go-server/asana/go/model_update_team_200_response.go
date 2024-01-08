/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type UpdateTeam200Response struct {

	Data TeamResponse `json:"data,omitempty"`
}

// AssertUpdateTeam200ResponseRequired checks if the required fields are not zero-ed
func AssertUpdateTeam200ResponseRequired(obj UpdateTeam200Response) error {
	if err := AssertTeamResponseRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertUpdateTeam200ResponseConstraints checks if the values respects the defined constraints
func AssertUpdateTeam200ResponseConstraints(obj UpdateTeam200Response) error {
	return nil
}