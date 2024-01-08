/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type TaskDuplicateRequest struct {

	// The fields that will be duplicated to the new task.
	Include string `json:"include,omitempty"`

	// The name of the new task.
	Name string `json:"name,omitempty"`
}
