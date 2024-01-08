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



type GetOrganizationsAccessReportResponse struct {

	JobStatus JobStatusType `json:"JobStatus"`

	JobCreationDate time.Time `json:"JobCreationDate"`

	JobCompletionDate time.Time `json:"JobCompletionDate,omitempty"`

	NumberOfServicesAccessible int32 `json:"NumberOfServicesAccessible,omitempty"`

	NumberOfServicesNotAccessed int32 `json:"NumberOfServicesNotAccessed,omitempty"`

	AccessDetails Array `json:"AccessDetails,omitempty"`

	IsTruncated bool `json:"IsTruncated,omitempty"`

	Marker string `json:"Marker,omitempty"`

	ErrorDetails ErrorDetails `json:"ErrorDetails,omitempty"`
}

// AssertGetOrganizationsAccessReportResponseRequired checks if the required fields are not zero-ed
func AssertGetOrganizationsAccessReportResponseRequired(obj GetOrganizationsAccessReportResponse) error {
	elements := map[string]interface{}{
		"JobStatus": obj.JobStatus,
		"JobCreationDate": obj.JobCreationDate,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertjobStatusTypeRequired(obj.JobStatus); err != nil {
		return err
	}
	if err := Asserttime.TimeRequired(obj.JobCreationDate); err != nil {
		return err
	}
	if err := Asserttime.TimeRequired(obj.JobCompletionDate); err != nil {
		return err
	}
	if err := Assertint32Required(obj.NumberOfServicesAccessible); err != nil {
		return err
	}
	if err := Assertint32Required(obj.NumberOfServicesNotAccessed); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.AccessDetails); err != nil {
		return err
	}
	if err := AssertboolRequired(obj.IsTruncated); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.Marker); err != nil {
		return err
	}
	if err := AssertErrorDetailsRequired(obj.ErrorDetails); err != nil {
		return err
	}
	return nil
}

// AssertGetOrganizationsAccessReportResponseConstraints checks if the values respects the defined constraints
func AssertGetOrganizationsAccessReportResponseConstraints(obj GetOrganizationsAccessReportResponse) error {
	return nil
}
