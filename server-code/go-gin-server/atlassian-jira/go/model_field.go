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

// Field - Details of a field.
type Field struct {

	// Number of contexts where the field is used.
	ContextsCount int64 `json:"contextsCount,omitempty"`

	// The description of the field.
	Description string `json:"description,omitempty"`

	// The ID of the field.
	Id string `json:"id"`

	// Whether the field is locked.
	IsLocked bool `json:"isLocked,omitempty"`

	// Whether the field is shown on screen or not.
	IsUnscreenable bool `json:"isUnscreenable,omitempty"`

	// The key of the field.
	Key string `json:"key,omitempty"`

	LastUsed FieldLastUsed `json:"lastUsed,omitempty"`

	// The name of the field.
	Name string `json:"name"`

	// Number of projects where the field is used.
	ProjectsCount int64 `json:"projectsCount,omitempty"`

	Schema JsonTypeBean `json:"schema"`

	// Number of screens where the field is used.
	ScreensCount int64 `json:"screensCount,omitempty"`

	// The searcher key of the field. Returned for custom fields.
	SearcherKey string `json:"searcherKey,omitempty"`
}
