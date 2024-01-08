/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * API version: 2.16.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type Submission struct {

	Body string `json:"body,omitempty"`

	Company string `json:"company,omitempty"`

	CreatedAt string `json:"created_at,omitempty"`

	Data map[string]interface{} `json:"data,omitempty"`

	Email string `json:"email,omitempty"`

	FirstName string `json:"first_name,omitempty"`

	Id string `json:"id,omitempty"`

	LastName string `json:"last_name,omitempty"`

	Name string `json:"name,omitempty"`

	Number int32 `json:"number,omitempty"`

	SiteUrl string `json:"site_url,omitempty"`

	Summary string `json:"summary,omitempty"`
}

// AssertSubmissionRequired checks if the required fields are not zero-ed
func AssertSubmissionRequired(obj Submission) error {
	return nil
}

// AssertSubmissionConstraints checks if the values respects the defined constraints
func AssertSubmissionConstraints(obj Submission) error {
	return nil
}
