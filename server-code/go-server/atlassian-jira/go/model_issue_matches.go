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




// IssueMatches - A list of matched issues or errors for each JQL query, in the order the JQL queries were passed.
type IssueMatches struct {

	Matches []IssueMatchesForJql `json:"matches"`
}

// AssertIssueMatchesRequired checks if the required fields are not zero-ed
func AssertIssueMatchesRequired(obj IssueMatches) error {
	elements := map[string]interface{}{
		"matches": obj.Matches,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Matches {
		if err := AssertIssueMatchesForJqlRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertIssueMatchesConstraints checks if the values respects the defined constraints
func AssertIssueMatchesConstraints(obj IssueMatches) error {
	return nil
}