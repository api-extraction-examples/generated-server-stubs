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

type AmendmentSearchItem struct {

	AmendmentId int32 `json:"amendmentId,omitempty"`

	AmendmentPosition *string `json:"amendmentPosition,omitempty"`

	AmendmentType AmendmentType `json:"amendmentType,omitempty"`

	BillId int32 `json:"billId,omitempty"`

	BillStageId int32 `json:"billStageId,omitempty"`

	Clause *int32 `json:"clause,omitempty"`

	Decision AmendmentDecision `json:"decision,omitempty"`

	LineNumber *int32 `json:"lineNumber,omitempty"`

	MarshalledListText *string `json:"marshalledListText,omitempty"`

	PageNumber *int32 `json:"pageNumber,omitempty"`

	Schedule *int32 `json:"schedule,omitempty"`

	Sponsors *[]AmendmentMember `json:"sponsors,omitempty"`

	SummaryText *[]string `json:"summaryText,omitempty"`
}
