/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type RequestIdCmdDiffPost200Response struct {

	Action RequestIdCmdDiffPost200ResponseAction `json:"action,omitempty"`

	Actions string `json:"actions,omitempty"`

	Id string `json:"id,omitempty"`
}

// AssertRequestIdCmdDiffPost200ResponseRequired checks if the required fields are not zero-ed
func AssertRequestIdCmdDiffPost200ResponseRequired(obj RequestIdCmdDiffPost200Response) error {
	if err := AssertRequestIdCmdDiffPost200ResponseActionRequired(obj.Action); err != nil {
		return err
	}
	return nil
}

// AssertRequestIdCmdDiffPost200ResponseConstraints checks if the values respects the defined constraints
func AssertRequestIdCmdDiffPost200ResponseConstraints(obj RequestIdCmdDiffPost200Response) error {
	return nil
}
