/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PersonalisedMusicActivity struct {

	Action string `json:"action"`

	Activity string `json:"activity"`

	AddedAt string `json:"added_at"`

	Data []PersonalisedMusicData `json:"data"`

	Domain string `json:"domain"`

	Id string `json:"id"`

	MetaData PersonalisedMusicMetaData `json:"meta_data"`

	Type string `json:"type"`

	Urn string `json:"urn"`
}

// AssertPersonalisedMusicActivityRequired checks if the required fields are not zero-ed
func AssertPersonalisedMusicActivityRequired(obj PersonalisedMusicActivity) error {
	elements := map[string]interface{}{
		"action": obj.Action,
		"activity": obj.Activity,
		"added_at": obj.AddedAt,
		"data": obj.Data,
		"domain": obj.Domain,
		"id": obj.Id,
		"meta_data": obj.MetaData,
		"type": obj.Type,
		"urn": obj.Urn,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Data {
		if err := AssertPersonalisedMusicDataRequired(el); err != nil {
			return err
		}
	}
	if err := AssertPersonalisedMusicMetaDataRequired(obj.MetaData); err != nil {
		return err
	}
	return nil
}

// AssertPersonalisedMusicActivityConstraints checks if the values respects the defined constraints
func AssertPersonalisedMusicActivityConstraints(obj PersonalisedMusicActivity) error {
	return nil
}