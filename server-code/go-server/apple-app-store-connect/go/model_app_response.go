/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppResponse struct {

	Data App `json:"data"`

	Included []AppResponseIncludedInner `json:"included,omitempty"`

	Links DocumentLinks `json:"links"`
}

// AssertAppResponseRequired checks if the required fields are not zero-ed
func AssertAppResponseRequired(obj AppResponse) error {
	elements := map[string]interface{}{
		"data": obj.Data,
		"links": obj.Links,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppRequired(obj.Data); err != nil {
		return err
	}
	for _, el := range obj.Included {
		if err := AssertAppResponseIncludedInnerRequired(el); err != nil {
			return err
		}
	}
	if err := AssertDocumentLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertAppResponseConstraints checks if the values respects the defined constraints
func AssertAppResponseConstraints(obj AppResponse) error {
	return nil
}
