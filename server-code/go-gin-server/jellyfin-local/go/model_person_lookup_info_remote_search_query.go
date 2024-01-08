/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type PersonLookupInfoRemoteSearchQuery struct {

	// Gets or sets a value indicating whether disabled providers should be included.
	IncludeDisabledProviders bool `json:"IncludeDisabledProviders,omitempty"`

	ItemId string `json:"ItemId,omitempty"`

	SearchInfo PersonLookupInfo `json:"SearchInfo,omitempty"`

	// Will only search within the given provider when set.
	SearchProviderName *string `json:"SearchProviderName,omitempty"`
}
