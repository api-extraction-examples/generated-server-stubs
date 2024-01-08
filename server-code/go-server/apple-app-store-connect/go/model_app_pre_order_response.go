/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPreOrderResponse struct {

	Data AppPreOrder `json:"data"`

	Links DocumentLinks `json:"links"`
}

// AssertAppPreOrderResponseRequired checks if the required fields are not zero-ed
func AssertAppPreOrderResponseRequired(obj AppPreOrderResponse) error {
	elements := map[string]interface{}{
		"data": obj.Data,
		"links": obj.Links,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppPreOrderRequired(obj.Data); err != nil {
		return err
	}
	if err := AssertDocumentLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertAppPreOrderResponseConstraints checks if the values respects the defined constraints
func AssertAppPreOrderResponseConstraints(obj AppPreOrderResponse) error {
	return nil
}
