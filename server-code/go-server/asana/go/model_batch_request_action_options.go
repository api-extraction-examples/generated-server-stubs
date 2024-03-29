/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// BatchRequestActionOptions - Pagination (`limit` and `offset`) and output options (`fields` or `expand`) for the action. “Pretty” JSON output is not an available option on individual actions; if you want pretty output, specify that option on the parent request.
type BatchRequestActionOptions struct {

	// The fields to retrieve in the request.
	Fields []string `json:"fields,omitempty"`

	// Pagination limit for the request.
	Limit int32 `json:"limit,omitempty"`

	// Pagination offset for the request.
	Offset int32 `json:"offset,omitempty"`
}

// AssertBatchRequestActionOptionsRequired checks if the required fields are not zero-ed
func AssertBatchRequestActionOptionsRequired(obj BatchRequestActionOptions) error {
	return nil
}

// AssertBatchRequestActionOptionsConstraints checks if the values respects the defined constraints
func AssertBatchRequestActionOptionsConstraints(obj BatchRequestActionOptions) error {
	return nil
}
