/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// BatchRequest - A request object for use in a batch request.
type BatchRequest struct {

	Actions []BatchRequestAction `json:"actions,omitempty"`
}

// AssertBatchRequestRequired checks if the required fields are not zero-ed
func AssertBatchRequestRequired(obj BatchRequest) error {
	for _, el := range obj.Actions {
		if err := AssertBatchRequestActionRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertBatchRequestConstraints checks if the values respects the defined constraints
func AssertBatchRequestConstraints(obj BatchRequest) error {
	return nil
}
