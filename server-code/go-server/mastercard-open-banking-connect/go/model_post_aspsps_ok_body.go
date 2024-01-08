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




type PostAspspsOkBody struct {

	Aspsps []PostAspspsOkBodyAspspsItems `json:"aspsps,omitempty"`

	OriginalRequestInfo PostAspspsOkBodyOriginalRequestInfo `json:"originalRequestInfo"`
}

// AssertPostAspspsOkBodyRequired checks if the required fields are not zero-ed
func AssertPostAspspsOkBodyRequired(obj PostAspspsOkBody) error {
	elements := map[string]interface{}{
		"originalRequestInfo": obj.OriginalRequestInfo,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Aspsps {
		if err := AssertPostAspspsOkBodyAspspsItemsRequired(el); err != nil {
			return err
		}
	}
	if err := AssertPostAspspsOkBodyOriginalRequestInfoRequired(obj.OriginalRequestInfo); err != nil {
		return err
	}
	return nil
}

// AssertPostAspspsOkBodyConstraints checks if the values respects the defined constraints
func AssertPostAspspsOkBodyConstraints(obj PostAspspsOkBody) error {
	return nil
}