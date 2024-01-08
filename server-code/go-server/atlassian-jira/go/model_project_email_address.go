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




// ProjectEmailAddress - A project's sender email address.
type ProjectEmailAddress struct {

	// The email address.
	EmailAddress string `json:"emailAddress,omitempty"`

	// When using a custom domain, the status of the email address.
	EmailAddressStatus []string `json:"emailAddressStatus,omitempty"`
}

// AssertProjectEmailAddressRequired checks if the required fields are not zero-ed
func AssertProjectEmailAddressRequired(obj ProjectEmailAddress) error {
	return nil
}

// AssertProjectEmailAddressConstraints checks if the values respects the defined constraints
func AssertProjectEmailAddressConstraints(obj ProjectEmailAddress) error {
	return nil
}
