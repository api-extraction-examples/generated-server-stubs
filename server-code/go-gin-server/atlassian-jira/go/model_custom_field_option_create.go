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

// CustomFieldOptionCreate - Details of a custom field option to create.
type CustomFieldOptionCreate struct {

	// Whether the option is disabled.
	Disabled bool `json:"disabled,omitempty"`

	// For cascading options, the ID of the custom field object containing the cascading option.
	OptionId string `json:"optionId,omitempty"`

	// The value of the custom field option.
	Value string `json:"value"`
}