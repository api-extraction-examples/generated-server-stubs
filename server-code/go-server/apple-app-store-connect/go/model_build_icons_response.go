/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BuildIconsResponse struct {

	Data []BuildIcon `json:"data"`

	Links PagedDocumentLinks `json:"links"`

	Meta PagingInformation `json:"meta,omitempty"`
}

// AssertBuildIconsResponseRequired checks if the required fields are not zero-ed
func AssertBuildIconsResponseRequired(obj BuildIconsResponse) error {
	elements := map[string]interface{}{
		"data": obj.Data,
		"links": obj.Links,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Data {
		if err := AssertBuildIconRequired(el); err != nil {
			return err
		}
	}
	if err := AssertPagedDocumentLinksRequired(obj.Links); err != nil {
		return err
	}
	if err := AssertPagingInformationRequired(obj.Meta); err != nil {
		return err
	}
	return nil
}

// AssertBuildIconsResponseConstraints checks if the values respects the defined constraints
func AssertBuildIconsResponseConstraints(obj BuildIconsResponse) error {
	return nil
}
