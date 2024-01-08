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

type StoryResponse struct {

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

	Assignee UserCompact `json:"assignee,omitempty"`

	CreatedBy UserCompact `json:"created_by,omitempty"`

	CustomField CustomFieldCompact `json:"custom_field,omitempty"`

	Dependency TaskCompact `json:"dependency,omitempty"`

	DuplicateOf TaskCompact `json:"duplicate_of,omitempty"`

	DuplicatedFrom TaskCompact `json:"duplicated_from,omitempty"`

	Follower UserCompact `json:"follower,omitempty"`

	// *Deprecated - please use likes instead* *Conditional*. True if the story is hearted by the authorized user, false if not.
	Hearted bool `json:"hearted,omitempty"`

	// *Deprecated - please use likes instead*  *Conditional*. Array of likes for users who have hearted this story.
	Hearts []Like `json:"hearts,omitempty"`

	// *Conditional*. Whether the text of the story can be edited after creation.
	IsEditable bool `json:"is_editable,omitempty"`

	// *Conditional*. Whether the text of the story has been edited after creation.
	IsEdited bool `json:"is_edited,omitempty"`

	// *Conditional*. True if the story is liked by the authorized user, false if not.
	Liked bool `json:"liked,omitempty"`

	// *Conditional*. Array of likes for users who have liked this story.
	Likes []Like `json:"likes,omitempty"`

	// *Conditional*. The new value of approval status.
	NewApprovalStatus string `json:"new_approval_status,omitempty"`

	NewDateValue StoryResponseAllOfNewDateValue `json:"new_date_value,omitempty"`

	NewDates StoryResponseDates `json:"new_dates,omitempty"`

	NewEnumValue EnumOption `json:"new_enum_value,omitempty"`

	// *Conditional*. The new value of a multi-enum custom field story.
	NewMultiEnumValues []EnumOption `json:"new_multi_enum_values,omitempty"`

	// *Conditional*
	NewName string `json:"new_name,omitempty"`

	// *Conditional*
	NewNumberValue int32 `json:"new_number_value,omitempty"`

	// *Conditional*. The new value of a people custom field story.
	NewPeopleValue []UserCompact `json:"new_people_value,omitempty"`

	// *Conditional*
	NewResourceSubtype string `json:"new_resource_subtype,omitempty"`

	NewSection SectionCompact `json:"new_section,omitempty"`

	// *Conditional*
	NewTextValue string `json:"new_text_value,omitempty"`

	// *Deprecated - please use likes instead*  *Conditional*. The number of users who have hearted this story.
	NumHearts int32 `json:"num_hearts,omitempty"`

	// *Conditional*. The number of users who have liked this story.
	NumLikes int32 `json:"num_likes,omitempty"`

	// *Conditional*. The old value of approval status.
	OldApprovalStatus string `json:"old_approval_status,omitempty"`

	OldDateValue StoryResponseAllOfOldDateValue `json:"old_date_value,omitempty"`

	OldDates StoryResponseDates `json:"old_dates,omitempty"`

	OldEnumValue EnumOption `json:"old_enum_value,omitempty"`

	// *Conditional*. The old value of a multi-enum custom field story.
	OldMultiEnumValues []EnumOption `json:"old_multi_enum_values,omitempty"`

	// *Conditional*'
	OldName string `json:"old_name,omitempty"`

	// *Conditional*
	OldNumberValue int32 `json:"old_number_value,omitempty"`

	// *Conditional*. The old value of a people custom field story.
	OldPeopleValue []UserCompact `json:"old_people_value,omitempty"`

	// *Conditional*
	OldResourceSubtype string `json:"old_resource_subtype,omitempty"`

	OldSection SectionCompact `json:"old_section,omitempty"`

	// *Conditional*
	OldTextValue string `json:"old_text_value,omitempty"`

	// *Conditional*. A collection of previews to be displayed in the story.  *Note: This property only exists for comment stories.*
	Previews []Preview `json:"previews,omitempty"`

	Project ProjectCompact `json:"project,omitempty"`

	// The component of the Asana product the user used to trigger the story.
	Source string `json:"source,omitempty"`

	Story StoryCompact `json:"story,omitempty"`

	Tag TagCompact `json:"tag,omitempty"`

	Target StoryResponseAllOfTarget `json:"target,omitempty"`

	Task TaskCompact `json:"task,omitempty"`

	Type string `json:"type,omitempty"`
}
