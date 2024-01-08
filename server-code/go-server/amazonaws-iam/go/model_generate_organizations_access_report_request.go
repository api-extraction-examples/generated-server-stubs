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




type GenerateOrganizationsAccessReportRequest struct {

	EntityPath string `json:"EntityPath"`

	OrganizationsPolicyId string `json:"OrganizationsPolicyId,omitempty"`
}

// AssertGenerateOrganizationsAccessReportRequestRequired checks if the required fields are not zero-ed
func AssertGenerateOrganizationsAccessReportRequestRequired(obj GenerateOrganizationsAccessReportRequest) error {
	elements := map[string]interface{}{
		"EntityPath": obj.EntityPath,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertstringRequired(obj.EntityPath); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.OrganizationsPolicyId); err != nil {
		return err
	}
	return nil
}

// AssertGenerateOrganizationsAccessReportRequestConstraints checks if the values respects the defined constraints
func AssertGenerateOrganizationsAccessReportRequestConstraints(obj GenerateOrganizationsAccessReportRequest) error {
	return nil
}
