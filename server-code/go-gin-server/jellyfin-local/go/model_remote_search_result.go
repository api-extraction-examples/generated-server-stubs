/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"time"
)

type RemoteSearchResult struct {

	AlbumArtist RemoteSearchResult `json:"AlbumArtist,omitempty"`

	Artists *[]RemoteSearchResult `json:"Artists,omitempty"`

	ImageUrl *string `json:"ImageUrl,omitempty"`

	IndexNumber *int32 `json:"IndexNumber,omitempty"`

	IndexNumberEnd *int32 `json:"IndexNumberEnd,omitempty"`

	// Gets or sets the name.
	Name *string `json:"Name,omitempty"`

	Overview *string `json:"Overview,omitempty"`

	ParentIndexNumber *int32 `json:"ParentIndexNumber,omitempty"`

	PremiereDate *time.Time `json:"PremiereDate,omitempty"`

	// Gets or sets the year.
	ProductionYear *int32 `json:"ProductionYear,omitempty"`

	// Gets or sets the provider ids.
	ProviderIds *map[string]string `json:"ProviderIds,omitempty"`

	SearchProviderName *string `json:"SearchProviderName,omitempty"`
}
