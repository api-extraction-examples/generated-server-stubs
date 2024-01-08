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




type OauthTokenPostRequest struct {

	// Client ID, obtained during app registration
	ClientId string `json:"client_id"`

	// Client secret, obtained during app registration
	ClientSecret string `json:"client_secret"`

	// A user authorization code, obtained via /oauth/authorize
	Code string `json:"code,omitempty"`

	// Set equal to authorization_code if code is provided in order to gain user-level access. Otherwise, set equal to client_credentials to obtain app-level access only.
	GrantType string `json:"grant_type"`

	// Set a URI to redirect the user to. If this parameter is set to urn:ietf:wg:oauth:2.0:oob then the token will be shown instead. Must match one of the redirect URIs declared during app registration.
	RedirectUri string `json:"redirect_uri"`

	// List of requested OAuth scopes, separated by spaces. Must be a subset of scopes declared during app registration. If not provided, defaults to read.
	Scopes string `json:"scopes,omitempty"`
}

// AssertOauthTokenPostRequestRequired checks if the required fields are not zero-ed
func AssertOauthTokenPostRequestRequired(obj OauthTokenPostRequest) error {
	elements := map[string]interface{}{
		"client_id": obj.ClientId,
		"client_secret": obj.ClientSecret,
		"grant_type": obj.GrantType,
		"redirect_uri": obj.RedirectUri,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertOauthTokenPostRequestConstraints checks if the values respects the defined constraints
func AssertOauthTokenPostRequestConstraints(obj OauthTokenPostRequest) error {
	return nil
}