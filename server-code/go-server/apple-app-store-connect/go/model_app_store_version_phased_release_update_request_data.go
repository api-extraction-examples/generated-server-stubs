/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreVersionPhasedReleaseUpdateRequestData struct {

	Attributes AppStoreVersionPhasedReleaseCreateRequestDataAttributes `json:"attributes,omitempty"`

	Id string `json:"id"`

	Type string `json:"type"`
}

// AssertAppStoreVersionPhasedReleaseUpdateRequestDataRequired checks if the required fields are not zero-ed
func AssertAppStoreVersionPhasedReleaseUpdateRequestDataRequired(obj AppStoreVersionPhasedReleaseUpdateRequestData) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppStoreVersionPhasedReleaseCreateRequestDataAttributesRequired(obj.Attributes); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreVersionPhasedReleaseUpdateRequestDataConstraints checks if the values respects the defined constraints
func AssertAppStoreVersionPhasedReleaseUpdateRequestDataConstraints(obj AppStoreVersionPhasedReleaseUpdateRequestData) error {
	return nil
}
