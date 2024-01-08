/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppInfoLocalizationUpdateRequest struct {

	Data AppInfoLocalizationUpdateRequestData `json:"data"`
}

// AssertAppInfoLocalizationUpdateRequestRequired checks if the required fields are not zero-ed
func AssertAppInfoLocalizationUpdateRequestRequired(obj AppInfoLocalizationUpdateRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppInfoLocalizationUpdateRequestDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertAppInfoLocalizationUpdateRequestConstraints checks if the values respects the defined constraints
func AssertAppInfoLocalizationUpdateRequestConstraints(obj AppInfoLocalizationUpdateRequest) error {
	return nil
}
