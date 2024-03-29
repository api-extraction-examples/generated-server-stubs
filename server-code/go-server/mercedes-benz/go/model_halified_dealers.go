/*
 * Dealer
 *
 * The Dealer API provides Dealer search functions.
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// HalifiedDealers - dealer with navigation links.
type HalifiedDealers struct {

	Links DefaultLinks `json:"_links"`

	// dealers
	Dealers []Dealer `json:"dealers,omitempty"`
}

// AssertHalifiedDealersRequired checks if the required fields are not zero-ed
func AssertHalifiedDealersRequired(obj HalifiedDealers) error {
	elements := map[string]interface{}{
		"_links": obj.Links,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertDefaultLinksRequired(obj.Links); err != nil {
		return err
	}
	for _, el := range obj.Dealers {
		if err := AssertDealerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertHalifiedDealersConstraints checks if the values respects the defined constraints
func AssertHalifiedDealersConstraints(obj HalifiedDealers) error {
	return nil
}
