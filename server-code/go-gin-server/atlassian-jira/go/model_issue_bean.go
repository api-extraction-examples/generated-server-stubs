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

// IssueBean - Details about an issue.
type IssueBean struct {

	Changelog IssueBeanChangelog `json:"changelog,omitempty"`

	Editmeta IssueBeanEditmeta `json:"editmeta,omitempty"`

	// Expand options that include additional issue details in the response.
	Expand string `json:"expand,omitempty"`

	Fields map[string]interface{} `json:"fields,omitempty"`

	FieldsToInclude IncludedFields `json:"fieldsToInclude,omitempty"`

	// The ID of the issue.
	Id string `json:"id,omitempty"`

	// The key of the issue.
	Key string `json:"key,omitempty"`

	// The ID and name of each field present on the issue.
	Names map[string]string `json:"names,omitempty"`

	Operations IssueBeanOperations `json:"operations,omitempty"`

	// Details of the issue properties identified in the request.
	Properties map[string]interface{} `json:"properties,omitempty"`

	// The rendered value of each field present on the issue.
	RenderedFields map[string]interface{} `json:"renderedFields,omitempty"`

	// The schema describing each field present on the issue.
	Schema map[string]JsonTypeBean `json:"schema,omitempty"`

	// The URL of the issue details.
	Self string `json:"self,omitempty"`

	// The transitions that can be performed on the issue.
	Transitions []IssueTransition `json:"transitions,omitempty"`

	// The versions of each field on the issue.
	VersionedRepresentations map[string]map[string]interface{} `json:"versionedRepresentations,omitempty"`
}
