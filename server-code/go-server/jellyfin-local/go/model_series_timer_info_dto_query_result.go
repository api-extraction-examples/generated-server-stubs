/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type SeriesTimerInfoDtoQueryResult struct {

	// Gets or sets the items.
	Items *[]SeriesTimerInfoDto `json:"Items,omitempty"`

	// The index of the first record in Items.
	StartIndex int32 `json:"StartIndex,omitempty"`

	// The total number of records available.
	TotalRecordCount int32 `json:"TotalRecordCount,omitempty"`
}

// AssertSeriesTimerInfoDtoQueryResultRequired checks if the required fields are not zero-ed
func AssertSeriesTimerInfoDtoQueryResultRequired(obj SeriesTimerInfoDtoQueryResult) error {
	if obj.Items != nil {
		for _, el := range *obj.Items {
			if err := AssertSeriesTimerInfoDtoRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertSeriesTimerInfoDtoQueryResultConstraints checks if the values respects the defined constraints
func AssertSeriesTimerInfoDtoQueryResultConstraints(obj SeriesTimerInfoDtoQueryResult) error {
	return nil
}