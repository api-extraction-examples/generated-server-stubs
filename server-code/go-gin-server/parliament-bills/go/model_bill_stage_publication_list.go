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

type BillStagePublicationList struct {

	BillStageId int32 `json:"billStageId,omitempty"`

	Publications *[]Publication `json:"publications,omitempty"`

	Sittings *[]BillStageSittingPublicationList `json:"sittings,omitempty"`
}
