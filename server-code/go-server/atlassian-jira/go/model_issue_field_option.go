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




// IssueFieldOption - Details of the options for a select list issue field.
type IssueFieldOption struct {

	Config IssueFieldOptionConfiguration `json:"config,omitempty"`

	// The unique identifier for the option. This is only unique within the select field's set of options.
	Id int64 `json:"id"`

	// The properties of the object, as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see [Issue Field Option Property Index](https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/)) are defined in the descriptor for the issue field module.
	Properties map[string]interface{} `json:"properties,omitempty"`

	// The option's name, which is displayed in Jira.
	Value string `json:"value"`
}

// AssertIssueFieldOptionRequired checks if the required fields are not zero-ed
func AssertIssueFieldOptionRequired(obj IssueFieldOption) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"value": obj.Value,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertIssueFieldOptionConfigurationRequired(obj.Config); err != nil {
		return err
	}
	return nil
}

// AssertIssueFieldOptionConstraints checks if the values respects the defined constraints
func AssertIssueFieldOptionConstraints(obj IssueFieldOption) error {
	return nil
}
