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



// LoginProfile - <p>Contains the user name and password create date for a user.</p> <p> This data type is used as a response element in the <a>CreateLoginProfile</a> and <a>GetLoginProfile</a> operations. </p>
type LoginProfile struct {

	UserName string `json:"UserName"`

	CreateDate time.Time `json:"CreateDate"`

	PasswordResetRequired bool `json:"PasswordResetRequired,omitempty"`
}

// AssertLoginProfileRequired checks if the required fields are not zero-ed
func AssertLoginProfileRequired(obj LoginProfile) error {
	elements := map[string]interface{}{
		"UserName": obj.UserName,
		"CreateDate": obj.CreateDate,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertstringRequired(obj.UserName); err != nil {
		return err
	}
	if err := Asserttime.TimeRequired(obj.CreateDate); err != nil {
		return err
	}
	if err := AssertboolRequired(obj.PasswordResetRequired); err != nil {
		return err
	}
	return nil
}

// AssertLoginProfileConstraints checks if the values respects the defined constraints
func AssertLoginProfileConstraints(obj LoginProfile) error {
	return nil
}