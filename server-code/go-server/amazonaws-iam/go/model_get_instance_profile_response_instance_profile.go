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



type GetInstanceProfileResponseInstanceProfile struct {

	Path string `json:"Path"`

	InstanceProfileName string `json:"InstanceProfileName"`

	InstanceProfileId string `json:"InstanceProfileId"`

	Arn string `json:"Arn"`

	CreateDate time.Time `json:"CreateDate"`

	Roles Array `json:"Roles"`

	Tags Array `json:"Tags,omitempty"`
}

// AssertGetInstanceProfileResponseInstanceProfileRequired checks if the required fields are not zero-ed
func AssertGetInstanceProfileResponseInstanceProfileRequired(obj GetInstanceProfileResponseInstanceProfile) error {
	elements := map[string]interface{}{
		"Path": obj.Path,
		"InstanceProfileName": obj.InstanceProfileName,
		"InstanceProfileId": obj.InstanceProfileId,
		"Arn": obj.Arn,
		"CreateDate": obj.CreateDate,
		"Roles": obj.Roles,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertstringRequired(obj.Path); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.InstanceProfileName); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.InstanceProfileId); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.Arn); err != nil {
		return err
	}
	if err := Asserttime.TimeRequired(obj.CreateDate); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.Roles); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.Tags); err != nil {
		return err
	}
	return nil
}

// AssertGetInstanceProfileResponseInstanceProfileConstraints checks if the values respects the defined constraints
func AssertGetInstanceProfileResponseInstanceProfileConstraints(obj GetInstanceProfileResponseInstanceProfile) error {
	return nil
}
