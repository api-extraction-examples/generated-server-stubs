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



type DeletionTaskStatusType string

// List of DeletionTaskStatusType
const (
	SUCCEEDED DeletionTaskStatusType = "SUCCEEDED"
	IN_PROGRESS DeletionTaskStatusType = "IN_PROGRESS"
	FAILED DeletionTaskStatusType = "FAILED"
	NOT_STARTED DeletionTaskStatusType = "NOT_STARTED"
)

// AllowedDeletionTaskStatusTypeEnumValues is all the allowed values of DeletionTaskStatusType enum
var AllowedDeletionTaskStatusTypeEnumValues = []DeletionTaskStatusType{
	"SUCCEEDED",
	"IN_PROGRESS",
	"FAILED",
	"NOT_STARTED",
}

// validDeletionTaskStatusTypeEnumValue provides a map of DeletionTaskStatusTypes for fast verification of use input
var validDeletionTaskStatusTypeEnumValues = map[DeletionTaskStatusType]struct{}{
	"SUCCEEDED": {},
	"IN_PROGRESS": {},
	"FAILED": {},
	"NOT_STARTED": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v DeletionTaskStatusType) IsValid() bool {
	_, ok := validDeletionTaskStatusTypeEnumValues[v]
	return ok
}

// NewDeletionTaskStatusTypeFromValue returns a pointer to a valid DeletionTaskStatusType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewDeletionTaskStatusTypeFromValue(v string) (DeletionTaskStatusType, error) {
	ev := DeletionTaskStatusType(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for DeletionTaskStatusType: valid values are %v", v, AllowedDeletionTaskStatusTypeEnumValues)
	}
}



// AssertDeletionTaskStatusTypeRequired checks if the required fields are not zero-ed
func AssertDeletionTaskStatusTypeRequired(obj DeletionTaskStatusType) error {
	return nil
}

// AssertDeletionTaskStatusTypeConstraints checks if the values respects the defined constraints
func AssertDeletionTaskStatusTypeConstraints(obj DeletionTaskStatusType) error {
	return nil
}
