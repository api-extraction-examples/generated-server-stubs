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

type StageSummarySearchResult struct {

	Items *[]StageSummary `json:"items,omitempty"`

	ItemsPerPage int32 `json:"itemsPerPage,omitempty"`

	TotalResults int32 `json:"totalResults,omitempty"`
}
