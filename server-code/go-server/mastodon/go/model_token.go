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




// Token - Represents an OAuth token used for authenticating with the API and performing actions.
type Token struct {

	// An OAuth token to be used for authorization.
	AccessToken string `json:"access_token,omitempty"`

	// When the token was generated. UNIX Timestamp.
	CreatedAt int32 `json:"created_at,omitempty"`

	// The OAuth scopes granted by this token, space-separated.
	Scope string `json:"scope,omitempty"`

	// The OAuth token type. Mastodon uses `Bearer` tokens.
	TokenType string `json:"token_type,omitempty"`
}

// AssertTokenRequired checks if the required fields are not zero-ed
func AssertTokenRequired(obj Token) error {
	return nil
}

// AssertTokenConstraints checks if the values respects the defined constraints
func AssertTokenConstraints(obj Token) error {
	return nil
}
