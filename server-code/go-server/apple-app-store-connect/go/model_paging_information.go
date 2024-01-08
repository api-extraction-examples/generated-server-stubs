/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PagingInformation struct {

	Paging PagingInformationPaging `json:"paging"`
}

// AssertPagingInformationRequired checks if the required fields are not zero-ed
func AssertPagingInformationRequired(obj PagingInformation) error {
	elements := map[string]interface{}{
		"paging": obj.Paging,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertPagingInformationPagingRequired(obj.Paging); err != nil {
		return err
	}
	return nil
}

// AssertPagingInformationConstraints checks if the values respects the defined constraints
func AssertPagingInformationConstraints(obj PagingInformation) error {
	return nil
}
