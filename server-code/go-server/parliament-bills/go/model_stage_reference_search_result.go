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




type StageReferenceSearchResult struct {

	Items *[]StageReference `json:"items,omitempty"`

	ItemsPerPage int32 `json:"itemsPerPage,omitempty"`

	TotalResults int32 `json:"totalResults,omitempty"`
}

// AssertStageReferenceSearchResultRequired checks if the required fields are not zero-ed
func AssertStageReferenceSearchResultRequired(obj StageReferenceSearchResult) error {
	if obj.Items != nil {
		for _, el := range *obj.Items {
			if err := AssertStageReferenceRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertStageReferenceSearchResultConstraints checks if the values respects the defined constraints
func AssertStageReferenceSearchResultConstraints(obj StageReferenceSearchResult) error {
	return nil
}
