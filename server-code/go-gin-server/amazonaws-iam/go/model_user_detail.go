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

// UserDetail - <p>Contains information about an IAM user, including all the user's policies and all the IAM groups the user is in.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.</p>
type UserDetail struct {

	Path string `json:"Path,omitempty"`

	UserName string `json:"UserName,omitempty"`

	UserId string `json:"UserId,omitempty"`

	// <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>
	Arn string `json:"Arn,omitempty"`

	CreateDate time.Time `json:"CreateDate,omitempty"`

	UserPolicyList Array `json:"UserPolicyList,omitempty"`

	GroupList Array `json:"GroupList,omitempty"`

	AttachedManagedPolicies Array `json:"AttachedManagedPolicies,omitempty"`

	PermissionsBoundary UserDetailPermissionsBoundary `json:"PermissionsBoundary,omitempty"`

	Tags Array `json:"Tags,omitempty"`
}