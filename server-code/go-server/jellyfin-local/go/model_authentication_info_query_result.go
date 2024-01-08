/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AuthenticationInfoQueryResult struct {

	// Gets or sets the items.
	Items *[]AuthenticationInfo `json:"Items,omitempty"`

	// The index of the first record in Items.
	StartIndex int32 `json:"StartIndex,omitempty"`

	// The total number of records available.
	TotalRecordCount int32 `json:"TotalRecordCount,omitempty"`
}

// AssertAuthenticationInfoQueryResultRequired checks if the required fields are not zero-ed
func AssertAuthenticationInfoQueryResultRequired(obj AuthenticationInfoQueryResult) error {
	if obj.Items != nil {
		for _, el := range *obj.Items {
			if err := AssertAuthenticationInfoRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertAuthenticationInfoQueryResultConstraints checks if the values respects the defined constraints
func AssertAuthenticationInfoQueryResultConstraints(obj AuthenticationInfoQueryResult) error {
	return nil
}