/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * API version: 2.16.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CreateEnvVarsRequestInner struct {

	// The existing or new name of the key, if you wish to rename it (case-sensitive)
	Key string `json:"key,omitempty"`

	// The scopes that this environment variable is set to (Pro plans and above)
	Scopes []string `json:"scopes,omitempty"`

	Values []EnvVarValue `json:"values,omitempty"`
}

// AssertCreateEnvVarsRequestInnerRequired checks if the required fields are not zero-ed
func AssertCreateEnvVarsRequestInnerRequired(obj CreateEnvVarsRequestInner) error {
	for _, el := range obj.Values {
		if err := AssertEnvVarValueRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCreateEnvVarsRequestInnerConstraints checks if the values respects the defined constraints
func AssertCreateEnvVarsRequestInnerConstraints(obj CreateEnvVarsRequestInner) error {
	return nil
}
