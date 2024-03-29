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




// GenerateCredentialReportResponse - Contains the response to a successful <a>GenerateCredentialReport</a> request. 
type GenerateCredentialReportResponse struct {

	State ReportStateType `json:"State,omitempty"`

	Description string `json:"Description,omitempty"`
}

// AssertGenerateCredentialReportResponseRequired checks if the required fields are not zero-ed
func AssertGenerateCredentialReportResponseRequired(obj GenerateCredentialReportResponse) error {
	if err := AssertReportStateTypeRequired(obj.State); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.Description); err != nil {
		return err
	}
	return nil
}

// AssertGenerateCredentialReportResponseConstraints checks if the values respects the defined constraints
func AssertGenerateCredentialReportResponseConstraints(obj GenerateCredentialReportResponse) error {
	return nil
}
