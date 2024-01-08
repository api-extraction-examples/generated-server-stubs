/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type EventResponseParent struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// The name of the object.
	Name string `json:"name,omitempty"`
}

// AssertEventResponseParentRequired checks if the required fields are not zero-ed
func AssertEventResponseParentRequired(obj EventResponseParent) error {
	return nil
}

// AssertEventResponseParentConstraints checks if the values respects the defined constraints
func AssertEventResponseParentConstraints(obj EventResponseParent) error {
	return nil
}
