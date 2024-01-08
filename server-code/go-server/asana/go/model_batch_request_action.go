/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// BatchRequestAction - An action object for use in a batch request.
type BatchRequestAction struct {

	// For `GET` requests, this should be a map of query parameters you would have normally passed in the URL. Options and pagination are not accepted here; put them in `options` instead. For `POST`, `PATCH`, and `PUT` methods, this should be the content you would have normally put in the data field of the body.
	Data map[string]interface{} `json:"data,omitempty"`

	// The HTTP method you wish to emulate for the action.
	Method string `json:"method"`

	Options BatchRequestActionOptions `json:"options,omitempty"`

	// The path of the desired endpoint relative to the API’s base URL. Query parameters are not accepted here; put them in `data` instead.
	RelativePath string `json:"relative_path"`
}

// AssertBatchRequestActionRequired checks if the required fields are not zero-ed
func AssertBatchRequestActionRequired(obj BatchRequestAction) error {
	elements := map[string]interface{}{
		"method": obj.Method,
		"relative_path": obj.RelativePath,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertBatchRequestActionOptionsRequired(obj.Options); err != nil {
		return err
	}
	return nil
}

// AssertBatchRequestActionConstraints checks if the values respects the defined constraints
func AssertBatchRequestActionConstraints(obj BatchRequestAction) error {
	return nil
}
