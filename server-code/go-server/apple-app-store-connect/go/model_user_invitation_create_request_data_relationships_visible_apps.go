/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type UserInvitationCreateRequestDataRelationshipsVisibleApps struct {

	Data []AppEncryptionDeclarationRelationshipsAppData `json:"data,omitempty"`
}

// AssertUserInvitationCreateRequestDataRelationshipsVisibleAppsRequired checks if the required fields are not zero-ed
func AssertUserInvitationCreateRequestDataRelationshipsVisibleAppsRequired(obj UserInvitationCreateRequestDataRelationshipsVisibleApps) error {
	for _, el := range obj.Data {
		if err := AssertAppEncryptionDeclarationRelationshipsAppDataRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertUserInvitationCreateRequestDataRelationshipsVisibleAppsConstraints checks if the values respects the defined constraints
func AssertUserInvitationCreateRequestDataRelationshipsVisibleAppsConstraints(obj UserInvitationCreateRequestDataRelationshipsVisibleApps) error {
	return nil
}
