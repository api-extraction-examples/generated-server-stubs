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

// IdentityProof - Represents a proof from an external identity provider.
type IdentityProof struct {

	// The account owner's profile URL on the identity provider.
	ProfileUrl string `json:"profile_url,omitempty"`

	// A link to a statement of identity proof, hosted by the identity provider.
	ProofUrl string `json:"proof_url,omitempty"`

	// The name of the identity provider.
	Provider string `json:"provider,omitempty"`

	// The account owner's username on the identity provider's service.
	ProviderUsername string `json:"provider_username,omitempty"`

	// When the identity proof was last updated. ISO 8601 Datetime.
	UpdatedAt string `json:"updated_at,omitempty"`
}