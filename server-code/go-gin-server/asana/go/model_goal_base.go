/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type GoalBase struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// The localized day on which this goal is due. This takes a date with format `YYYY-MM-DD`.
	DueOn *string `json:"due_on,omitempty"`

	// The notes of the goal with formatting as HTML.
	HtmlNotes string `json:"html_notes,omitempty"`

	// *Conditional*. This property is only present when the `workspace` provided is an organization. Whether the goal belongs to the `workspace` (and is listed as part of the workspace’s goals) or not. If it isn’t a workspace-level goal, it is a team-level goal, and is associated with the goal’s team.
	IsWorkspaceLevel bool `json:"is_workspace_level,omitempty"`

	// True if the goal is liked by the authorized user, false if not.
	Liked bool `json:"liked,omitempty"`

	// The name of the goal.
	Name string `json:"name,omitempty"`

	// Free-form textual information associated with the goal (i.e. its description).
	Notes string `json:"notes,omitempty"`

	// The day on which work for this goal begins, or null if the goal has no start date. This takes a date with `YYYY-MM-DD` format, and cannot be set unless there is an accompanying due date.
	StartOn *string `json:"start_on,omitempty"`

	// The current status of this goal. When the goal is open, its status can be `green`, `yellow`, and `red` to reflect \"On Track\", \"At Risk\", and \"Off Track\", respectively. When the goal is closed, the value can be `missed`, `achieved`, `partial`, or `dropped`. *Note* you can only write to this property if `metric` is set.
	Status *string `json:"status,omitempty"`
}
