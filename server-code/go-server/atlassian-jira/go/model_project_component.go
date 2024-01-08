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




// ProjectComponent - Details about a project component.
type ProjectComponent struct {

	Assignee ProjectComponentAssignee `json:"assignee,omitempty"`

	// The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: `PROJECT_DEFAULT`.   Optional when creating or updating a component.
	AssigneeType string `json:"assigneeType,omitempty"`

	// The description for the component. Optional when creating or updating a component.
	Description string `json:"description,omitempty"`

	// The unique identifier for the component.
	Id string `json:"id,omitempty"`

	// Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.
	IsAssigneeTypeValid bool `json:"isAssigneeTypeValid,omitempty"`

	Lead ProjectComponentLead `json:"lead,omitempty"`

	// The accountId of the component's lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
	LeadAccountId string `json:"leadAccountId,omitempty"`

	// This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
	LeadUserName string `json:"leadUserName,omitempty"`

	// The unique name for the component in the project. Required when creating a component. Optional when updating a component. The maximum length is 255 characters.
	Name string `json:"name,omitempty"`

	// The key of the project the component is assigned to. Required when creating a component. Can't be updated.
	Project string `json:"project,omitempty"`

	// The ID of the project the component is assigned to.
	ProjectId int64 `json:"projectId,omitempty"`

	RealAssignee ProjectComponentRealAssignee `json:"realAssignee,omitempty"`

	// The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true.
	RealAssigneeType string `json:"realAssigneeType,omitempty"`

	// The URL of the component.
	Self string `json:"self,omitempty"`
}

// AssertProjectComponentRequired checks if the required fields are not zero-ed
func AssertProjectComponentRequired(obj ProjectComponent) error {
	if err := AssertProjectComponentAssigneeRequired(obj.Assignee); err != nil {
		return err
	}
	if err := AssertProjectComponentLeadRequired(obj.Lead); err != nil {
		return err
	}
	if err := AssertProjectComponentRealAssigneeRequired(obj.RealAssignee); err != nil {
		return err
	}
	return nil
}

// AssertProjectComponentConstraints checks if the values respects the defined constraints
func AssertProjectComponentConstraints(obj ProjectComponent) error {
	return nil
}
