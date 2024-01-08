/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type DiagnosticLogsResponse struct {

	Data []DiagnosticLog `json:"data"`

	Links PagedDocumentLinks `json:"links"`

	Meta PagingInformation `json:"meta,omitempty"`
}

// AssertDiagnosticLogsResponseRequired checks if the required fields are not zero-ed
func AssertDiagnosticLogsResponseRequired(obj DiagnosticLogsResponse) error {
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
		if err := AssertDiagnosticLogRequired(el); err != nil {
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

// AssertDiagnosticLogsResponseConstraints checks if the values respects the defined constraints
func AssertDiagnosticLogsResponseConstraints(obj DiagnosticLogsResponse) error {
	return nil
}
