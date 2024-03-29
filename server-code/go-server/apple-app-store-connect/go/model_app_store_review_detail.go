/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppStoreReviewDetail struct {

	Attributes AppStoreReviewDetailAttributes `json:"attributes,omitempty"`

	Id string `json:"id"`

	Links ResourceLinks `json:"links"`

	Relationships AppStoreReviewDetailRelationships `json:"relationships,omitempty"`

	Type string `json:"type"`
}

// AssertAppStoreReviewDetailRequired checks if the required fields are not zero-ed
func AssertAppStoreReviewDetailRequired(obj AppStoreReviewDetail) error {
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

	if err := AssertAppStoreReviewDetailAttributesRequired(obj.Attributes); err != nil {
		return err
	}
	if err := AssertResourceLinksRequired(obj.Links); err != nil {
		return err
	}
	if err := AssertAppStoreReviewDetailRelationshipsRequired(obj.Relationships); err != nil {
		return err
	}
	return nil
}

// AssertAppStoreReviewDetailConstraints checks if the values respects the defined constraints
func AssertAppStoreReviewDetailConstraints(obj AppStoreReviewDetail) error {
	return nil
}
