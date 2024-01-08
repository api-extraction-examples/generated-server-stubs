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

type JiraExpressionEvaluationMetaDataBean struct {

	Complexity JiraExpressionsComplexityBean `json:"complexity,omitempty"`

	Issues IssuesMetaBean `json:"issues,omitempty"`
}