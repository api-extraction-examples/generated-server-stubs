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




// NewUserDetails - The user details.
type NewUserDetails struct {

	// Deprecated, do not use.
	ApplicationKeys []string `json:"applicationKeys,omitempty"`

	// This property is no longer available. If the user has an Atlassian account, their display name is not changed. If the user does not have an Atlassian account, they are sent an email asking them set up an account.
	DisplayName string `json:"displayName,omitempty"`

	// The email address for the user.
	EmailAddress string `json:"emailAddress"`

	// This property is no longer available. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
	Key string `json:"key,omitempty"`

	// This property is no longer available. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
	Name string `json:"name,omitempty"`

	// This property is no longer available. If the user has an Atlassian account, their password is not changed. If the user does not have an Atlassian account, they are sent an email asking them set up an account.
	Password string `json:"password,omitempty"`

	// Products the new user has access to. Valid products are: jira-core, jira-servicedesk, jira-product-discovery, jira-software. If left empty, the user will get default product access. To create a user without product access, set this field to be an empty array.
	Products []string `json:"products,omitempty"`

	// The URL of the user.
	Self string `json:"self,omitempty"`
}

// AssertNewUserDetailsRequired checks if the required fields are not zero-ed
func AssertNewUserDetailsRequired(obj NewUserDetails) error {
	elements := map[string]interface{}{
		"emailAddress": obj.EmailAddress,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertNewUserDetailsConstraints checks if the values respects the defined constraints
func AssertNewUserDetailsConstraints(obj NewUserDetails) error {
	return nil
}