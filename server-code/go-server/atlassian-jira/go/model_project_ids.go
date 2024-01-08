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




// ProjectIds - A list of project IDs.
type ProjectIds struct {

	// The IDs of projects.
	ProjectIds []string `json:"projectIds"`
}

// AssertProjectIdsRequired checks if the required fields are not zero-ed
func AssertProjectIdsRequired(obj ProjectIds) error {
	elements := map[string]interface{}{
		"projectIds": obj.ProjectIds,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertProjectIdsConstraints checks if the values respects the defined constraints
func AssertProjectIdsConstraints(obj ProjectIds) error {
	return nil
}