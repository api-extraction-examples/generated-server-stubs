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

// CreateWorkflowDetails - The details of a workflow.
type CreateWorkflowDetails struct {

	// The description of the workflow. The maximum length is 1000 characters.
	Description string `json:"description,omitempty"`

	// The name of the workflow. The name must be unique. The maximum length is 255 characters. Characters can be separated by a whitespace but the name cannot start or end with a whitespace.
	Name string `json:"name"`

	// The statuses of the workflow. Any status that does not include a transition is added to the workflow without a transition.
	Statuses []CreateWorkflowStatusDetails `json:"statuses"`

	// The transitions of the workflow. For the request to be valid, these transitions must:   *  include one *initial* transition.  *  not use the same name for a *global* and *directed* transition.  *  have a unique name for each *global* transition.  *  have a unique 'to' status for each *global* transition.  *  have unique names for each transition from a status.  *  not have a 'from' status on *initial* and *global* transitions.  *  have a 'from' status on *directed* transitions.  All the transition statuses must be included in `statuses`.
	Transitions []CreateWorkflowTransitionDetails `json:"transitions"`
}
