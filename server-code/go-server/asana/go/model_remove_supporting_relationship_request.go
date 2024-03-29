/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type RemoveSupportingRelationshipRequest struct {

	Data GoalRemoveSupportingRelationshipRequest `json:"data,omitempty"`
}

// AssertRemoveSupportingRelationshipRequestRequired checks if the required fields are not zero-ed
func AssertRemoveSupportingRelationshipRequestRequired(obj RemoveSupportingRelationshipRequest) error {
	if err := AssertGoalRemoveSupportingRelationshipRequestRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertRemoveSupportingRelationshipRequestConstraints checks if the values respects the defined constraints
func AssertRemoveSupportingRelationshipRequestConstraints(obj RemoveSupportingRelationshipRequest) error {
	return nil
}
