/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0
 * Contact: sardo@hey.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ApiV1AppsPost200Response struct {

	ClientId string `json:"client_id,omitempty"`

	ClientSecret string `json:"client_secret,omitempty"`

	Id string `json:"id,omitempty"`

	Name string `json:"name,omitempty"`

	RedirectUri string `json:"redirect_uri,omitempty"`

	VapidKey string `json:"vapid_key,omitempty"`

	Website string `json:"website,omitempty"`
}

// AssertApiV1AppsPost200ResponseRequired checks if the required fields are not zero-ed
func AssertApiV1AppsPost200ResponseRequired(obj ApiV1AppsPost200Response) error {
	return nil
}

// AssertApiV1AppsPost200ResponseConstraints checks if the values respects the defined constraints
func AssertApiV1AppsPost200ResponseConstraints(obj ApiV1AppsPost200Response) error {
	return nil
}
