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




// CustomFieldReplacement - Details about the replacement for a deleted version.
type CustomFieldReplacement struct {

	// The ID of the custom field in which to replace the version number.
	CustomFieldId int64 `json:"customFieldId,omitempty"`

	// The version number to use as a replacement for the deleted version.
	MoveTo int64 `json:"moveTo,omitempty"`
}

// AssertCustomFieldReplacementRequired checks if the required fields are not zero-ed
func AssertCustomFieldReplacementRequired(obj CustomFieldReplacement) error {
	return nil
}

// AssertCustomFieldReplacementConstraints checks if the values respects the defined constraints
func AssertCustomFieldReplacementConstraints(obj CustomFieldReplacement) error {
	return nil
}