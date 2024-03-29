/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type GetBuildProjectRepositoryArchPackageBuildinfo200Response struct {

	Arch string `json:"arch,omitempty"`

	Bcnt string `json:"bcnt,omitempty"`

	Bdep GetBuildProjectRepositoryArchPackageBuildinfo200ResponseBdep `json:"bdep,omitempty"`

	Debuginfo int32 `json:"debuginfo,omitempty"`

	File string `json:"file,omitempty"`

	Package string `json:"package,omitempty"`

	Path *interface{} `json:"path,omitempty"`

	Project string `json:"project,omitempty"`

	Release string `json:"release,omitempty"`

	Repository string `json:"repository,omitempty"`

	Rev int32 `json:"rev,omitempty"`

	Specfile string `json:"specfile,omitempty"`

	Srcmd5 string `json:"srcmd5,omitempty"`

	Subpack string `json:"subpack,omitempty"`

	Verifymd5 string `json:"verifymd5,omitempty"`

	Versrel string `json:"versrel,omitempty"`
}

// AssertGetBuildProjectRepositoryArchPackageBuildinfo200ResponseRequired checks if the required fields are not zero-ed
func AssertGetBuildProjectRepositoryArchPackageBuildinfo200ResponseRequired(obj GetBuildProjectRepositoryArchPackageBuildinfo200Response) error {
	if err := AssertGetBuildProjectRepositoryArchPackageBuildinfo200ResponseBdepRequired(obj.Bdep); err != nil {
		return err
	}
	return nil
}

// AssertGetBuildProjectRepositoryArchPackageBuildinfo200ResponseConstraints checks if the values respects the defined constraints
func AssertGetBuildProjectRepositoryArchPackageBuildinfo200ResponseConstraints(obj GetBuildProjectRepositoryArchPackageBuildinfo200Response) error {
	return nil
}
