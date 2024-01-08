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



// GetOpenIdConnectProviderResponse - Contains the response to a successful <a>GetOpenIDConnectProvider</a> request. 
type GetOpenIdConnectProviderResponse struct {

	Url string `json:"Url,omitempty"`

	ClientIDList Array `json:"ClientIDList,omitempty"`

	ThumbprintList Array `json:"ThumbprintList,omitempty"`

	CreateDate time.Time `json:"CreateDate,omitempty"`

	Tags Array `json:"Tags,omitempty"`
}

// AssertGetOpenIdConnectProviderResponseRequired checks if the required fields are not zero-ed
func AssertGetOpenIdConnectProviderResponseRequired(obj GetOpenIdConnectProviderResponse) error {
	if err := AssertstringRequired(obj.Url); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.ClientIDList); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.ThumbprintList); err != nil {
		return err
	}
	if err := Asserttime.TimeRequired(obj.CreateDate); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.Tags); err != nil {
		return err
	}
	return nil
}

// AssertGetOpenIdConnectProviderResponseConstraints checks if the values respects the defined constraints
func AssertGetOpenIdConnectProviderResponseConstraints(obj GetOpenIdConnectProviderResponse) error {
	return nil
}