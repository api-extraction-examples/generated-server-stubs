/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type WorkerStatusGet200ResponseBuildingInner struct {

	Arch string `json:"arch,omitempty"`

	Hostarch string `json:"hostarch,omitempty"`

	Package string `json:"package,omitempty"`

	Project string `json:"project,omitempty"`

	Repository string `json:"repository,omitempty"`

	Starttime string `json:"starttime,omitempty"`

	Workerid string `json:"workerid,omitempty"`
}

// AssertWorkerStatusGet200ResponseBuildingInnerRequired checks if the required fields are not zero-ed
func AssertWorkerStatusGet200ResponseBuildingInnerRequired(obj WorkerStatusGet200ResponseBuildingInner) error {
	return nil
}

// AssertWorkerStatusGet200ResponseBuildingInnerConstraints checks if the values respects the defined constraints
func AssertWorkerStatusGet200ResponseBuildingInnerConstraints(obj WorkerStatusGet200ResponseBuildingInner) error {
	return nil
}
