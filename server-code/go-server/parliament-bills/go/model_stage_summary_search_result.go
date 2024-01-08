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

// AssertStageSummarySearchResultRequired checks if the required fields are not zero-ed
func AssertStageSummarySearchResultRequired(obj StageSummarySearchResult) error {
	if obj.Items != nil {
		for _, el := range *obj.Items {
			if err := AssertStageSummaryRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertStageSummarySearchResultConstraints checks if the values respects the defined constraints
func AssertStageSummarySearchResultConstraints(obj StageSummarySearchResult) error {
	return nil
}