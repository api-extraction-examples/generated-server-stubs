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



type VirtualMfaDeviceUser struct {

	Path string `json:"Path"`

	UserName string `json:"UserName"`

	UserId string `json:"UserId"`

	Arn string `json:"Arn"`

	CreateDate time.Time `json:"CreateDate"`

	PasswordLastUsed time.Time `json:"PasswordLastUsed,omitempty"`

	PermissionsBoundary UserPermissionsBoundary `json:"PermissionsBoundary,omitempty"`

	Tags Array `json:"Tags,omitempty"`
}

// AssertVirtualMfaDeviceUserRequired checks if the required fields are not zero-ed
func AssertVirtualMfaDeviceUserRequired(obj VirtualMfaDeviceUser) error {
	elements := map[string]interface{}{
		"Path": obj.Path,
		"UserName": obj.UserName,
		"UserId": obj.UserId,
		"Arn": obj.Arn,
		"CreateDate": obj.CreateDate,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertstringRequired(obj.Path); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.UserName); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.UserId); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.Arn); err != nil {
		return err
	}
	if err := Asserttime.TimeRequired(obj.CreateDate); err != nil {
		return err
	}
	if err := Asserttime.TimeRequired(obj.PasswordLastUsed); err != nil {
		return err
	}
	if err := AssertUserPermissionsBoundaryRequired(obj.PermissionsBoundary); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.Tags); err != nil {
		return err
	}
	return nil
}

// AssertVirtualMfaDeviceUserConstraints checks if the values respects the defined constraints
func AssertVirtualMfaDeviceUserConstraints(obj VirtualMfaDeviceUser) error {
	return nil
}
