/*
 * Open Banking - Payments initiation service
 *
 * Open Banking - Payments initiation service
 *
 * API version: 1.16.0
 * Contact: apisupport@mastercard.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PostAspspsParamsBody struct {

	// Filter by country code (ISO 3166 Alpha 2), exact match pattern
	Country string `json:"country,omitempty"`

	// Filter by internal id of ASPSP, exact match pattern
	Id string `json:"id,omitempty"`

	// Filter by name of ASPSP, contains pattern
	Name string `json:"name,omitempty"`

	RequestInfo PostAspspsParamsBodyRequestInfo `json:"requestInfo"`

	// Specifies what additional fields for ASPSP object should be included in response
	ReturnAdditionalData []AdditionalDataField `json:"returnAdditionalData,omitempty"`
}

// AssertPostAspspsParamsBodyRequired checks if the required fields are not zero-ed
func AssertPostAspspsParamsBodyRequired(obj PostAspspsParamsBody) error {
	elements := map[string]interface{}{
		"requestInfo": obj.RequestInfo,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertPostAspspsParamsBodyRequestInfoRequired(obj.RequestInfo); err != nil {
		return err
	}
	return nil
}

// AssertPostAspspsParamsBodyConstraints checks if the values respects the defined constraints
func AssertPostAspspsParamsBodyConstraints(obj PostAspspsParamsBody) error {
	return nil
}
