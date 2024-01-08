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




type ConnectModules struct {

	// A list of app modules in the same format as the `modules` property in the [app descriptor](https://developer.atlassian.com/cloud/jira/platform/app-descriptor/).
	Modules []map[string]interface{} `json:"modules"`
}

// AssertConnectModulesRequired checks if the required fields are not zero-ed
func AssertConnectModulesRequired(obj ConnectModules) error {
	elements := map[string]interface{}{
		"modules": obj.Modules,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertConnectModulesConstraints checks if the values respects the defined constraints
func AssertConnectModulesConstraints(obj ConnectModules) error {
	return nil
}