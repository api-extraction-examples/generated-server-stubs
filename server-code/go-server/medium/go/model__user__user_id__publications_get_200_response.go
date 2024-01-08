/*
 * Medium API
 *
 * Medium API helps you to quickly extract data from Medium's Website (https://medium.com).   You can gather data related to users, publications, articles (including its textual content), latest posts &amp; top writers within a topic/niche, etc… 
 *
 * API version: 1.0
 * Contact: nishu@mediumapi.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type UserUserIdPublicationsGet200Response struct {

	Publications []string `json:"publications,omitempty"`

	UserId string `json:"user_id,omitempty"`
}

// AssertUserUserIdPublicationsGet200ResponseRequired checks if the required fields are not zero-ed
func AssertUserUserIdPublicationsGet200ResponseRequired(obj UserUserIdPublicationsGet200Response) error {
	return nil
}

// AssertUserUserIdPublicationsGet200ResponseConstraints checks if the values respects the defined constraints
func AssertUserUserIdPublicationsGet200ResponseConstraints(obj UserUserIdPublicationsGet200Response) error {
	return nil
}
