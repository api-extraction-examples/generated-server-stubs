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

type JiraExpressionEvalRequestBean struct {

	Context JiraExpressionEvalContextBean `json:"context,omitempty"`

	// The Jira expression to evaluate.
	Expression string `json:"expression"`
}