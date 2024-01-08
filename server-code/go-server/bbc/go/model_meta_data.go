/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type MetaData struct {

	Miscellaneous Miscellaneous `json:"miscellaneous"`

	Origin Origin `json:"origin"`

	ProgrammeType string `json:"programme_type"`

	Type string `json:"type"`
}

// AssertMetaDataRequired checks if the required fields are not zero-ed
func AssertMetaDataRequired(obj MetaData) error {
	elements := map[string]interface{}{
		"miscellaneous": obj.Miscellaneous,
		"origin": obj.Origin,
		"programme_type": obj.ProgrammeType,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertMiscellaneousRequired(obj.Miscellaneous); err != nil {
		return err
	}
	if err := AssertOriginRequired(obj.Origin); err != nil {
		return err
	}
	return nil
}

// AssertMetaDataConstraints checks if the values respects the defined constraints
func AssertMetaDataConstraints(obj MetaData) error {
	return nil
}