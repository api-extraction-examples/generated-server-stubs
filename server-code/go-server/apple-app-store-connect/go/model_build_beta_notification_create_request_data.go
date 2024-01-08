/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BuildBetaNotificationCreateRequestData struct {

	Relationships BetaAppReviewSubmissionCreateRequestDataRelationships `json:"relationships"`

	Type string `json:"type"`
}

// AssertBuildBetaNotificationCreateRequestDataRequired checks if the required fields are not zero-ed
func AssertBuildBetaNotificationCreateRequestDataRequired(obj BuildBetaNotificationCreateRequestData) error {
	elements := map[string]interface{}{
		"relationships": obj.Relationships,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertBetaAppReviewSubmissionCreateRequestDataRelationshipsRequired(obj.Relationships); err != nil {
		return err
	}
	return nil
}

// AssertBuildBetaNotificationCreateRequestDataConstraints checks if the values respects the defined constraints
func AssertBuildBetaNotificationCreateRequestDataConstraints(obj BuildBetaNotificationCreateRequestData) error {
	return nil
}
