/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type GetWorkspace200Response struct {

	Data WorkspaceResponse `json:"data,omitempty"`
}

// AssertGetWorkspace200ResponseRequired checks if the required fields are not zero-ed
func AssertGetWorkspace200ResponseRequired(obj GetWorkspace200Response) error {
	if err := AssertWorkspaceResponseRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertGetWorkspace200ResponseConstraints checks if the values respects the defined constraints
func AssertGetWorkspace200ResponseConstraints(obj GetWorkspace200Response) error {
	return nil
}
