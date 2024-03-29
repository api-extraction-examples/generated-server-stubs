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




type NewsArticlesSummarySearchResult struct {

	Items *[]NewsArticlesSummary `json:"items,omitempty"`

	ItemsPerPage int32 `json:"itemsPerPage,omitempty"`

	TotalResults int32 `json:"totalResults,omitempty"`
}

// AssertNewsArticlesSummarySearchResultRequired checks if the required fields are not zero-ed
func AssertNewsArticlesSummarySearchResultRequired(obj NewsArticlesSummarySearchResult) error {
	if obj.Items != nil {
		for _, el := range *obj.Items {
			if err := AssertNewsArticlesSummaryRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertNewsArticlesSummarySearchResultConstraints checks if the values respects the defined constraints
func AssertNewsArticlesSummarySearchResultConstraints(obj NewsArticlesSummarySearchResult) error {
	return nil
}
