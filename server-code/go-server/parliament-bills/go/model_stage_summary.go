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




type StageSummary struct {

	Abbreviation *string `json:"abbreviation,omitempty"`

	Description *string `json:"description,omitempty"`

	House House `json:"house,omitempty"`

	Id int32 `json:"id,omitempty"`

	SessionId int32 `json:"sessionId,omitempty"`

	SortOrder int32 `json:"sortOrder,omitempty"`

	StageId int32 `json:"stageId,omitempty"`

	StageSittings *[]BillStageSitting `json:"stageSittings,omitempty"`
}

// AssertStageSummaryRequired checks if the required fields are not zero-ed
func AssertStageSummaryRequired(obj StageSummary) error {
	if obj.StageSittings != nil {
		for _, el := range *obj.StageSittings {
			if err := AssertBillStageSittingRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertStageSummaryConstraints checks if the values respects the defined constraints
func AssertStageSummaryConstraints(obj StageSummary) error {
	return nil
}
