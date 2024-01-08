/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * API version: 2.16.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type Asset struct {

	ContentType string `json:"content_type,omitempty"`

	CreatedAt string `json:"created_at,omitempty"`

	CreatorId string `json:"creator_id,omitempty"`

	Id string `json:"id,omitempty"`

	Key string `json:"key,omitempty"`

	Name string `json:"name,omitempty"`

	SiteId string `json:"site_id,omitempty"`

	Size int64 `json:"size,omitempty"`

	State string `json:"state,omitempty"`

	UpdatedAt string `json:"updated_at,omitempty"`

	Url string `json:"url,omitempty"`

	Visibility string `json:"visibility,omitempty"`
}

// AssertAssetRequired checks if the required fields are not zero-ed
func AssertAssetRequired(obj Asset) error {
	return nil
}

// AssertAssetConstraints checks if the values respects the defined constraints
func AssertAssetConstraints(obj Asset) error {
	return nil
}
