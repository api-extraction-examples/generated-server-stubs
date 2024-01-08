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



type TaskRequest struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// Name of the task. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.
	Name string `json:"name,omitempty"`

	// The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The resource_subtype `milestone` represent a single moment in time. This means tasks with this subtype cannot have a start_date.
	ResourceSubtype string `json:"resource_subtype,omitempty"`

	// This value represents the sum of all the Time Tracking entries in the Actual Time field on a given Task. It is represented as a nullable long value.
	ActualTimeMinutes *float32 `json:"actual_time_minutes,omitempty"`

	// *Conditional* Reflects the approval status of this task. This field is kept in sync with `completed`, meaning `pending` translates to false while `approved`, `rejected`, and `changes_requested` translate to true. If you set completed to true, this field will be set to `approved`.
	ApprovalStatus string `json:"approval_status,omitempty"`

	// *Deprecated* Scheduling status of this task for the user it is assigned to. This field can only be set if the assignee is non-null. Setting this field to \"inbox\" or \"upcoming\" inserts it at the top of the section, while the other options will insert at the bottom.
	AssigneeStatus string `json:"assignee_status,omitempty"`

	// True if the task is currently marked complete, false if not.
	Completed bool `json:"completed,omitempty"`

	// The time at which this task was completed, or null if the task is incomplete.
	CompletedAt *time.Time `json:"completed_at,omitempty"`

	CompletedBy UserCompact `json:"completed_by,omitempty"`

	// The time at which this resource was created.
	CreatedAt time.Time `json:"created_at,omitempty"`

	// [Opt In](/docs/input-output-options). Array of resources referencing tasks that this task depends on. The objects contain only the gid of the dependency.
	Dependencies []AsanaResource `json:"dependencies,omitempty"`

	// [Opt In](/docs/input-output-options). Array of resources referencing tasks that depend on this task. The objects contain only the ID of the dependent.
	Dependents []AsanaResource `json:"dependents,omitempty"`

	// The UTC date and time on which this task is due, or null if the task has no due time. This takes an ISO 8601 date string in UTC and should not be used together with `due_on`.
	DueAt *string `json:"due_at,omitempty"`

	// The localized date on which this task is due, or null if the task has no due date. This takes a date with `YYYY-MM-DD` format and should not be used together with `due_at`.
	DueOn *string `json:"due_on,omitempty"`

	External TaskBaseAllOfExternal `json:"external,omitempty"`

	// *Deprecated - please use liked instead* True if the task is hearted by the authorized user, false if not.
	Hearted bool `json:"hearted,omitempty"`

	// *Deprecated - please use likes instead* Array of likes for users who have hearted this task.
	Hearts []Like `json:"hearts,omitempty"`

	// [Opt In](/docs/input-output-options). The notes of the text with formatting as HTML.
	HtmlNotes string `json:"html_notes,omitempty"`

	// [Opt In](/docs/input-output-options). In some contexts tasks can be rendered as a visual separator; for instance, subtasks can appear similar to [sections](/docs/asana-sections) without being true `section` objects. If a `task` object is rendered this way in any context it will have the property `is_rendered_as_separator` set to `true`.
	IsRenderedAsSeparator bool `json:"is_rendered_as_separator,omitempty"`

	// True if the task is liked by the authorized user, false if not.
	Liked bool `json:"liked,omitempty"`

	// Array of likes for users who have liked this task.
	Likes []Like `json:"likes,omitempty"`

	// *Create-only*. Array of projects this task is associated with and the section it is in. At task creation time, this array can be used to add the task to specific sections. After task creation, these associations can be modified using the `addProject` and `removeProject` endpoints. Note that over time, more types of memberships may be added to this property.
	Memberships []TaskBaseAllOfMemberships `json:"memberships,omitempty"`

	// The time at which this task was last modified.  *Note: This does not currently reflect any changes in associations such as projects or comments that may have been added or removed from the task.*
	ModifiedAt time.Time `json:"modified_at,omitempty"`

	// Free-form textual information associated with the task (i.e. its description).
	Notes string `json:"notes,omitempty"`

	// *Deprecated - please use likes instead* The number of users who have hearted this task.
	NumHearts int32 `json:"num_hearts,omitempty"`

	// The number of users who have liked this task.
	NumLikes int32 `json:"num_likes,omitempty"`

	// [Opt In](/docs/input-output-options). The number of subtasks on this task. 
	NumSubtasks int32 `json:"num_subtasks,omitempty"`

	// Date and time on which work begins for the task, or null if the task has no start time. This takes an ISO 8601 date string in UTC and should not be used together with `start_on`. *Note: `due_at` must be present in the request when setting or unsetting the `start_at` parameter.*
	StartAt *string `json:"start_at,omitempty"`

	// The day on which work begins for the task , or null if the task has no start date. This takes a date with `YYYY-MM-DD` format and should not be used together with `start_at`. *Note: `due_on` or `due_at` must be present in the request when setting or unsetting the `start_on` parameter.*
	StartOn *string `json:"start_on,omitempty"`

	// Gid of a user.
	Assignee *string `json:"assignee,omitempty"`

	// The *assignee section* is a subdivision of a project that groups tasks together in the assignee's \"My Tasks\" list. It can either be a header above a list of tasks in a list view or a column in a board view of \"My Tasks.\" The `assignee_section` property will be returned in the response only if the request was sent by the user who is the assignee of the task. Note that you can only write to `assignee_section` with the gid of an existing section visible in the user's \"My Tasks\" list.
	AssigneeSection *string `json:"assignee_section,omitempty"`

	// An object where each key is a Custom Field GID and each value is an enum GID, string, number, object, or array.
	CustomFields map[string]string `json:"custom_fields,omitempty"`

	// *Create-Only* An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user. In order to change followers on an existing task use `addFollowers` and `removeFollowers`.
	Followers []string `json:"followers,omitempty"`

	// Gid of a task.
	Parent *string `json:"parent,omitempty"`

	// *Create-Only* Array of project gids. In order to change projects on an existing task use `addProject` and `removeProject`.
	Projects []string `json:"projects,omitempty"`

	// *Create-Only* Array of tag gids. In order to change tags on an existing task use `addTag` and `removeTag`.
	Tags []string `json:"tags,omitempty"`

	// Gid of a workspace.
	Workspace string `json:"workspace,omitempty"`
}

// AssertTaskRequestRequired checks if the required fields are not zero-ed
func AssertTaskRequestRequired(obj TaskRequest) error {
	if err := AssertUserCompactRequired(obj.CompletedBy); err != nil {
		return err
	}
	for _, el := range obj.Dependencies {
		if err := AssertAsanaResourceRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Dependents {
		if err := AssertAsanaResourceRequired(el); err != nil {
			return err
		}
	}
	if err := AssertTaskBaseAllOfExternalRequired(obj.External); err != nil {
		return err
	}
	for _, el := range obj.Hearts {
		if err := AssertLikeRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Likes {
		if err := AssertLikeRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Memberships {
		if err := AssertTaskBaseAllOfMembershipsRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertTaskRequestConstraints checks if the values respects the defined constraints
func AssertTaskRequestConstraints(obj TaskRequest) error {
	return nil
}