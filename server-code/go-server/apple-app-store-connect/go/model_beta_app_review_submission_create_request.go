/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BetaAppReviewSubmissionCreateRequest struct {

	Data BetaAppReviewSubmissionCreateRequestData `json:"data"`
}

// AssertBetaAppReviewSubmissionCreateRequestRequired checks if the required fields are not zero-ed
func AssertBetaAppReviewSubmissionCreateRequestRequired(obj BetaAppReviewSubmissionCreateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertBetaAppReviewSubmissionCreateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertBetaAppReviewSubmissionCreateRequestConstraints checks if the values respects the defined constraints
func AssertBetaAppReviewSubmissionCreateRequestConstraints(obj BetaAppReviewSubmissionCreateRequest) error {
	return nil
}
