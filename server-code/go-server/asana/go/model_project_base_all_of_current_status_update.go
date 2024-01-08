/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// ProjectBaseAllOfCurrentStatusUpdate - The latest `status_update` posted to this project.
type ProjectBaseAllOfCurrentStatusUpdate struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The `resource_subtype`s for `status` objects represent the type of their parent.
	ResourceSubtype string `json:"resource_subtype,omitempty"`

	// The title of the status update.
	Title string `json:"title,omitempty"`
}

// AssertProjectBaseAllOfCurrentStatusUpdateRequired checks if the required fields are not zero-ed
func AssertProjectBaseAllOfCurrentStatusUpdateRequired(obj ProjectBaseAllOfCurrentStatusUpdate) error {
	return nil
}

// AssertProjectBaseAllOfCurrentStatusUpdateConstraints checks if the values respects the defined constraints
func AssertProjectBaseAllOfCurrentStatusUpdateConstraints(obj ProjectBaseAllOfCurrentStatusUpdate) error {
	return nil
}