/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type GetBuildProjectRepositoryArchitecturePackageFileViewFileinfo200Response struct {

	Arch string `json:"arch,omitempty"`

	Description string `json:"description,omitempty"`

	Filename string `json:"filename,omitempty"`

	Mtime string `json:"mtime,omitempty"`

	Name string `json:"name,omitempty"`

	Provides []string `json:"provides,omitempty"`

	ProvidesExt []GetBuildProjectRepositoryArchitecturePackageFileViewFileinfo200ResponseProvidesExtInner `json:"provides_ext,omitempty"`

	Release string `json:"release,omitempty"`

	Requires []string `json:"requires,omitempty"`

	RequiresExt []GetBuildProjectRepositoryArchitecturePackageFileViewFileinfo200ResponseRequiresExtInner `json:"requires_ext,omitempty"`

	Size string `json:"size,omitempty"`

	Source string `json:"source,omitempty"`

	Summary string `json:"summary,omitempty"`

	Version string `json:"version,omitempty"`
}

// AssertGetBuildProjectRepositoryArchitecturePackageFileViewFileinfo200ResponseRequired checks if the required fields are not zero-ed
func AssertGetBuildProjectRepositoryArchitecturePackageFileViewFileinfo200ResponseRequired(obj GetBuildProjectRepositoryArchitecturePackageFileViewFileinfo200Response) error {
	for _, el := range obj.ProvidesExt {
		if err := AssertGetBuildProjectRepositoryArchitecturePackageFileViewFileinfo200ResponseProvidesExtInnerRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.RequiresExt {
		if err := AssertGetBuildProjectRepositoryArchitecturePackageFileViewFileinfo200ResponseRequiresExtInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertGetBuildProjectRepositoryArchitecturePackageFileViewFileinfo200ResponseConstraints checks if the values respects the defined constraints
func AssertGetBuildProjectRepositoryArchitecturePackageFileViewFileinfo200ResponseConstraints(obj GetBuildProjectRepositoryArchitecturePackageFileViewFileinfo200Response) error {
	return nil
}
