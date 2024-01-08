/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PersonalisedRadioRequest struct {

	Action string `json:"action"`

	AddedAt string `json:"added_at,omitempty"`

	Context string `json:"context,omitempty"`

	Metadata PersonalisedRadioMetaData `json:"metadata,omitempty"`
}

// AssertPersonalisedRadioRequestRequired checks if the required fields are not zero-ed
func AssertPersonalisedRadioRequestRequired(obj PersonalisedRadioRequest) error {
	elements := map[string]interface{}{
		"action": obj.Action,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertPersonalisedRadioMetaDataRequired(obj.Metadata); err != nil {
		return err
	}
	return nil
}

// AssertPersonalisedRadioRequestConstraints checks if the values respects the defined constraints
func AssertPersonalisedRadioRequestConstraints(obj PersonalisedRadioRequest) error {
	return nil
}
