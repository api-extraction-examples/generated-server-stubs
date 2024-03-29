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



// Policy - <p>Contains information about a managed policy.</p> <p>This data type is used as a response element in the <a>CreatePolicy</a>, <a>GetPolicy</a>, and <a>ListPolicies</a> operations. </p> <p>For more information about managed policies, refer to <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>. </p>
type Policy struct {

	PolicyName string `json:"PolicyName,omitempty"`

	PolicyId string `json:"PolicyId,omitempty"`

	// <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>
	Arn string `json:"Arn,omitempty"`

	Path string `json:"Path,omitempty"`

	DefaultVersionId string `json:"DefaultVersionId,omitempty"`

	AttachmentCount int32 `json:"AttachmentCount,omitempty"`

	PermissionsBoundaryUsageCount int32 `json:"PermissionsBoundaryUsageCount,omitempty"`

	IsAttachable bool `json:"IsAttachable,omitempty"`

	Description string `json:"Description,omitempty"`

	CreateDate time.Time `json:"CreateDate,omitempty"`

	UpdateDate time.Time `json:"UpdateDate,omitempty"`

	Tags Array `json:"Tags,omitempty"`
}

// AssertPolicyRequired checks if the required fields are not zero-ed
func AssertPolicyRequired(obj Policy) error {
	if err := AssertstringRequired(obj.PolicyName); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.PolicyId); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.Path); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.DefaultVersionId); err != nil {
		return err
	}
	if err := Assertint32Required(obj.AttachmentCount); err != nil {
		return err
	}
	if err := Assertint32Required(obj.PermissionsBoundaryUsageCount); err != nil {
		return err
	}
	if err := AssertboolRequired(obj.IsAttachable); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.Description); err != nil {
		return err
	}
	if err := Asserttime.TimeRequired(obj.CreateDate); err != nil {
		return err
	}
	if err := Asserttime.TimeRequired(obj.UpdateDate); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.Tags); err != nil {
		return err
	}
	return nil
}

// AssertPolicyConstraints checks if the values respects the defined constraints
func AssertPolicyConstraints(obj Policy) error {
	return nil
}
