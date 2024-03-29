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




type UserUserIdFollowersGet200Response struct {

	Followers []string `json:"followers,omitempty"`

	Id string `json:"id,omitempty"`
}

// AssertUserUserIdFollowersGet200ResponseRequired checks if the required fields are not zero-ed
func AssertUserUserIdFollowersGet200ResponseRequired(obj UserUserIdFollowersGet200Response) error {
	return nil
}

// AssertUserUserIdFollowersGet200ResponseConstraints checks if the values respects the defined constraints
func AssertUserUserIdFollowersGet200ResponseConstraints(obj UserUserIdFollowersGet200Response) error {
	return nil
}
