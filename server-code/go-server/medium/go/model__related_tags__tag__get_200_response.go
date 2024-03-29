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




type RelatedTagsTagGet200Response struct {

	GivenTag string `json:"given_tag,omitempty"`

	RelatedTags []string `json:"related_tags,omitempty"`
}

// AssertRelatedTagsTagGet200ResponseRequired checks if the required fields are not zero-ed
func AssertRelatedTagsTagGet200ResponseRequired(obj RelatedTagsTagGet200Response) error {
	return nil
}

// AssertRelatedTagsTagGet200ResponseConstraints checks if the values respects the defined constraints
func AssertRelatedTagsTagGet200ResponseConstraints(obj RelatedTagsTagGet200Response) error {
	return nil
}
