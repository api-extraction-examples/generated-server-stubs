/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type ProjectBriefResponse struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// HTML formatted text for the project brief.
	HtmlText string `json:"html_text,omitempty"`

	// The title of the project brief.
	Title string `json:"title,omitempty"`

	// A url that points directly to the object within Asana.
	PermalinkUrl string `json:"permalink_url,omitempty"`

	Project ProjectBriefResponseAllOfProject `json:"project,omitempty"`

	// [Opt In](/docs/input-output-options). The plain text of the project brief.
	Text string `json:"text,omitempty"`
}