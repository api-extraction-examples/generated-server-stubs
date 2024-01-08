/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BetaAppLocalizationUpdateRequest struct {

	Data BetaAppLocalizationUpdateRequestData `json:"data"`
}

// AssertBetaAppLocalizationUpdateRequestRequired checks if the required fields are not zero-ed
func AssertBetaAppLocalizationUpdateRequestRequired(obj BetaAppLocalizationUpdateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertBetaAppLocalizationUpdateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertBetaAppLocalizationUpdateRequestConstraints checks if the values respects the defined constraints
func AssertBetaAppLocalizationUpdateRequestConstraints(obj BetaAppLocalizationUpdateRequest) error {
	return nil
}