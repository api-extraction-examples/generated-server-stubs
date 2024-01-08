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

// JqlQueryField - A field used in a JQL query. See [Advanced searching - fields reference](https://confluence.atlassian.com/x/dAiiLQ) for more information about fields in JQL queries.
type JqlQueryField struct {

	// The encoded name of the field, which can be used directly in a JQL query.
	EncodedName string `json:"encodedName,omitempty"`

	// The name of the field.
	Name string `json:"name"`

	// When the field refers to a value in an entity property, details of the entity property value.
	Property []JqlQueryFieldEntityProperty `json:"property,omitempty"`
}
