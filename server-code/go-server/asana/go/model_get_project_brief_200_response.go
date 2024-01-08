/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type GetProjectBrief200Response struct {

	Data ProjectBriefResponse `json:"data,omitempty"`
}

// AssertGetProjectBrief200ResponseRequired checks if the required fields are not zero-ed
func AssertGetProjectBrief200ResponseRequired(obj GetProjectBrief200Response) error {
	if err := AssertProjectBriefResponseRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertGetProjectBrief200ResponseConstraints checks if the values respects the defined constraints
func AssertGetProjectBrief200ResponseConstraints(obj GetProjectBrief200Response) error {
	return nil
}