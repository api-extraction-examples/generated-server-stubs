/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type UpdateTeamRequest struct {

	Data TeamRequest `json:"data,omitempty"`
}

// AssertUpdateTeamRequestRequired checks if the required fields are not zero-ed
func AssertUpdateTeamRequestRequired(obj UpdateTeamRequest) error {
	if err := AssertTeamRequestRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertUpdateTeamRequestConstraints checks if the values respects the defined constraints
func AssertUpdateTeamRequestConstraints(obj UpdateTeamRequest) error {
	return nil
}