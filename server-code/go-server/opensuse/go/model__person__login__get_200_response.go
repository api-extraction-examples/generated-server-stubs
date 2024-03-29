/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PersonLoginGet200Response struct {

	Email string `json:"email,omitempty"`

	Globalrole string `json:"globalrole,omitempty"`

	IgnoreAuthServices bool `json:"ignore_auth_services,omitempty"`

	Login string `json:"login,omitempty"`

	Realname string `json:"realname,omitempty"`

	State string `json:"state,omitempty"`

	Watchlist []PersonLoginGet200ResponseWatchlistInner `json:"watchlist,omitempty"`
}

// AssertPersonLoginGet200ResponseRequired checks if the required fields are not zero-ed
func AssertPersonLoginGet200ResponseRequired(obj PersonLoginGet200Response) error {
	for _, el := range obj.Watchlist {
		if err := AssertPersonLoginGet200ResponseWatchlistInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertPersonLoginGet200ResponseConstraints checks if the values respects the defined constraints
func AssertPersonLoginGet200ResponseConstraints(obj PersonLoginGet200Response) error {
	return nil
}
