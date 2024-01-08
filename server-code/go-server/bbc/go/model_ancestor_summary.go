/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AncestorSummary struct {

	AncestorType string `json:"ancestor_type"`

	Id string `json:"id"`

	Images []Image `json:"images"`

	Titles AncestorTitles `json:"titles"`

	Type string `json:"type"`
}

// AssertAncestorSummaryRequired checks if the required fields are not zero-ed
func AssertAncestorSummaryRequired(obj AncestorSummary) error {
	elements := map[string]interface{}{
		"ancestor_type": obj.AncestorType,
		"id": obj.Id,
		"images": obj.Images,
		"titles": obj.Titles,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Images {
		if err := AssertImageRequired(el); err != nil {
			return err
		}
	}
	if err := AssertAncestorTitlesRequired(obj.Titles); err != nil {
		return err
	}
	return nil
}

// AssertAncestorSummaryConstraints checks if the values respects the defined constraints
func AssertAncestorSummaryConstraints(obj AncestorSummary) error {
	return nil
}