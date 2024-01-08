/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type AncestorSummary struct {

	AncestorType string `json:"ancestor_type"`

	Id string `json:"id"`

	Images []Image `json:"images"`

	Titles AncestorTitles `json:"titles"`

	Type string `json:"type"`
}