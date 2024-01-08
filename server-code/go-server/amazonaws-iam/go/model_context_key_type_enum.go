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



type ContextKeyTypeEnum string

// List of ContextKeyTypeEnum
const (
	STRING ContextKeyTypeEnum = "string"
	STRING_LIST ContextKeyTypeEnum = "stringList"
	NUMERIC ContextKeyTypeEnum = "numeric"
	NUMERIC_LIST ContextKeyTypeEnum = "numericList"
	BOOLEAN ContextKeyTypeEnum = "boolean"
	BOOLEAN_LIST ContextKeyTypeEnum = "booleanList"
	IP ContextKeyTypeEnum = "ip"
	IP_LIST ContextKeyTypeEnum = "ipList"
	BINARY ContextKeyTypeEnum = "binary"
	BINARY_LIST ContextKeyTypeEnum = "binaryList"
	DATE ContextKeyTypeEnum = "date"
	DATE_LIST ContextKeyTypeEnum = "dateList"
)

// AllowedContextKeyTypeEnumEnumValues is all the allowed values of ContextKeyTypeEnum enum
var AllowedContextKeyTypeEnumEnumValues = []ContextKeyTypeEnum{
	"string",
	"stringList",
	"numeric",
	"numericList",
	"boolean",
	"booleanList",
	"ip",
	"ipList",
	"binary",
	"binaryList",
	"date",
	"dateList",
}

// validContextKeyTypeEnumEnumValue provides a map of ContextKeyTypeEnums for fast verification of use input
var validContextKeyTypeEnumEnumValues = map[ContextKeyTypeEnum]struct{}{
	"string": {},
	"stringList": {},
	"numeric": {},
	"numericList": {},
	"boolean": {},
	"booleanList": {},
	"ip": {},
	"ipList": {},
	"binary": {},
	"binaryList": {},
	"date": {},
	"dateList": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v ContextKeyTypeEnum) IsValid() bool {
	_, ok := validContextKeyTypeEnumEnumValues[v]
	return ok
}

// NewContextKeyTypeEnumFromValue returns a pointer to a valid ContextKeyTypeEnum
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewContextKeyTypeEnumFromValue(v string) (ContextKeyTypeEnum, error) {
	ev := ContextKeyTypeEnum(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for ContextKeyTypeEnum: valid values are %v", v, AllowedContextKeyTypeEnumEnumValues)
	}
}



// AssertContextKeyTypeEnumRequired checks if the required fields are not zero-ed
func AssertContextKeyTypeEnumRequired(obj ContextKeyTypeEnum) error {
	return nil
}

// AssertContextKeyTypeEnumConstraints checks if the values respects the defined constraints
func AssertContextKeyTypeEnumConstraints(obj ContextKeyTypeEnum) error {
	return nil
}
