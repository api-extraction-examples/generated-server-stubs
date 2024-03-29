/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BuildBetaNotification struct {

	Id string `json:"id"`

	Links ResourceLinks `json:"links"`

	Type string `json:"type"`
}

// AssertBuildBetaNotificationRequired checks if the required fields are not zero-ed
func AssertBuildBetaNotificationRequired(obj BuildBetaNotification) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"links": obj.Links,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertResourceLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertBuildBetaNotificationConstraints checks if the values respects the defined constraints
func AssertBuildBetaNotificationConstraints(obj BuildBetaNotification) error {
	return nil
}
