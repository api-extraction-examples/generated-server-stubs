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




// WorkflowCondition - The workflow transition rule conditions tree.
type WorkflowCondition struct {

	// EXPERIMENTAL. The configuration of the transition rule.
	Configuration map[string]interface{} `json:"configuration,omitempty"`

	NodeType string `json:"nodeType"`

	// The type of the transition rule.
	Type string `json:"type"`

	// The list of workflow conditions.
	Conditions []WorkflowCondition `json:"conditions"`

	// The compound condition operator.
	Operator string `json:"operator"`
}

// AssertWorkflowConditionRequired checks if the required fields are not zero-ed
func AssertWorkflowConditionRequired(obj WorkflowCondition) error {
	elements := map[string]interface{}{
		"nodeType": obj.NodeType,
		"type": obj.Type,
		"conditions": obj.Conditions,
		"operator": obj.Operator,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Conditions {
		if err := AssertWorkflowConditionRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertWorkflowConditionConstraints checks if the values respects the defined constraints
func AssertWorkflowConditionConstraints(obj WorkflowCondition) error {
	return nil
}