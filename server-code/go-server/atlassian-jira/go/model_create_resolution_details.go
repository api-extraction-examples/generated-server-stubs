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




// CreateResolutionDetails - Details of an issue resolution.
type CreateResolutionDetails struct {

	// The description of the resolution.
	Description string `json:"description,omitempty"`

	// The name of the resolution. Must be unique (case-insensitive).
	Name string `json:"name"`
}

// AssertCreateResolutionDetailsRequired checks if the required fields are not zero-ed
func AssertCreateResolutionDetailsRequired(obj CreateResolutionDetails) error {
	elements := map[string]interface{}{
		"name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertCreateResolutionDetailsConstraints checks if the values respects the defined constraints
func AssertCreateResolutionDetailsConstraints(obj CreateResolutionDetails) error {
	return nil
}