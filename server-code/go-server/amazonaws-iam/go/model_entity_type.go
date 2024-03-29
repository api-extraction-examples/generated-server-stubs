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



type EntityType string

// List of EntityType
const (
	USER EntityType = "User"
	ROLE EntityType = "Role"
	GROUP EntityType = "Group"
	LOCAL_MANAGED_POLICY EntityType = "LocalManagedPolicy"
	AWS_MANAGED_POLICY EntityType = "AWSManagedPolicy"
)

// AllowedEntityTypeEnumValues is all the allowed values of EntityType enum
var AllowedEntityTypeEnumValues = []EntityType{
	"User",
	"Role",
	"Group",
	"LocalManagedPolicy",
	"AWSManagedPolicy",
}

// validEntityTypeEnumValue provides a map of EntityTypes for fast verification of use input
var validEntityTypeEnumValues = map[EntityType]struct{}{
	"User": {},
	"Role": {},
	"Group": {},
	"LocalManagedPolicy": {},
	"AWSManagedPolicy": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v EntityType) IsValid() bool {
	_, ok := validEntityTypeEnumValues[v]
	return ok
}

// NewEntityTypeFromValue returns a pointer to a valid EntityType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewEntityTypeFromValue(v string) (EntityType, error) {
	ev := EntityType(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for EntityType: valid values are %v", v, AllowedEntityTypeEnumValues)
	}
}



// AssertEntityTypeRequired checks if the required fields are not zero-ed
func AssertEntityTypeRequired(obj EntityType) error {
	return nil
}

// AssertEntityTypeConstraints checks if the values respects the defined constraints
func AssertEntityTypeConstraints(obj EntityType) error {
	return nil
}
