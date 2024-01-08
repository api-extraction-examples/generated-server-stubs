/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * API version: 5.3.0
 * Contact: support@launchdarkly.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type AuditLogEntry struct {

	// The unique resource id.
	Id string `json:"_id,omitempty"`

	Links Links `json:"_links,omitempty"`

	Comment string `json:"comment,omitempty"`

	Date int64 `json:"date,omitempty"`

	Description string `json:"description,omitempty"`

	Kind string `json:"kind,omitempty"`

	Member Member `json:"member,omitempty"`

	Name string `json:"name,omitempty"`

	ShortDescription string `json:"shortDescription,omitempty"`

	Target AuditLogEntryTarget `json:"target,omitempty"`

	Title string `json:"title,omitempty"`

	TitleVerb string `json:"titleVerb,omitempty"`
}