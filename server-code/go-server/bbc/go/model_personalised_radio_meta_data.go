/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PersonalisedRadioMetaData struct {

	Key string `json:"key"`
}

// AssertPersonalisedRadioMetaDataRequired checks if the required fields are not zero-ed
func AssertPersonalisedRadioMetaDataRequired(obj PersonalisedRadioMetaData) error {
	elements := map[string]interface{}{
		"key": obj.Key,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPersonalisedRadioMetaDataConstraints checks if the values respects the defined constraints
func AssertPersonalisedRadioMetaDataConstraints(obj PersonalisedRadioMetaData) error {
	return nil
}