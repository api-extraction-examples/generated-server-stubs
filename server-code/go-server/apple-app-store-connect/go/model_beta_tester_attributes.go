/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BetaTesterAttributes struct {

	Email string `json:"email,omitempty"`

	FirstName string `json:"firstName,omitempty"`

	InviteType BetaInviteType `json:"inviteType,omitempty"`

	LastName string `json:"lastName,omitempty"`
}

// AssertBetaTesterAttributesRequired checks if the required fields are not zero-ed
func AssertBetaTesterAttributesRequired(obj BetaTesterAttributes) error {
	return nil
}

// AssertBetaTesterAttributesConstraints checks if the values respects the defined constraints
func AssertBetaTesterAttributesConstraints(obj BetaTesterAttributes) error {
	return nil
}
