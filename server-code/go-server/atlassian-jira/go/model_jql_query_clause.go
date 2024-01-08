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




// JqlQueryClause - A JQL query clause.
type JqlQueryClause struct {

	// The list of nested clauses.
	Clauses []JqlQueryClause `json:"clauses"`

	// The operator applied to the field.
	Operator string `json:"operator"`

	Field JqlQueryField `json:"field"`

	Operand JqlQueryClauseOperand `json:"operand"`

	// The list of time predicates.
	Predicates []JqlQueryClauseTimePredicate `json:"predicates"`
}

// AssertJqlQueryClauseRequired checks if the required fields are not zero-ed
func AssertJqlQueryClauseRequired(obj JqlQueryClause) error {
	elements := map[string]interface{}{
		"clauses": obj.Clauses,
		"operator": obj.Operator,
		"field": obj.Field,
		"operand": obj.Operand,
		"predicates": obj.Predicates,
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
	if err := AssertJqlQueryFieldRequired(obj.Field); err != nil {
		return err
	}
	if err := AssertJqlQueryClauseOperandRequired(obj.Operand); err != nil {
		return err
	}
	for _, el := range obj.Predicates {
		if err := AssertJqlQueryClauseTimePredicateRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertJqlQueryClauseConstraints checks if the values respects the defined constraints
func AssertJqlQueryClauseConstraints(obj JqlQueryClause) error {
	return nil
}