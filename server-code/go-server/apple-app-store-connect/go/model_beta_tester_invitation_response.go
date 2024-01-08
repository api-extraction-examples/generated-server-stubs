/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BetaTesterInvitationResponse struct {

	Data BetaTesterInvitation `json:"data"`

	Links DocumentLinks `json:"links"`
}

// AssertBetaTesterInvitationResponseRequired checks if the required fields are not zero-ed
func AssertBetaTesterInvitationResponseRequired(obj BetaTesterInvitationResponse) error {
	elements := map[string]interface{}{
		"data": obj.Data,
		"links": obj.Links,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertBetaTesterInvitationRequired(obj.Data); err != nil {
		return err
	}
	if err := AssertDocumentLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertBetaTesterInvitationResponseConstraints checks if the values respects the defined constraints
func AssertBetaTesterInvitationResponseConstraints(obj BetaTesterInvitationResponse) error {
	return nil
}