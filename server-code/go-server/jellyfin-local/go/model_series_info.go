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



type SeriesInfo struct {

	IndexNumber *int32 `json:"IndexNumber,omitempty"`

	IsAutomated bool `json:"IsAutomated,omitempty"`

	// Gets or sets the metadata country code.
	MetadataCountryCode *string `json:"MetadataCountryCode,omitempty"`

	// Gets or sets the metadata language.
	MetadataLanguage *string `json:"MetadataLanguage,omitempty"`

	// Gets or sets the name.
	Name *string `json:"Name,omitempty"`

	ParentIndexNumber *int32 `json:"ParentIndexNumber,omitempty"`

	// Gets or sets the path.
	Path *string `json:"Path,omitempty"`

	PremiereDate *time.Time `json:"PremiereDate,omitempty"`

	// Gets or sets the provider ids.
	ProviderIds *map[string]string `json:"ProviderIds,omitempty"`

	// Gets or sets the year.
	Year *int32 `json:"Year,omitempty"`
}

// AssertSeriesInfoRequired checks if the required fields are not zero-ed
func AssertSeriesInfoRequired(obj SeriesInfo) error {
	return nil
}

// AssertSeriesInfoConstraints checks if the values respects the defined constraints
func AssertSeriesInfoConstraints(obj SeriesInfo) error {
	return nil
}
