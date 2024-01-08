/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// CommentUpdateAuthor - The ID of the user who updated the comment last.
type CommentUpdateAuthor struct {

	// The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
	AccountId string `json:"accountId,omitempty"`

	// The type of account represented by this user. This will be one of 'atlassian' (normal users), 'app' (application user) or 'customer' (Jira Service Desk customer user)
	AccountType string `json:"accountType,omitempty"`

	// Whether the user is active.
	Active bool `json:"active,omitempty"`

	AvatarUrls UserAvatarUrls `json:"avatarUrls,omitempty"`

	// The display name of the user. Depending on the user’s privacy settings, this may return an alternative value.
	DisplayName string `json:"displayName,omitempty"`

	// The email address of the user. Depending on the user’s privacy settings, this may be returned as null.
	EmailAddress string `json:"emailAddress,omitempty"`

	// This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
	Key string `json:"key,omitempty"`

	// This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
	Name string `json:"name,omitempty"`

	// The URL of the user.
	Self string `json:"self,omitempty"`

	// The time zone specified in the user's profile. Depending on the user’s privacy settings, this may be returned as null.
	TimeZone string `json:"timeZone,omitempty"`
}

// AssertCommentUpdateAuthorRequired checks if the required fields are not zero-ed
func AssertCommentUpdateAuthorRequired(obj CommentUpdateAuthor) error {
	if err := AssertUserAvatarUrlsRequired(obj.AvatarUrls); err != nil {
		return err
	}
	return nil
}

// AssertCommentUpdateAuthorConstraints checks if the values respects the defined constraints
func AssertCommentUpdateAuthorConstraints(obj CommentUpdateAuthor) error {
	return nil
}
