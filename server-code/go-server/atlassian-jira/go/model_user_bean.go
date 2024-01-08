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




type UserBean struct {

	// The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
	AccountId string `json:"accountId,omitempty"`

	// Whether the user is active.
	Active bool `json:"active,omitempty"`

	AvatarUrls UserBeanAvatarUrls `json:"avatarUrls,omitempty"`

	// The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
	DisplayName string `json:"displayName,omitempty"`

	// This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The key of the user.
	Key string `json:"key,omitempty"`

	// This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The username of the user.
	Name string `json:"name,omitempty"`

	// The URL of the user.
	Self string `json:"self,omitempty"`
}

// AssertUserBeanRequired checks if the required fields are not zero-ed
func AssertUserBeanRequired(obj UserBean) error {
	if err := AssertUserBeanAvatarUrlsRequired(obj.AvatarUrls); err != nil {
		return err
	}
	return nil
}

// AssertUserBeanConstraints checks if the values respects the defined constraints
func AssertUserBeanConstraints(obj UserBean) error {
	return nil
}
