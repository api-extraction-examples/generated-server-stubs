/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PersonalisedMusicBatchRequest struct {

	Action string `json:"action"`

	AddedAt string `json:"added_at,omitempty"`

	Context string `json:"context,omitempty"`

	Domain string `json:"domain"`

	Id string `json:"id"`

	MetaData PersonalisedMusicMetaData `json:"meta_data,omitempty"`

	Type string `json:"type"`
}

// AssertPersonalisedMusicBatchRequestRequired checks if the required fields are not zero-ed
func AssertPersonalisedMusicBatchRequestRequired(obj PersonalisedMusicBatchRequest) error {
	elements := map[string]interface{}{
		"action": obj.Action,
		"domain": obj.Domain,
		"id": obj.Id,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertPersonalisedMusicMetaDataRequired(obj.MetaData); err != nil {
		return err
	}
	return nil
}

// AssertPersonalisedMusicBatchRequestConstraints checks if the values respects the defined constraints
func AssertPersonalisedMusicBatchRequestConstraints(obj PersonalisedMusicBatchRequest) error {
	return nil
}