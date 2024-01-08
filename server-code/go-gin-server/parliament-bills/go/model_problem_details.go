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

type ProblemDetails struct {

	Detail *string `json:"detail,omitempty"`

	Instance *string `json:"instance,omitempty"`

	Status *int32 `json:"status,omitempty"`

	Title *string `json:"title,omitempty"`

	Type *string `json:"type,omitempty"`
}