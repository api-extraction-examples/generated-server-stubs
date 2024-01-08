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

type LogFile struct {

	// Gets or sets the date created.
	DateCreated time.Time `json:"DateCreated,omitempty"`

	// Gets or sets the date modified.
	DateModified time.Time `json:"DateModified,omitempty"`

	// Gets or sets the name.
	Name *string `json:"Name,omitempty"`

	// Gets or sets the size.
	Size int64 `json:"Size,omitempty"`
}
