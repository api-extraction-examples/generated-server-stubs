/*
 * CircleCI REST API
 *
 * The CircleCI API is a RESTful, fully-featured API that allows you to do almost anything in CircleCI. You can access all information and trigger all actions. The only thing we don’t provide access to is billing functions, which must be done from the CircleCI web UI. 
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type Tests struct {

	Tests []TestsTestsInner `json:"tests,omitempty"`
}

// AssertTestsRequired checks if the required fields are not zero-ed
func AssertTestsRequired(obj Tests) error {
	for _, el := range obj.Tests {
		if err := AssertTestsTestsInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertTestsConstraints checks if the values respects the defined constraints
func AssertTestsConstraints(obj Tests) error {
	return nil
}
