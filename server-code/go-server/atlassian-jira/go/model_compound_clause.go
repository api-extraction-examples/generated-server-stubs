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




// CompoundClause - A JQL query clause that consists of nested clauses. For example, `(labels in (urgent, blocker) OR lastCommentedBy = currentUser()). Note that, where nesting is not defined, the parser nests JQL clauses based on the operator precedence. For example, \"A OR B AND C\" is parsed as \"(A OR B) AND C\". See Setting the precedence of operators for more information about precedence in JQL queries.`
type CompoundClause struct {

	// The list of nested clauses.
	Clauses []JqlQueryClause `json:"clauses"`

	// The operator between the clauses.
	Operator string `json:"operator"`
}

// AssertCompoundClauseRequired checks if the required fields are not zero-ed
func AssertCompoundClauseRequired(obj CompoundClause) error {
	elements := map[string]interface{}{
		"clauses": obj.Clauses,
		"operator": obj.Operator,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Clauses {
		if err := AssertJqlQueryClauseRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCompoundClauseConstraints checks if the values respects the defined constraints
func AssertCompoundClauseConstraints(obj CompoundClause) error {
	return nil
}
