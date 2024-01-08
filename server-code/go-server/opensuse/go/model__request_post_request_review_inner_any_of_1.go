/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type RequestPostRequestReviewInnerAnyOf1 struct {

	ByGroup string `json:"by_group,omitempty"`

	State string `json:"state,omitempty"`

	When string `json:"when,omitempty"`

	Who string `json:"who,omitempty"`
}

// AssertRequestPostRequestReviewInnerAnyOf1Required checks if the required fields are not zero-ed
func AssertRequestPostRequestReviewInnerAnyOf1Required(obj RequestPostRequestReviewInnerAnyOf1) error {
	return nil
}

// AssertRequestPostRequestReviewInnerAnyOf1Constraints checks if the values respects the defined constraints
func AssertRequestPostRequestReviewInnerAnyOf1Constraints(obj RequestPostRequestReviewInnerAnyOf1) error {
	return nil
}
