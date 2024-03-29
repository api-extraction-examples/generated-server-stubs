/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * API version: 2.16.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type DnsZone struct {

	AccountId string `json:"account_id,omitempty"`

	AccountName string `json:"account_name,omitempty"`

	AccountSlug string `json:"account_slug,omitempty"`

	CreatedAt string `json:"created_at,omitempty"`

	Dedicated bool `json:"dedicated,omitempty"`

	DnsServers []string `json:"dns_servers,omitempty"`

	Domain string `json:"domain,omitempty"`

	Errors []string `json:"errors,omitempty"`

	Id string `json:"id,omitempty"`

	Ipv6Enabled bool `json:"ipv6_enabled,omitempty"`

	Name string `json:"name,omitempty"`

	Records []DnsRecord `json:"records,omitempty"`

	SiteId string `json:"site_id,omitempty"`

	SupportedRecordTypes []string `json:"supported_record_types,omitempty"`

	UpdatedAt string `json:"updated_at,omitempty"`

	UserId string `json:"user_id,omitempty"`
}
