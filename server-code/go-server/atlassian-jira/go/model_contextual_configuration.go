/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// ContextualConfiguration - Details of the contextual configuration for a custom field.
type ContextualConfiguration struct {

	// The field configuration.
	Configuration *interface{} `json:"configuration,omitempty"`

	// The ID of the field context the configuration is associated with.
	FieldContextId string `json:"fieldContextId"`

	// The ID of the configuration.
	Id string `json:"id"`

	// The field value schema.
	Schema *interface{} `json:"schema,omitempty"`
}

// AssertContextualConfigurationRequired checks if the required fields are not zero-ed
func AssertContextualConfigurationRequired(obj ContextualConfiguration) error {
	elements := map[string]interface{}{
		"fieldContextId": obj.FieldContextId,
		"id": obj.Id,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertContextualConfigurationConstraints checks if the values respects the defined constraints
func AssertContextualConfigurationConstraints(obj ContextualConfiguration) error {
	return nil
}
