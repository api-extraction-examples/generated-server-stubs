/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// PageBeanDashboard - A page of items.
type PageBeanDashboard struct {

	// Whether this is the last page.
	IsLast bool `json:"isLast,omitempty"`

	// The maximum number of items that could be returned.
	MaxResults int32 `json:"maxResults,omitempty"`

	// If there is another page of results, the URL of the next page.
	NextPage string `json:"nextPage,omitempty"`

	// The URL of the page.
	Self string `json:"self,omitempty"`

	// The index of the first item returned.
	StartAt int64 `json:"startAt,omitempty"`

	// The number of items returned.
	Total int64 `json:"total,omitempty"`

	// The list of items.
	Values []Dashboard `json:"values,omitempty"`
}

// AssertPageBeanDashboardRequired checks if the required fields are not zero-ed
func AssertPageBeanDashboardRequired(obj PageBeanDashboard) error {
	for _, el := range obj.Values {
		if err := AssertDashboardRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertPageBeanDashboardConstraints checks if the values respects the defined constraints
func AssertPageBeanDashboardConstraints(obj PageBeanDashboard) error {
	return nil
}
