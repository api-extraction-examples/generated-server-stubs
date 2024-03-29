/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BetaGroupCreateRequestDataAttributes struct {

	FeedbackEnabled bool `json:"feedbackEnabled,omitempty"`

	Name string `json:"name"`

	PublicLinkEnabled bool `json:"publicLinkEnabled,omitempty"`

	PublicLinkLimit int32 `json:"publicLinkLimit,omitempty"`

	PublicLinkLimitEnabled bool `json:"publicLinkLimitEnabled,omitempty"`
}

// AssertBetaGroupCreateRequestDataAttributesRequired checks if the required fields are not zero-ed
func AssertBetaGroupCreateRequestDataAttributesRequired(obj BetaGroupCreateRequestDataAttributes) error {
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

// AssertBetaGroupCreateRequestDataAttributesConstraints checks if the values respects the defined constraints
func AssertBetaGroupCreateRequestDataAttributesConstraints(obj BetaGroupCreateRequestDataAttributes) error {
	return nil
}
