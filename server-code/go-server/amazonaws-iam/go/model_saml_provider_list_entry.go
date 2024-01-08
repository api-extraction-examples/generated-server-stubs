/*
 * AWS Identity and Access Management
 *
 * <fullname>Identity and Access Management</fullname> <p>Identity and Access Management (IAM) is a web service for securely controlling access to Amazon Web Services services. With IAM, you can centrally manage users, security credentials such as access keys, and permissions that control which Amazon Web Services resources users and applications can access. For more information about IAM, see <a href=\"http://aws.amazon.com/iam/\">Identity and Access Management (IAM)</a> and the <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/\">Identity and Access Management User Guide</a>.</p>
 *
 * API version: 2010-05-08
 * Contact: mike.ralphson@gmail.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"time"
)



// SamlProviderListEntry - Contains the list of SAML providers for this account.
type SamlProviderListEntry struct {

	Arn string `json:"Arn,omitempty"`

	ValidUntil time.Time `json:"ValidUntil,omitempty"`

	CreateDate time.Time `json:"CreateDate,omitempty"`
}

// AssertSamlProviderListEntryRequired checks if the required fields are not zero-ed
func AssertSamlProviderListEntryRequired(obj SamlProviderListEntry) error {
	if err := AssertstringRequired(obj.Arn); err != nil {
		return err
	}
	if err := Asserttime.TimeRequired(obj.ValidUntil); err != nil {
		return err
	}
	if err := Asserttime.TimeRequired(obj.CreateDate); err != nil {
		return err
	}
	return nil
}

// AssertSamlProviderListEntryConstraints checks if the values respects the defined constraints
func AssertSamlProviderListEntryConstraints(obj SamlProviderListEntry) error {
	return nil
}
