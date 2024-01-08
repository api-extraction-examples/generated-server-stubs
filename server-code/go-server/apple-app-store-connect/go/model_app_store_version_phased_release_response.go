/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreVersionPhasedReleaseResponse struct {

	Data AppStoreVersionPhasedRelease `json:"data"`

	Links DocumentLinks `json:"links"`
}

// AssertAppStoreVersionPhasedReleaseResponseRequired checks if the required fields are not zero-ed
func AssertAppStoreVersionPhasedReleaseResponseRequired(obj AppStoreVersionPhasedReleaseResponse) error {
	elements := map[string]interface{}{
		"data": obj.Data,
		"links": obj.Links,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppStoreVersionPhasedReleaseRequired(obj.Data); err != nil {
		return err
	}
	if err := AssertDocumentLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreVersionPhasedReleaseResponseConstraints checks if the values respects the defined constraints
func AssertAppStoreVersionPhasedReleaseResponseConstraints(obj AppStoreVersionPhasedReleaseResponse) error {
	return nil
}
