/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * API version: 2.16.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BuildStatusMinutes struct {

	Current int32 `json:"current,omitempty"`

	CurrentAverageSec int32 `json:"current_average_sec,omitempty"`

	IncludedMinutes string `json:"included_minutes,omitempty"`

	IncludedMinutesWithPacks string `json:"included_minutes_with_packs,omitempty"`

	LastUpdatedAt string `json:"last_updated_at,omitempty"`

	PeriodEndDate string `json:"period_end_date,omitempty"`

	PeriodStartDate string `json:"period_start_date,omitempty"`

	Previous int32 `json:"previous,omitempty"`
}

// AssertBuildStatusMinutesRequired checks if the required fields are not zero-ed
func AssertBuildStatusMinutesRequired(obj BuildStatusMinutes) error {
	return nil
}

// AssertBuildStatusMinutesConstraints checks if the values respects the defined constraints
func AssertBuildStatusMinutesConstraints(obj BuildStatusMinutes) error {
	return nil
}
