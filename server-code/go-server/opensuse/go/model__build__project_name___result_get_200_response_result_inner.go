/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BuildProjectNameResultGet200ResponseResultInner struct {

	Arch string `json:"arch,omitempty"`

	Binarylist []BuildProjectNameResultGet200ResponseResultInnerBinarylistInner `json:"binarylist,omitempty"`

	Code string `json:"code,omitempty"`

	Project string `json:"project,omitempty"`

	Repository string `json:"repository,omitempty"`

	State string `json:"state,omitempty"`

	Status []BuildProjectNameResultGet200ResponseResultInnerStatusInner `json:"status,omitempty"`

	Summary BuildProjectNameResultGet200ResponseResultInnerSummary `json:"summary,omitempty"`
}

// AssertBuildProjectNameResultGet200ResponseResultInnerRequired checks if the required fields are not zero-ed
func AssertBuildProjectNameResultGet200ResponseResultInnerRequired(obj BuildProjectNameResultGet200ResponseResultInner) error {
	for _, el := range obj.Binarylist {
		if err := AssertBuildProjectNameResultGet200ResponseResultInnerBinarylistInnerRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Status {
		if err := AssertBuildProjectNameResultGet200ResponseResultInnerStatusInnerRequired(el); err != nil {
			return err
		}
	}
	if err := AssertBuildProjectNameResultGet200ResponseResultInnerSummaryRequired(obj.Summary); err != nil {
		return err
	}
	return nil
}

// AssertBuildProjectNameResultGet200ResponseResultInnerConstraints checks if the values respects the defined constraints
func AssertBuildProjectNameResultGet200ResponseResultInnerConstraints(obj BuildProjectNameResultGet200ResponseResultInner) error {
	return nil
}