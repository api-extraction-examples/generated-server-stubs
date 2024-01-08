/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type UserInvitationCreateRequestDataRelationships struct {

	VisibleApps UserInvitationCreateRequestDataRelationshipsVisibleApps `json:"visibleApps,omitempty"`
}

// AssertUserInvitationCreateRequestDataRelationshipsRequired checks if the required fields are not zero-ed
func AssertUserInvitationCreateRequestDataRelationshipsRequired(obj UserInvitationCreateRequestDataRelationships) error {
	if err := AssertUserInvitationCreateRequestDataRelationshipsVisibleAppsRequired(obj.VisibleApps); err != nil {
		return err
	}
	return nil
}

// AssertUserInvitationCreateRequestDataRelationshipsConstraints checks if the values respects the defined constraints
func AssertUserInvitationCreateRequestDataRelationshipsConstraints(obj UserInvitationCreateRequestDataRelationships) error {
	return nil
}
