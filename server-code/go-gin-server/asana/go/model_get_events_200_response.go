/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// GetEvents200Response - The full record for all events that have occurred since the sync token was created.
type GetEvents200Response struct {

	Data []EventResponse `json:"data,omitempty"`

	// Indicates whether there are more events to pull.
	HasMore bool `json:"has_more,omitempty"`

	// A sync token to be used with the next call to the /events endpoint.
	Sync string `json:"sync,omitempty"`
}
