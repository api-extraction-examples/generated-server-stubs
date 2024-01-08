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

// JqlQueryClauseOperand - Details of an operand in a JQL clause.
type JqlQueryClauseOperand struct {

	// Encoded operand, which can be used directly in a JQL query.
	EncodedOperand string `json:"encodedOperand,omitempty"`

	// The list of operand values.
	Values []JqlQueryUnitaryOperand `json:"values"`

	// Encoded value, which can be used directly in a JQL query.
	EncodedValue string `json:"encodedValue,omitempty"`

	// The operand value.
	Value string `json:"value"`

	// The list of function arguments.
	Arguments []string `json:"arguments"`

	// The name of the function.
	Function string `json:"function"`

	// The keyword that is the operand value.
	Keyword string `json:"keyword"`
}