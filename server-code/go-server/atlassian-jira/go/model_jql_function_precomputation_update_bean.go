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




// JqlFunctionPrecomputationUpdateBean - Precomputation id and its new value.
type JqlFunctionPrecomputationUpdateBean struct {

	Id int64 `json:"id"`

	Value string `json:"value"`
}

// AssertJqlFunctionPrecomputationUpdateBeanRequired checks if the required fields are not zero-ed
func AssertJqlFunctionPrecomputationUpdateBeanRequired(obj JqlFunctionPrecomputationUpdateBean) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"value": obj.Value,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertJqlFunctionPrecomputationUpdateBeanConstraints checks if the values respects the defined constraints
func AssertJqlFunctionPrecomputationUpdateBeanConstraints(obj JqlFunctionPrecomputationUpdateBean) error {
	return nil
}