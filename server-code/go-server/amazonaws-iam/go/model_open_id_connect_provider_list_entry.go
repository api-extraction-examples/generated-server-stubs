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




// OpenIdConnectProviderListEntry - Contains the Amazon Resource Name (ARN) for an IAM OpenID Connect provider.
type OpenIdConnectProviderListEntry struct {

	// <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>
	Arn string `json:"Arn,omitempty"`
}

// AssertOpenIdConnectProviderListEntryRequired checks if the required fields are not zero-ed
func AssertOpenIdConnectProviderListEntryRequired(obj OpenIdConnectProviderListEntry) error {
	return nil
}

// AssertOpenIdConnectProviderListEntryConstraints checks if the values respects the defined constraints
func AssertOpenIdConnectProviderListEntryConstraints(obj OpenIdConnectProviderListEntry) error {
	return nil
}