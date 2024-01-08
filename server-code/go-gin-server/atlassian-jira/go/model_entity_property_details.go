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

type EntityPropertyDetails struct {

	// The entity property ID.
	EntityId float32 `json:"entityId"`

	// The entity property key.
	Key string `json:"key"`

	// The new value of the entity property.
	Value string `json:"value"`
}