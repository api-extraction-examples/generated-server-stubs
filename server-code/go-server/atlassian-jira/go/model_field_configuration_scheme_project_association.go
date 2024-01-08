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




// FieldConfigurationSchemeProjectAssociation - Associated field configuration scheme and project.
type FieldConfigurationSchemeProjectAssociation struct {

	// The ID of the field configuration scheme. If the field configuration scheme ID is `null`, the operation assigns the default field configuration scheme.
	FieldConfigurationSchemeId string `json:"fieldConfigurationSchemeId,omitempty"`

	// The ID of the project.
	ProjectId string `json:"projectId"`
}

// AssertFieldConfigurationSchemeProjectAssociationRequired checks if the required fields are not zero-ed
func AssertFieldConfigurationSchemeProjectAssociationRequired(obj FieldConfigurationSchemeProjectAssociation) error {
	elements := map[string]interface{}{
		"projectId": obj.ProjectId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertFieldConfigurationSchemeProjectAssociationConstraints checks if the values respects the defined constraints
func AssertFieldConfigurationSchemeProjectAssociationConstraints(obj FieldConfigurationSchemeProjectAssociation) error {
	return nil
}