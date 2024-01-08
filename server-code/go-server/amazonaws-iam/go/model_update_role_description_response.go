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




type UpdateRoleDescriptionResponse struct {

	Role UpdateRoleDescriptionResponseRole `json:"Role,omitempty"`
}

// AssertUpdateRoleDescriptionResponseRequired checks if the required fields are not zero-ed
func AssertUpdateRoleDescriptionResponseRequired(obj UpdateRoleDescriptionResponse) error {
	if err := AssertUpdateRoleDescriptionResponseRoleRequired(obj.Role); err != nil {
		return err
	}
	return nil
}

// AssertUpdateRoleDescriptionResponseConstraints checks if the values respects the defined constraints
func AssertUpdateRoleDescriptionResponseConstraints(obj UpdateRoleDescriptionResponse) error {
	return nil
}
