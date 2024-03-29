/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CreateStatusForObjectRequest struct {

	Data StatusUpdateRequest `json:"data,omitempty"`
}

// AssertCreateStatusForObjectRequestRequired checks if the required fields are not zero-ed
func AssertCreateStatusForObjectRequestRequired(obj CreateStatusForObjectRequest) error {
	if err := AssertStatusUpdateRequestRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertCreateStatusForObjectRequestConstraints checks if the values respects the defined constraints
func AssertCreateStatusForObjectRequestConstraints(obj CreateStatusForObjectRequest) error {
	return nil
}
