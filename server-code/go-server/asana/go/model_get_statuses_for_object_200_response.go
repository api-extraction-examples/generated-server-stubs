/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type GetStatusesForObject200Response struct {

	Data []StatusUpdateCompact `json:"data,omitempty"`
}

// AssertGetStatusesForObject200ResponseRequired checks if the required fields are not zero-ed
func AssertGetStatusesForObject200ResponseRequired(obj GetStatusesForObject200Response) error {
	for _, el := range obj.Data {
		if err := AssertStatusUpdateCompactRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertGetStatusesForObject200ResponseConstraints checks if the values respects the defined constraints
func AssertGetStatusesForObject200ResponseConstraints(obj GetStatusesForObject200Response) error {
	return nil
}
