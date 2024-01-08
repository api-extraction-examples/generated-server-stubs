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



type SummaryKeyType string

// List of SummaryKeyType
const (
	USERS SummaryKeyType = "Users"
	USERS_QUOTA SummaryKeyType = "UsersQuota"
	GROUPS SummaryKeyType = "Groups"
	GROUPS_QUOTA SummaryKeyType = "GroupsQuota"
	SERVER_CERTIFICATES SummaryKeyType = "ServerCertificates"
	SERVER_CERTIFICATES_QUOTA SummaryKeyType = "ServerCertificatesQuota"
	USER_POLICY_SIZE_QUOTA SummaryKeyType = "UserPolicySizeQuota"
	GROUP_POLICY_SIZE_QUOTA SummaryKeyType = "GroupPolicySizeQuota"
	GROUPS_PER_USER_QUOTA SummaryKeyType = "GroupsPerUserQuota"
	SIGNING_CERTIFICATES_PER_USER_QUOTA SummaryKeyType = "SigningCertificatesPerUserQuota"
	ACCESS_KEYS_PER_USER_QUOTA SummaryKeyType = "AccessKeysPerUserQuota"
	MFA_DEVICES SummaryKeyType = "MFADevices"
	MFA_DEVICES_IN_USE SummaryKeyType = "MFADevicesInUse"
	ACCOUNT_MFA_ENABLED SummaryKeyType = "AccountMFAEnabled"
	ACCOUNT_ACCESS_KEYS_PRESENT SummaryKeyType = "AccountAccessKeysPresent"
	ACCOUNT_SIGNING_CERTIFICATES_PRESENT SummaryKeyType = "AccountSigningCertificatesPresent"
	ATTACHED_POLICIES_PER_GROUP_QUOTA SummaryKeyType = "AttachedPoliciesPerGroupQuota"
	ATTACHED_POLICIES_PER_ROLE_QUOTA SummaryKeyType = "AttachedPoliciesPerRoleQuota"
	ATTACHED_POLICIES_PER_USER_QUOTA SummaryKeyType = "AttachedPoliciesPerUserQuota"
	POLICIES SummaryKeyType = "Policies"
	POLICIES_QUOTA SummaryKeyType = "PoliciesQuota"
	POLICY_SIZE_QUOTA SummaryKeyType = "PolicySizeQuota"
	POLICY_VERSIONS_IN_USE SummaryKeyType = "PolicyVersionsInUse"
	POLICY_VERSIONS_IN_USE_QUOTA SummaryKeyType = "PolicyVersionsInUseQuota"
	VERSIONS_PER_POLICY_QUOTA SummaryKeyType = "VersionsPerPolicyQuota"
	GLOBAL_ENDPOINT_TOKEN_VERSION SummaryKeyType = "GlobalEndpointTokenVersion"
)

// AllowedSummaryKeyTypeEnumValues is all the allowed values of SummaryKeyType enum
var AllowedSummaryKeyTypeEnumValues = []SummaryKeyType{
	"Users",
	"UsersQuota",
	"Groups",
	"GroupsQuota",
	"ServerCertificates",
	"ServerCertificatesQuota",
	"UserPolicySizeQuota",
	"GroupPolicySizeQuota",
	"GroupsPerUserQuota",
	"SigningCertificatesPerUserQuota",
	"AccessKeysPerUserQuota",
	"MFADevices",
	"MFADevicesInUse",
	"AccountMFAEnabled",
	"AccountAccessKeysPresent",
	"AccountSigningCertificatesPresent",
	"AttachedPoliciesPerGroupQuota",
	"AttachedPoliciesPerRoleQuota",
	"AttachedPoliciesPerUserQuota",
	"Policies",
	"PoliciesQuota",
	"PolicySizeQuota",
	"PolicyVersionsInUse",
	"PolicyVersionsInUseQuota",
	"VersionsPerPolicyQuota",
	"GlobalEndpointTokenVersion",
}

// validSummaryKeyTypeEnumValue provides a map of SummaryKeyTypes for fast verification of use input
var validSummaryKeyTypeEnumValues = map[SummaryKeyType]struct{}{
	"Users": {},
	"UsersQuota": {},
	"Groups": {},
	"GroupsQuota": {},
	"ServerCertificates": {},
	"ServerCertificatesQuota": {},
	"UserPolicySizeQuota": {},
	"GroupPolicySizeQuota": {},
	"GroupsPerUserQuota": {},
	"SigningCertificatesPerUserQuota": {},
	"AccessKeysPerUserQuota": {},
	"MFADevices": {},
	"MFADevicesInUse": {},
	"AccountMFAEnabled": {},
	"AccountAccessKeysPresent": {},
	"AccountSigningCertificatesPresent": {},
	"AttachedPoliciesPerGroupQuota": {},
	"AttachedPoliciesPerRoleQuota": {},
	"AttachedPoliciesPerUserQuota": {},
	"Policies": {},
	"PoliciesQuota": {},
	"PolicySizeQuota": {},
	"PolicyVersionsInUse": {},
	"PolicyVersionsInUseQuota": {},
	"VersionsPerPolicyQuota": {},
	"GlobalEndpointTokenVersion": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v SummaryKeyType) IsValid() bool {
	_, ok := validSummaryKeyTypeEnumValues[v]
	return ok
}

// NewSummaryKeyTypeFromValue returns a pointer to a valid SummaryKeyType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewSummaryKeyTypeFromValue(v string) (SummaryKeyType, error) {
	ev := SummaryKeyType(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for SummaryKeyType: valid values are %v", v, AllowedSummaryKeyTypeEnumValues)
	}
}



// AssertSummaryKeyTypeRequired checks if the required fields are not zero-ed
func AssertSummaryKeyTypeRequired(obj SummaryKeyType) error {
	return nil
}

// AssertSummaryKeyTypeConstraints checks if the values respects the defined constraints
func AssertSummaryKeyTypeConstraints(obj SummaryKeyType) error {
	return nil
}