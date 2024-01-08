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




// IssueLink - Details of a link between issues.
type IssueLink struct {

	// The ID of the issue link.
	Id string `json:"id,omitempty"`

	InwardIssue LinkedIssue `json:"inwardIssue"`

	OutwardIssue LinkedIssue `json:"outwardIssue"`

	// The URL of the issue link.
	Self string `json:"self,omitempty"`

	Type IssueLinkType `json:"type"`
}

// AssertIssueLinkRequired checks if the required fields are not zero-ed
func AssertIssueLinkRequired(obj IssueLink) error {
	elements := map[string]interface{}{
		"inwardIssue": obj.InwardIssue,
		"outwardIssue": obj.OutwardIssue,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertLinkedIssueRequired(obj.InwardIssue); err != nil {
		return err
	}
	if err := AssertLinkedIssueRequired(obj.OutwardIssue); err != nil {
		return err
	}
	if err := AssertIssueLinkTypeRequired(obj.Type); err != nil {
		return err
	}
	return nil
}

// AssertIssueLinkConstraints checks if the values respects the defined constraints
func AssertIssueLinkConstraints(obj IssueLink) error {
	return nil
}
