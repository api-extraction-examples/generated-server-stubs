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




// JqlQueryOrderByClauseElement - An element of the order-by JQL clause.
type JqlQueryOrderByClauseElement struct {

	// The direction in which to order the results.
	Direction string `json:"direction,omitempty"`

	Field JqlQueryField `json:"field"`
}

// AssertJqlQueryOrderByClauseElementRequired checks if the required fields are not zero-ed
func AssertJqlQueryOrderByClauseElementRequired(obj JqlQueryOrderByClauseElement) error {
	elements := map[string]interface{}{
		"field": obj.Field,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertJqlQueryFieldRequired(obj.Field); err != nil {
		return err
	}
	return nil
}

// AssertJqlQueryOrderByClauseElementConstraints checks if the values respects the defined constraints
func AssertJqlQueryOrderByClauseElementConstraints(obj JqlQueryOrderByClauseElement) error {
	return nil
}
