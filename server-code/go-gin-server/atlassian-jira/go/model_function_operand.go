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

// FunctionOperand - An operand that is a function. See [Advanced searching - functions reference](https://confluence.atlassian.com/x/dwiiLQ) for more information about JQL functions.
type FunctionOperand struct {

	// The list of function arguments.
	Arguments []string `json:"arguments"`

	// Encoded operand, which can be used directly in a JQL query.
	EncodedOperand string `json:"encodedOperand,omitempty"`

	// The name of the function.
	Function string `json:"function"`
}
