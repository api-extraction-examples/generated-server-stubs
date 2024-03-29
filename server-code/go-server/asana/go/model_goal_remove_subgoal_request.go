/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type GoalRemoveSubgoalRequest struct {

	// The goal gid to remove as subgoal from the parent goal
	Subgoal string `json:"subgoal"`
}

// AssertGoalRemoveSubgoalRequestRequired checks if the required fields are not zero-ed
func AssertGoalRemoveSubgoalRequestRequired(obj GoalRemoveSubgoalRequest) error {
	elements := map[string]interface{}{
		"subgoal": obj.Subgoal,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertGoalRemoveSubgoalRequestConstraints checks if the values respects the defined constraints
func AssertGoalRemoveSubgoalRequestConstraints(obj GoalRemoveSubgoalRequest) error {
	return nil
}
