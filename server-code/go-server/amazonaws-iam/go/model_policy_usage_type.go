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


// PolicyUsageType : <p>The policy usage type that indicates whether the policy is used as a permissions policy or as the permissions boundary for an entity.</p> <p>For more information about permissions boundaries, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\">Permissions boundaries for IAM identities </a> in the <i>IAM User Guide</i>.</p>
type PolicyUsageType string

// List of PolicyUsageType
const (
	PERMISSIONS_POLICY PolicyUsageType = "PermissionsPolicy"
	PERMISSIONS_BOUNDARY PolicyUsageType = "PermissionsBoundary"
)

// AllowedPolicyUsageTypeEnumValues is all the allowed values of PolicyUsageType enum
var AllowedPolicyUsageTypeEnumValues = []PolicyUsageType{
	"PermissionsPolicy",
	"PermissionsBoundary",
}

// validPolicyUsageTypeEnumValue provides a map of PolicyUsageTypes for fast verification of use input
var validPolicyUsageTypeEnumValues = map[PolicyUsageType]struct{}{
	"PermissionsPolicy": {},
	"PermissionsBoundary": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v PolicyUsageType) IsValid() bool {
	_, ok := validPolicyUsageTypeEnumValues[v]
	return ok
}

// NewPolicyUsageTypeFromValue returns a pointer to a valid PolicyUsageType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewPolicyUsageTypeFromValue(v string) (PolicyUsageType, error) {
	ev := PolicyUsageType(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for PolicyUsageType: valid values are %v", v, AllowedPolicyUsageTypeEnumValues)
	}
}



// AssertPolicyUsageTypeRequired checks if the required fields are not zero-ed
func AssertPolicyUsageTypeRequired(obj PolicyUsageType) error {
	return nil
}

// AssertPolicyUsageTypeConstraints checks if the values respects the defined constraints
func AssertPolicyUsageTypeConstraints(obj PolicyUsageType) error {
	return nil
}
