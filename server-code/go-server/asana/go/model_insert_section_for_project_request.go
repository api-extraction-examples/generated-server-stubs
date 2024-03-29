/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type InsertSectionForProjectRequest struct {

	Data ProjectSectionInsertRequest `json:"data,omitempty"`
}

// AssertInsertSectionForProjectRequestRequired checks if the required fields are not zero-ed
func AssertInsertSectionForProjectRequestRequired(obj InsertSectionForProjectRequest) error {
	if err := AssertProjectSectionInsertRequestRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertInsertSectionForProjectRequestConstraints checks if the values respects the defined constraints
func AssertInsertSectionForProjectRequestConstraints(obj InsertSectionForProjectRequest) error {
	return nil
}
