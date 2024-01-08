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




type UserUserIdInterestsGet200Response struct {

	TagsFollowed []string `json:"tags_followed,omitempty"`
}

// AssertUserUserIdInterestsGet200ResponseRequired checks if the required fields are not zero-ed
func AssertUserUserIdInterestsGet200ResponseRequired(obj UserUserIdInterestsGet200Response) error {
	return nil
}

// AssertUserUserIdInterestsGet200ResponseConstraints checks if the values respects the defined constraints
func AssertUserUserIdInterestsGet200ResponseConstraints(obj UserUserIdInterestsGet200Response) error {
	return nil
}
