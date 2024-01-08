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
	"fmt"
)



type PolicyEvaluationDecisionType string

// List of PolicyEvaluationDecisionType
const (
	ALLOWED PolicyEvaluationDecisionType = "allowed"
	EXPLICIT_DENY PolicyEvaluationDecisionType = "explicitDeny"
	IMPLICIT_DENY PolicyEvaluationDecisionType = "implicitDeny"
)

// AllowedPolicyEvaluationDecisionTypeEnumValues is all the allowed values of PolicyEvaluationDecisionType enum
var AllowedPolicyEvaluationDecisionTypeEnumValues = []PolicyEvaluationDecisionType{
	"allowed",
	"explicitDeny",
	"implicitDeny",
}

// validPolicyEvaluationDecisionTypeEnumValue provides a map of PolicyEvaluationDecisionTypes for fast verification of use input
var validPolicyEvaluationDecisionTypeEnumValues = map[PolicyEvaluationDecisionType]struct{}{
	"allowed": {},
	"explicitDeny": {},
	"implicitDeny": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v PolicyEvaluationDecisionType) IsValid() bool {
	_, ok := validPolicyEvaluationDecisionTypeEnumValues[v]
	return ok
}

// NewPolicyEvaluationDecisionTypeFromValue returns a pointer to a valid PolicyEvaluationDecisionType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewPolicyEvaluationDecisionTypeFromValue(v string) (PolicyEvaluationDecisionType, error) {
	ev := PolicyEvaluationDecisionType(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for PolicyEvaluationDecisionType: valid values are %v", v, AllowedPolicyEvaluationDecisionTypeEnumValues)
	}
}



// AssertPolicyEvaluationDecisionTypeRequired checks if the required fields are not zero-ed
func AssertPolicyEvaluationDecisionTypeRequired(obj PolicyEvaluationDecisionType) error {
	return nil
}

// AssertPolicyEvaluationDecisionTypeConstraints checks if the values respects the defined constraints
func AssertPolicyEvaluationDecisionTypeConstraints(obj PolicyEvaluationDecisionType) error {
	return nil
}
