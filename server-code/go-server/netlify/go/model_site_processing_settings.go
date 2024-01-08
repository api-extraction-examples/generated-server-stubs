/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * API version: 2.16.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type SiteProcessingSettings struct {

	Css MinifyOptions `json:"css,omitempty"`

	Html SiteProcessingSettingsHtml `json:"html,omitempty"`

	Images SiteProcessingSettingsImages `json:"images,omitempty"`

	Js MinifyOptions `json:"js,omitempty"`

	Skip bool `json:"skip,omitempty"`
}

// AssertSiteProcessingSettingsRequired checks if the required fields are not zero-ed
func AssertSiteProcessingSettingsRequired(obj SiteProcessingSettings) error {
	if err := AssertMinifyOptionsRequired(obj.Css); err != nil {
		return err
	}
	if err := AssertSiteProcessingSettingsHtmlRequired(obj.Html); err != nil {
		return err
	}
	if err := AssertSiteProcessingSettingsImagesRequired(obj.Images); err != nil {
		return err
	}
	if err := AssertMinifyOptionsRequired(obj.Js); err != nil {
		return err
	}
	return nil
}

// AssertSiteProcessingSettingsConstraints checks if the values respects the defined constraints
func AssertSiteProcessingSettingsConstraints(obj SiteProcessingSettings) error {
	return nil
}
