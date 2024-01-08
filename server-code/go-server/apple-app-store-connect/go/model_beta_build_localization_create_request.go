/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BetaBuildLocalizationCreateRequest struct {

	Data BetaBuildLocalizationCreateRequestData `json:"data"`
}

// AssertBetaBuildLocalizationCreateRequestRequired checks if the required fields are not zero-ed
func AssertBetaBuildLocalizationCreateRequestRequired(obj BetaBuildLocalizationCreateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertBetaBuildLocalizationCreateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertBetaBuildLocalizationCreateRequestConstraints checks if the values respects the defined constraints
func AssertBetaBuildLocalizationCreateRequestConstraints(obj BetaBuildLocalizationCreateRequest) error {
	return nil
}