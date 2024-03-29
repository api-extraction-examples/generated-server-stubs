/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type Service struct {

	Active bool `json:"active"`

	Coverage string `json:"coverage"`

	DateRanges []DateRange `json:"date_ranges"`

	Default bool `json:"default"`

	DefaultLanguage string `json:"default_language"`

	Id string `json:"id"`

	Region string `json:"region"`

	ShortTitle string `json:"short_title"`

	Title string `json:"title"`

	Type string `json:"type"`
}

// AssertServiceRequired checks if the required fields are not zero-ed
func AssertServiceRequired(obj Service) error {
	elements := map[string]interface{}{
		"active": obj.Active,
		"coverage": obj.Coverage,
		"date_ranges": obj.DateRanges,
		"default": obj.Default,
		"default_language": obj.DefaultLanguage,
		"id": obj.Id,
		"region": obj.Region,
		"short_title": obj.ShortTitle,
		"title": obj.Title,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.DateRanges {
		if err := AssertDateRangeRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertServiceConstraints checks if the values respects the defined constraints
func AssertServiceConstraints(obj Service) error {
	return nil
}
