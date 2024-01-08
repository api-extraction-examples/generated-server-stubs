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




// CreateWorkflowTransitionRulesDetails - The details of a workflow transition rules.
type CreateWorkflowTransitionRulesDetails struct {

	Conditions CreateWorkflowCondition `json:"conditions,omitempty"`

	// The workflow post functions.  **Note:** The default post functions are always added to the *initial* transition, as in:      \"postFunctions\": [         {             \"type\": \"IssueCreateFunction\"         },         {             \"type\": \"IssueReindexFunction\"         },         {             \"type\": \"FireIssueEventFunction\",             \"configuration\": {                 \"event\": {                     \"id\": \"1\",                     \"name\": \"issue_created\"                 }             }         }     ]  **Note:** The default post functions are always added to the *global* and *directed* transitions, as in:      \"postFunctions\": [         {             \"type\": \"UpdateIssueStatusFunction\"         },         {             \"type\": \"CreateCommentFunction\"         },         {             \"type\": \"GenerateChangeHistoryFunction\"         },         {             \"type\": \"IssueReindexFunction\"         },         {             \"type\": \"FireIssueEventFunction\",             \"configuration\": {                 \"event\": {                     \"id\": \"13\",                     \"name\": \"issue_generic\"                 }             }         }     ]
	PostFunctions []CreateWorkflowTransitionRule `json:"postFunctions,omitempty"`

	// The workflow validators.  **Note:** The default permission validator is always added to the *initial* transition, as in:      \"validators\": [         {             \"type\": \"PermissionValidator\",             \"configuration\": {                 \"permissionKey\": \"CREATE_ISSUES\"             }         }     ]
	Validators []CreateWorkflowTransitionRule `json:"validators,omitempty"`
}

// AssertCreateWorkflowTransitionRulesDetailsRequired checks if the required fields are not zero-ed
func AssertCreateWorkflowTransitionRulesDetailsRequired(obj CreateWorkflowTransitionRulesDetails) error {
	if err := AssertCreateWorkflowConditionRequired(obj.Conditions); err != nil {
		return err
	}
	for _, el := range obj.PostFunctions {
		if err := AssertCreateWorkflowTransitionRuleRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Validators {
		if err := AssertCreateWorkflowTransitionRuleRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCreateWorkflowTransitionRulesDetailsConstraints checks if the values respects the defined constraints
func AssertCreateWorkflowTransitionRulesDetailsConstraints(obj CreateWorkflowTransitionRulesDetails) error {
	return nil
}