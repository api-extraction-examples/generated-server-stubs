/*
 * Bills API
 *
 * API to get and search for information regarding Bills, their stages, associated amendments and publications.
 *
 * API version: v1
 * Contact: softwareengineering@parliament.uk
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type House string

// List of House
const (
	ALL House = "All"
	COMMONS House = "Commons"
	LORDS House = "Lords"
	UNASSIGNED House = "Unassigned"
)