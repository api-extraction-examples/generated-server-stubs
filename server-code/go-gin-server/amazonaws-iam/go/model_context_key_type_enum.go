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
