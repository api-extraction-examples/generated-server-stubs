/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * API version: 2.16.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type Service struct {

	CreatedAt string `json:"created_at,omitempty"`

	Description string `json:"description,omitempty"`

	Environments []string `json:"environments,omitempty"`

	Events []map[string]interface{} `json:"events,omitempty"`

	Icon string `json:"icon,omitempty"`

	Id string `json:"id,omitempty"`

	LongDescription string `json:"long_description,omitempty"`

	ManifestUrl string `json:"manifest_url,omitempty"`

	Name string `json:"name,omitempty"`

	ServicePath string `json:"service_path,omitempty"`

	Slug string `json:"slug,omitempty"`

	Tags []string `json:"tags,omitempty"`

	UpdatedAt string `json:"updated_at,omitempty"`
}

// AssertServiceRequired checks if the required fields are not zero-ed
func AssertServiceRequired(obj Service) error {
	return nil
}

// AssertServiceConstraints checks if the values respects the defined constraints
func AssertServiceConstraints(obj Service) error {
	return nil
}
