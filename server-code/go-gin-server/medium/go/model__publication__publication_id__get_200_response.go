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

type PublicationPublicationIdGet200Response struct {

	Creator string `json:"creator,omitempty"`

	Description string `json:"description,omitempty"`

	Editors []string `json:"editors,omitempty"`

	FacebookPagename string `json:"facebook_pagename,omitempty"`

	Followers int32 `json:"followers,omitempty"`

	Id string `json:"id,omitempty"`

	InstagramUsername string `json:"instagram_username,omitempty"`

	Name string `json:"name,omitempty"`

	Slug string `json:"slug,omitempty"`

	Tagline string `json:"tagline,omitempty"`

	Tags []string `json:"tags,omitempty"`

	TwitterUsername string `json:"twitter_username,omitempty"`

	Url string `json:"url,omitempty"`
}
