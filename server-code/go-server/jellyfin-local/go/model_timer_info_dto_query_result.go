/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type TimerInfoDtoQueryResult struct {

	// Gets or sets the items.
	Items *[]TimerInfoDto `json:"Items,omitempty"`

	// The index of the first record in Items.
	StartIndex int32 `json:"StartIndex,omitempty"`

	// The total number of records available.
	TotalRecordCount int32 `json:"TotalRecordCount,omitempty"`
}

// AssertTimerInfoDtoQueryResultRequired checks if the required fields are not zero-ed
func AssertTimerInfoDtoQueryResultRequired(obj TimerInfoDtoQueryResult) error {
	if obj.Items != nil {
		for _, el := range *obj.Items {
			if err := AssertTimerInfoDtoRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertTimerInfoDtoQueryResultConstraints checks if the values respects the defined constraints
func AssertTimerInfoDtoQueryResultConstraints(obj TimerInfoDtoQueryResult) error {
	return nil
}