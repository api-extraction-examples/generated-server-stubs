/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type NetworkTitles struct {

	LongTitle string `json:"long_title"`

	ShortTitle string `json:"short_title"`

	Type string `json:"type"`
}

// AssertNetworkTitlesRequired checks if the required fields are not zero-ed
func AssertNetworkTitlesRequired(obj NetworkTitles) error {
	elements := map[string]interface{}{
		"long_title": obj.LongTitle,
		"short_title": obj.ShortTitle,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertNetworkTitlesConstraints checks if the values respects the defined constraints
func AssertNetworkTitlesConstraints(obj NetworkTitles) error {
	return nil
}
