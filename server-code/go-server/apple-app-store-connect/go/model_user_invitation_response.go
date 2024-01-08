/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type UserInvitationResponse struct {

	Data UserInvitation `json:"data"`

	Included []App `json:"included,omitempty"`

	Links DocumentLinks `json:"links"`
}

// AssertUserInvitationResponseRequired checks if the required fields are not zero-ed
func AssertUserInvitationResponseRequired(obj UserInvitationResponse) error {
	elements := map[string]interface{}{
		"data": obj.Data,
		"links": obj.Links,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertUserInvitationRequired(obj.Data); err != nil {
		return err
	}
	for _, el := range obj.Included {
		if err := AssertAppRequired(el); err != nil {
			return err
		}
	}
	if err := AssertDocumentLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertUserInvitationResponseConstraints checks if the values respects the defined constraints
func AssertUserInvitationResponseConstraints(obj UserInvitationResponse) error {
	return nil
}
