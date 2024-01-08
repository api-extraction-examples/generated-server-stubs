/*
 * Dealer
 *
 * The Dealer API provides Dealer search functions.
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// Link - the representation of a link
type Link struct {

	// the target of the link
	Href string `json:"href"`
}

// AssertLinkRequired checks if the required fields are not zero-ed
func AssertLinkRequired(obj Link) error {
	elements := map[string]interface{}{
		"href": obj.Href,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertLinkConstraints checks if the values respects the defined constraints
func AssertLinkConstraints(obj Link) error {
	return nil
}
