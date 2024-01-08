/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type BaseItemDtoQueryResult struct {

	// Gets or sets the items.
	Items *[]BaseItemDto `json:"Items,omitempty"`

	// The index of the first record in Items.
	StartIndex int32 `json:"StartIndex,omitempty"`

	// The total number of records available.
	TotalRecordCount int32 `json:"TotalRecordCount,omitempty"`
}
