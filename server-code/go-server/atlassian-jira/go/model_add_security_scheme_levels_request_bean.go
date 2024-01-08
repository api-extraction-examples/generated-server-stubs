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




type AddSecuritySchemeLevelsRequestBean struct {

	// The list of scheme levels which should be added to the security scheme.
	Levels []SecuritySchemeLevelBean `json:"levels,omitempty"`
}

// AssertAddSecuritySchemeLevelsRequestBeanRequired checks if the required fields are not zero-ed
func AssertAddSecuritySchemeLevelsRequestBeanRequired(obj AddSecuritySchemeLevelsRequestBean) error {
	for _, el := range obj.Levels {
		if err := AssertSecuritySchemeLevelBeanRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertAddSecuritySchemeLevelsRequestBeanConstraints checks if the values respects the defined constraints
func AssertAddSecuritySchemeLevelsRequestBeanConstraints(obj AddSecuritySchemeLevelsRequestBean) error {
	return nil
}