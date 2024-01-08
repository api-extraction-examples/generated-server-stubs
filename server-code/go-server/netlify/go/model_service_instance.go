/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * API version: 2.16.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ServiceInstance struct {

	AuthUrl string `json:"auth_url,omitempty"`

	Config map[string]interface{} `json:"config,omitempty"`

	CreatedAt string `json:"created_at,omitempty"`

	Env map[string]interface{} `json:"env,omitempty"`

	ExternalAttributes map[string]interface{} `json:"external_attributes,omitempty"`

	Id string `json:"id,omitempty"`

	ServiceName string `json:"service_name,omitempty"`

	ServicePath string `json:"service_path,omitempty"`

	ServiceSlug string `json:"service_slug,omitempty"`

	Snippets []map[string]interface{} `json:"snippets,omitempty"`

	UpdatedAt string `json:"updated_at,omitempty"`

	Url string `json:"url,omitempty"`
}

// AssertServiceInstanceRequired checks if the required fields are not zero-ed
func AssertServiceInstanceRequired(obj ServiceInstance) error {
	return nil
}

// AssertServiceInstanceConstraints checks if the values respects the defined constraints
func AssertServiceInstanceConstraints(obj ServiceInstance) error {
	return nil
}
