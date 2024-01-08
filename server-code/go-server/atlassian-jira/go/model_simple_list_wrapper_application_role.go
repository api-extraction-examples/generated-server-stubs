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




type SimpleListWrapperApplicationRole struct {

	Callback map[string]interface{} `json:"callback,omitempty"`

	Items []ApplicationRole `json:"items,omitempty"`

	MaxResults int32 `json:"max-results,omitempty"`

	PagingCallback map[string]interface{} `json:"pagingCallback,omitempty"`

	Size int32 `json:"size,omitempty"`
}

// AssertSimpleListWrapperApplicationRoleRequired checks if the required fields are not zero-ed
func AssertSimpleListWrapperApplicationRoleRequired(obj SimpleListWrapperApplicationRole) error {
	for _, el := range obj.Items {
		if err := AssertApplicationRoleRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertSimpleListWrapperApplicationRoleConstraints checks if the values respects the defined constraints
func AssertSimpleListWrapperApplicationRoleConstraints(obj SimpleListWrapperApplicationRole) error {
	return nil
}