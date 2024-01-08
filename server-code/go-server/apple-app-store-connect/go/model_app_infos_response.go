/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppInfosResponse struct {

	Data []AppInfo `json:"data"`

	Included []AppInfoResponseIncludedInner `json:"included,omitempty"`

	Links PagedDocumentLinks `json:"links"`

	Meta PagingInformation `json:"meta,omitempty"`
}

// AssertAppInfosResponseRequired checks if the required fields are not zero-ed
func AssertAppInfosResponseRequired(obj AppInfosResponse) error {
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
		if err := AssertAppInfoRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Included {
		if err := AssertAppInfoResponseIncludedInnerRequired(el); err != nil {
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

// AssertAppInfosResponseConstraints checks if the values respects the defined constraints
func AssertAppInfosResponseConstraints(obj AppInfosResponse) error {
	return nil
}
