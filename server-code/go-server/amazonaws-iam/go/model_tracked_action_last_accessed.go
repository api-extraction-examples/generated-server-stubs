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



// TrackedActionLastAccessed - <p>Contains details about the most recent attempt to access an action within the service.</p> <p>This data type is used as a response element in the <a>GetServiceLastAccessedDetails</a> operation.</p>
type TrackedActionLastAccessed struct {

	ActionName string `json:"ActionName,omitempty"`

	// <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>
	LastAccessedEntity string `json:"LastAccessedEntity,omitempty"`

	LastAccessedTime time.Time `json:"LastAccessedTime,omitempty"`

	LastAccessedRegion string `json:"LastAccessedRegion,omitempty"`
}

// AssertTrackedActionLastAccessedRequired checks if the required fields are not zero-ed
func AssertTrackedActionLastAccessedRequired(obj TrackedActionLastAccessed) error {
	if err := AssertstringRequired(obj.ActionName); err != nil {
		return err
	}
	if err := Asserttime.TimeRequired(obj.LastAccessedTime); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.LastAccessedRegion); err != nil {
		return err
	}
	return nil
}

// AssertTrackedActionLastAccessedConstraints checks if the values respects the defined constraints
func AssertTrackedActionLastAccessedConstraints(obj TrackedActionLastAccessed) error {
	return nil
}