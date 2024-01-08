/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PersonalisedCategoriesResponse struct {

	Schema string `json:"$schema"`

	Limit int32 `json:"limit"`

	Offset int32 `json:"offset"`

	Total int32 `json:"total"`
}

// AssertPersonalisedCategoriesResponseRequired checks if the required fields are not zero-ed
func AssertPersonalisedCategoriesResponseRequired(obj PersonalisedCategoriesResponse) error {
	elements := map[string]interface{}{
		"$schema": obj.Schema,
		"limit": obj.Limit,
		"offset": obj.Offset,
		"total": obj.Total,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPersonalisedCategoriesResponseConstraints checks if the values respects the defined constraints
func AssertPersonalisedCategoriesResponseConstraints(obj PersonalisedCategoriesResponse) error {
	return nil
}
