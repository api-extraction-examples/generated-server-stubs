/*
 * Bills API
 *
 * API to get and search for information regarding Bills, their stages, associated amendments and publications.
 *
 * API version: v1
 * Contact: softwareengineering@parliament.uk
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type Member struct {

	House House `json:"house,omitempty"`

	MemberFrom *string `json:"memberFrom,omitempty"`

	MemberId int32 `json:"memberId,omitempty"`

	MemberPage *string `json:"memberPage,omitempty"`

	MemberPhoto *string `json:"memberPhoto,omitempty"`

	Name *string `json:"name,omitempty"`

	Party *string `json:"party,omitempty"`

	PartyColour *string `json:"partyColour,omitempty"`
}

// AssertMemberRequired checks if the required fields are not zero-ed
func AssertMemberRequired(obj Member) error {
	return nil
}

// AssertMemberConstraints checks if the values respects the defined constraints
func AssertMemberConstraints(obj Member) error {
	return nil
}