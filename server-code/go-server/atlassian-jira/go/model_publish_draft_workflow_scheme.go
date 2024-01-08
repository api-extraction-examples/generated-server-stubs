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




// PublishDraftWorkflowScheme - Details about the status mappings for publishing a draft workflow scheme.
type PublishDraftWorkflowScheme struct {

	// Mappings of statuses to new statuses for issue types.
	StatusMappings []StatusMapping `json:"statusMappings,omitempty"`
}

// AssertPublishDraftWorkflowSchemeRequired checks if the required fields are not zero-ed
func AssertPublishDraftWorkflowSchemeRequired(obj PublishDraftWorkflowScheme) error {
	for _, el := range obj.StatusMappings {
		if err := AssertStatusMappingRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertPublishDraftWorkflowSchemeConstraints checks if the values respects the defined constraints
func AssertPublishDraftWorkflowSchemeConstraints(obj PublishDraftWorkflowScheme) error {
	return nil
}