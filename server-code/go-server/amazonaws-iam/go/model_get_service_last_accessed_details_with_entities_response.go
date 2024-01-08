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



type GetServiceLastAccessedDetailsWithEntitiesResponse struct {

	JobStatus JobStatusType `json:"JobStatus"`

	JobCreationDate time.Time `json:"JobCreationDate"`

	JobCompletionDate time.Time `json:"JobCompletionDate"`

	EntityDetailsList Array `json:"EntityDetailsList"`

	IsTruncated bool `json:"IsTruncated,omitempty"`

	Marker string `json:"Marker,omitempty"`

	Error GetServiceLastAccessedDetailsResponseError `json:"Error,omitempty"`
}

// AssertGetServiceLastAccessedDetailsWithEntitiesResponseRequired checks if the required fields are not zero-ed
func AssertGetServiceLastAccessedDetailsWithEntitiesResponseRequired(obj GetServiceLastAccessedDetailsWithEntitiesResponse) error {
	elements := map[string]interface{}{
		"JobStatus": obj.JobStatus,
		"JobCreationDate": obj.JobCreationDate,
		"JobCompletionDate": obj.JobCompletionDate,
		"EntityDetailsList": obj.EntityDetailsList,
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
	if err := AssertarrayRequired(obj.EntityDetailsList); err != nil {
		return err
	}
	if err := AssertboolRequired(obj.IsTruncated); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.Marker); err != nil {
		return err
	}
	if err := AssertGetServiceLastAccessedDetailsResponseErrorRequired(obj.Error); err != nil {
		return err
	}
	return nil
}

// AssertGetServiceLastAccessedDetailsWithEntitiesResponseConstraints checks if the values respects the defined constraints
func AssertGetServiceLastAccessedDetailsWithEntitiesResponseConstraints(obj GetServiceLastAccessedDetailsWithEntitiesResponse) error {
	return nil
}
