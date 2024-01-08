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




type CreateRoleRequest struct {

	Path string `json:"Path,omitempty"`

	RoleName string `json:"RoleName"`

	AssumeRolePolicyDocument string `json:"AssumeRolePolicyDocument"`

	Description string `json:"Description,omitempty"`

	MaxSessionDuration int32 `json:"MaxSessionDuration,omitempty"`

	PermissionsBoundary string `json:"PermissionsBoundary,omitempty"`

	Tags Array `json:"Tags,omitempty"`
}

// AssertCreateRoleRequestRequired checks if the required fields are not zero-ed
func AssertCreateRoleRequestRequired(obj CreateRoleRequest) error {
	elements := map[string]interface{}{
		"RoleName": obj.RoleName,
		"AssumeRolePolicyDocument": obj.AssumeRolePolicyDocument,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertstringRequired(obj.Path); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.RoleName); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.AssumeRolePolicyDocument); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.Description); err != nil {
		return err
	}
	if err := Assertint32Required(obj.MaxSessionDuration); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.PermissionsBoundary); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.Tags); err != nil {
		return err
	}
	return nil
}

// AssertCreateRoleRequestConstraints checks if the values respects the defined constraints
func AssertCreateRoleRequestConstraints(obj CreateRoleRequest) error {
	return nil
}