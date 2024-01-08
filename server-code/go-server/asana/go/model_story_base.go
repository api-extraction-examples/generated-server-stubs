/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"time"
)



type StoryBase struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// The time at which this resource was created.
	CreatedAt time.Time `json:"created_at,omitempty"`

	// [Opt In](/docs/input-output-options). HTML formatted text for a comment. This will not include the name of the creator.
	HtmlText string `json:"html_text,omitempty"`

	// *Conditional*. Whether the story should be pinned on the resource.
	IsPinned bool `json:"is_pinned,omitempty"`

	// The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
	ResourceSubtype string `json:"resource_subtype,omitempty"`

	// The name of the sticker in this story. `null` if there is no sticker.
	StickerName string `json:"sticker_name,omitempty"`

	// The plain text of the comment to add. Cannot be used with html_text.
	Text string `json:"text,omitempty"`
}

// AssertStoryBaseRequired checks if the required fields are not zero-ed
func AssertStoryBaseRequired(obj StoryBase) error {
	return nil
}

// AssertStoryBaseConstraints checks if the values respects the defined constraints
func AssertStoryBaseConstraints(obj StoryBase) error {
	return nil
}
