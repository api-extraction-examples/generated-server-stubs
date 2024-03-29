/*
 * Dealer
 *
 * The Dealer API provides Dealer search functions.
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// DefaultLinks - default links
type DefaultLinks struct {

	Next Link `json:"next,omitempty"`

	Previous Link `json:"previous,omitempty"`

	Self Link `json:"self,omitempty"`
}

// AssertDefaultLinksRequired checks if the required fields are not zero-ed
func AssertDefaultLinksRequired(obj DefaultLinks) error {
	if err := AssertLinkRequired(obj.Next); err != nil {
		return err
	}
	if err := AssertLinkRequired(obj.Previous); err != nil {
		return err
	}
	if err := AssertLinkRequired(obj.Self); err != nil {
		return err
	}
	return nil
}

// AssertDefaultLinksConstraints checks if the values respects the defined constraints
func AssertDefaultLinksConstraints(obj DefaultLinks) error {
	return nil
}
