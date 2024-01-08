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




type ResourceSpecificResultPermissionsBoundaryDecisionDetail struct {

	AllowedByPermissionsBoundary bool `json:"AllowedByPermissionsBoundary,omitempty"`
}

// AssertResourceSpecificResultPermissionsBoundaryDecisionDetailRequired checks if the required fields are not zero-ed
func AssertResourceSpecificResultPermissionsBoundaryDecisionDetailRequired(obj ResourceSpecificResultPermissionsBoundaryDecisionDetail) error {
	if err := AssertboolRequired(obj.AllowedByPermissionsBoundary); err != nil {
		return err
	}
	return nil
}

// AssertResourceSpecificResultPermissionsBoundaryDecisionDetailConstraints checks if the values respects the defined constraints
func AssertResourceSpecificResultPermissionsBoundaryDecisionDetailConstraints(obj ResourceSpecificResultPermissionsBoundaryDecisionDetail) error {
	return nil
}
