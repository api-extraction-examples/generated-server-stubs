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



type CreateAccessKeyResponseAccessKey struct {

	UserName string `json:"UserName"`

	AccessKeyId string `json:"AccessKeyId"`

	Status StatusType `json:"Status"`

	SecretAccessKey string `json:"SecretAccessKey"`

	CreateDate time.Time `json:"CreateDate,omitempty"`
}

// AssertCreateAccessKeyResponseAccessKeyRequired checks if the required fields are not zero-ed
func AssertCreateAccessKeyResponseAccessKeyRequired(obj CreateAccessKeyResponseAccessKey) error {
	elements := map[string]interface{}{
		"UserName": obj.UserName,
		"AccessKeyId": obj.AccessKeyId,
		"Status": obj.Status,
		"SecretAccessKey": obj.SecretAccessKey,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertstringRequired(obj.UserName); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.AccessKeyId); err != nil {
		return err
	}
	if err := AssertstatusTypeRequired(obj.Status); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.SecretAccessKey); err != nil {
		return err
	}
	if err := Asserttime.TimeRequired(obj.CreateDate); err != nil {
		return err
	}
	return nil
}

// AssertCreateAccessKeyResponseAccessKeyConstraints checks if the values respects the defined constraints
func AssertCreateAccessKeyResponseAccessKeyConstraints(obj CreateAccessKeyResponseAccessKey) error {
	return nil
}