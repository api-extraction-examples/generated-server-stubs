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

type ArticleArticleIdFansGet200Response struct {

	ArticleId string `json:"article_id,omitempty"`

	Count int32 `json:"count,omitempty"`

	Voters []string `json:"voters,omitempty"`
}
