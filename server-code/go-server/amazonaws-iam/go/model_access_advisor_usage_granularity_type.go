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



type AccessAdvisorUsageGranularityType string

// List of AccessAdvisorUsageGranularityType
const (
	SERVICE_LEVEL AccessAdvisorUsageGranularityType = "SERVICE_LEVEL"
	ACTION_LEVEL AccessAdvisorUsageGranularityType = "ACTION_LEVEL"
)

// AllowedAccessAdvisorUsageGranularityTypeEnumValues is all the allowed values of AccessAdvisorUsageGranularityType enum
var AllowedAccessAdvisorUsageGranularityTypeEnumValues = []AccessAdvisorUsageGranularityType{
	"SERVICE_LEVEL",
	"ACTION_LEVEL",
}

// validAccessAdvisorUsageGranularityTypeEnumValue provides a map of AccessAdvisorUsageGranularityTypes for fast verification of use input
var validAccessAdvisorUsageGranularityTypeEnumValues = map[AccessAdvisorUsageGranularityType]struct{}{
	"SERVICE_LEVEL": {},
	"ACTION_LEVEL": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v AccessAdvisorUsageGranularityType) IsValid() bool {
	_, ok := validAccessAdvisorUsageGranularityTypeEnumValues[v]
	return ok
}

// NewAccessAdvisorUsageGranularityTypeFromValue returns a pointer to a valid AccessAdvisorUsageGranularityType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewAccessAdvisorUsageGranularityTypeFromValue(v string) (AccessAdvisorUsageGranularityType, error) {
	ev := AccessAdvisorUsageGranularityType(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for AccessAdvisorUsageGranularityType: valid values are %v", v, AllowedAccessAdvisorUsageGranularityTypeEnumValues)
	}
}



// AssertAccessAdvisorUsageGranularityTypeRequired checks if the required fields are not zero-ed
func AssertAccessAdvisorUsageGranularityTypeRequired(obj AccessAdvisorUsageGranularityType) error {
	return nil
}

// AssertAccessAdvisorUsageGranularityTypeConstraints checks if the values respects the defined constraints
func AssertAccessAdvisorUsageGranularityTypeConstraints(obj AccessAdvisorUsageGranularityType) error {
	return nil
}
