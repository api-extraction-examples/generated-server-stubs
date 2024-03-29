/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BetaTesterInvitationCreateRequestDataRelationshipsBetaTester struct {

	Data AppBetaTestersLinkagesRequestDataInner `json:"data"`
}

// AssertBetaTesterInvitationCreateRequestDataRelationshipsBetaTesterRequired checks if the required fields are not zero-ed
func AssertBetaTesterInvitationCreateRequestDataRelationshipsBetaTesterRequired(obj BetaTesterInvitationCreateRequestDataRelationshipsBetaTester) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertAppBetaTestersLinkagesRequestDataInnerRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertBetaTesterInvitationCreateRequestDataRelationshipsBetaTesterConstraints checks if the values respects the defined constraints
func AssertBetaTesterInvitationCreateRequestDataRelationshipsBetaTesterConstraints(obj BetaTesterInvitationCreateRequestDataRelationshipsBetaTester) error {
	return nil
}
