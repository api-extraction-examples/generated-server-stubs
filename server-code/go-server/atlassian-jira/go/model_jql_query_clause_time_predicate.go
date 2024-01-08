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




// JqlQueryClauseTimePredicate - A time predicate for a temporal JQL clause.
type JqlQueryClauseTimePredicate struct {

	Operand JqlQueryClauseOperand `json:"operand"`

	// The operator between the field and the operand.
	Operator string `json:"operator"`
}

// AssertJqlQueryClauseTimePredicateRequired checks if the required fields are not zero-ed
func AssertJqlQueryClauseTimePredicateRequired(obj JqlQueryClauseTimePredicate) error {
	elements := map[string]interface{}{
		"operand": obj.Operand,
		"operator": obj.Operator,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertJqlQueryClauseOperandRequired(obj.Operand); err != nil {
		return err
	}
	return nil
}

// AssertJqlQueryClauseTimePredicateConstraints checks if the values respects the defined constraints
func AssertJqlQueryClauseTimePredicateConstraints(obj JqlQueryClauseTimePredicate) error {
	return nil
}
