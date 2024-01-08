/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// SetChannelMappingDto - Set channel mapping dto.
type SetChannelMappingDto struct {

	// Gets or sets the provider channel id.
	ProviderChannelId string `json:"ProviderChannelId"`

	// Gets or sets the provider id.
	ProviderId string `json:"ProviderId"`

	// Gets or sets the tuner channel id.
	TunerChannelId string `json:"TunerChannelId"`
}
