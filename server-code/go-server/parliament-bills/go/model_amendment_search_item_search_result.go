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




type AmendmentSearchItemSearchResult struct {

	Items *[]AmendmentSearchItem `json:"items,omitempty"`

	ItemsPerPage int32 `json:"itemsPerPage,omitempty"`

	TotalResults int32 `json:"totalResults,omitempty"`
}

// AssertAmendmentSearchItemSearchResultRequired checks if the required fields are not zero-ed
func AssertAmendmentSearchItemSearchResultRequired(obj AmendmentSearchItemSearchResult) error {
	if obj.Items != nil {
		for _, el := range *obj.Items {
			if err := AssertAmendmentSearchItemRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertAmendmentSearchItemSearchResultConstraints checks if the values respects the defined constraints
func AssertAmendmentSearchItemSearchResultConstraints(obj AmendmentSearchItemSearchResult) error {
	return nil
}