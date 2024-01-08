/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPricePointResponse struct {

	Data AppPricePoint `json:"data"`

	Included []Territory `json:"included,omitempty"`

	Links DocumentLinks `json:"links"`
}

// AssertAppPricePointResponseRequired checks if the required fields are not zero-ed
func AssertAppPricePointResponseRequired(obj AppPricePointResponse) error {
	elements := map[string]interface{}{
		"data": obj.Data,
		"links": obj.Links,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppPricePointRequired(obj.Data); err != nil {
		return err
	}
	for _, el := range obj.Included {
		if err := AssertTerritoryRequired(el); err != nil {
			return err
		}
	}
	if err := AssertDocumentLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertAppPricePointResponseConstraints checks if the values respects the defined constraints
func AssertAppPricePointResponseConstraints(obj AppPricePointResponse) error {
	return nil
}