/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreVersionSubmission struct {

	Id string `json:"id"`

	Links ResourceLinks `json:"links"`

	Relationships AppStoreVersionSubmissionRelationships `json:"relationships,omitempty"`

	Type string `json:"type"`
}

// AssertAppStoreVersionSubmissionRequired checks if the required fields are not zero-ed
func AssertAppStoreVersionSubmissionRequired(obj AppStoreVersionSubmission) error {
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
	if err := AssertAppStoreVersionSubmissionRelationshipsRequired(obj.Relationships); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreVersionSubmissionConstraints checks if the values respects the defined constraints
func AssertAppStoreVersionSubmissionConstraints(obj AppStoreVersionSubmission) error {
	return nil
}
