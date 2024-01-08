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




// CreateWorkflowTransitionRule - A workflow transition rule.
type CreateWorkflowTransitionRule struct {

	// EXPERIMENTAL. The configuration of the transition rule.
	Configuration map[string]interface{} `json:"configuration,omitempty"`

	// The type of the transition rule.
	Type string `json:"type"`
}

// AssertCreateWorkflowTransitionRuleRequired checks if the required fields are not zero-ed
func AssertCreateWorkflowTransitionRuleRequired(obj CreateWorkflowTransitionRule) error {
	elements := map[string]interface{}{
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertCreateWorkflowTransitionRuleConstraints checks if the values respects the defined constraints
func AssertCreateWorkflowTransitionRuleConstraints(obj CreateWorkflowTransitionRule) error {
	return nil
}