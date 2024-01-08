/*
 * Dealer
 *
 * The Dealer API provides Dealer search functions.
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// SelfLink - self links
type SelfLink struct {

	Self Link `json:"self,omitempty"`
}

// AssertSelfLinkRequired checks if the required fields are not zero-ed
func AssertSelfLinkRequired(obj SelfLink) error {
	if err := AssertLinkRequired(obj.Self); err != nil {
		return err
	}
	return nil
}

// AssertSelfLinkConstraints checks if the values respects the defined constraints
func AssertSelfLinkConstraints(obj SelfLink) error {
	return nil
}