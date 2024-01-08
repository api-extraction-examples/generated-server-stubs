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



// ServiceSpecificCredential - Contains the details of a service-specific credential.
type ServiceSpecificCredential struct {

	CreateDate time.Time `json:"CreateDate"`

	ServiceName string `json:"ServiceName"`

	ServiceUserName string `json:"ServiceUserName"`

	ServicePassword string `json:"ServicePassword"`

	ServiceSpecificCredentialId string `json:"ServiceSpecificCredentialId"`

	UserName string `json:"UserName"`

	Status StatusType `json:"Status"`
}

// AssertServiceSpecificCredentialRequired checks if the required fields are not zero-ed
func AssertServiceSpecificCredentialRequired(obj ServiceSpecificCredential) error {
	elements := map[string]interface{}{
		"CreateDate": obj.CreateDate,
		"ServiceName": obj.ServiceName,
		"ServiceUserName": obj.ServiceUserName,
		"ServicePassword": obj.ServicePassword,
		"ServiceSpecificCredentialId": obj.ServiceSpecificCredentialId,
		"UserName": obj.UserName,
		"Status": obj.Status,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := Asserttime.TimeRequired(obj.CreateDate); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.ServiceName); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.ServiceUserName); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.ServicePassword); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.ServiceSpecificCredentialId); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.UserName); err != nil {
		return err
	}
	if err := AssertstatusTypeRequired(obj.Status); err != nil {
		return err
	}
	return nil
}

// AssertServiceSpecificCredentialConstraints checks if the values respects the defined constraints
func AssertServiceSpecificCredentialConstraints(obj ServiceSpecificCredential) error {
	return nil
}
