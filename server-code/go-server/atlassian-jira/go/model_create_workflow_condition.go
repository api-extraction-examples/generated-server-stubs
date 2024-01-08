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




// CreateWorkflowCondition - A workflow transition condition.
type CreateWorkflowCondition struct {

	// The list of workflow conditions.
	Conditions []CreateWorkflowCondition `json:"conditions,omitempty"`

	// EXPERIMENTAL. The configuration of the transition rule.
	Configuration map[string]interface{} `json:"configuration,omitempty"`

	// The compound condition operator.
	Operator string `json:"operator,omitempty"`

	// The type of the transition rule.
	Type string `json:"type,omitempty"`
}

// AssertCreateWorkflowConditionRequired checks if the required fields are not zero-ed
func AssertCreateWorkflowConditionRequired(obj CreateWorkflowCondition) error {
	for _, el := range obj.Conditions {
		if err := AssertCreateWorkflowConditionRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCreateWorkflowConditionConstraints checks if the values respects the defined constraints
func AssertCreateWorkflowConditionConstraints(obj CreateWorkflowCondition) error {
	return nil
}