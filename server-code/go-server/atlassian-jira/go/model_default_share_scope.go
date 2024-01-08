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




// DefaultShareScope - Details of the scope of the default sharing for new filters and dashboards.
type DefaultShareScope struct {

	// The scope of the default sharing for new filters and dashboards:   *  `AUTHENTICATED` Shared with all logged-in users.  *  `GLOBAL` Shared with all logged-in users. This shows as `AUTHENTICATED` in the response.  *  `PRIVATE` Not shared with any users.
	Scope string `json:"scope"`
}

// AssertDefaultShareScopeRequired checks if the required fields are not zero-ed
func AssertDefaultShareScopeRequired(obj DefaultShareScope) error {
	elements := map[string]interface{}{
		"scope": obj.Scope,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertDefaultShareScopeConstraints checks if the values respects the defined constraints
func AssertDefaultShareScopeConstraints(obj DefaultShareScope) error {
	return nil
}
