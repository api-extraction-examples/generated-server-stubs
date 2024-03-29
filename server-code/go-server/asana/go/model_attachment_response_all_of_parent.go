/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AttachmentResponseAllOfParent struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// The name of the task.
	Name string `json:"name,omitempty"`

	// The resource subtype of the parent resource that the filter applies to.
	ResourceSubtype *string `json:"resource_subtype,omitempty"`
}

// AssertAttachmentResponseAllOfParentRequired checks if the required fields are not zero-ed
func AssertAttachmentResponseAllOfParentRequired(obj AttachmentResponseAllOfParent) error {
	return nil
}

// AssertAttachmentResponseAllOfParentConstraints checks if the values respects the defined constraints
func AssertAttachmentResponseAllOfParentConstraints(obj AttachmentResponseAllOfParent) error {
	return nil
}
