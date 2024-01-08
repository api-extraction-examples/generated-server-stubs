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

// UserDto - Class UserDto.
type UserDto struct {

	Configuration UserConfiguration `json:"Configuration,omitempty"`

	// Gets or sets whether async login is enabled or not.
	EnableAutoLogin *bool `json:"EnableAutoLogin,omitempty"`

	// Gets or sets a value indicating whether this instance has configured easy password.
	HasConfiguredEasyPassword bool `json:"HasConfiguredEasyPassword,omitempty"`

	// Gets or sets a value indicating whether this instance has configured password.
	HasConfiguredPassword bool `json:"HasConfiguredPassword,omitempty"`

	// Gets or sets a value indicating whether this instance has password.
	HasPassword bool `json:"HasPassword,omitempty"`

	// Gets or sets the id.
	Id string `json:"Id,omitempty"`

	// Gets or sets the last activity date.
	LastActivityDate *time.Time `json:"LastActivityDate,omitempty"`

	// Gets or sets the last login date.
	LastLoginDate *time.Time `json:"LastLoginDate,omitempty"`

	// Gets or sets the name.
	Name *string `json:"Name,omitempty"`

	Policy UserPolicy `json:"Policy,omitempty"`

	// Gets or sets the primary image aspect ratio.
	PrimaryImageAspectRatio *float64 `json:"PrimaryImageAspectRatio,omitempty"`

	// Gets or sets the primary image tag.
	PrimaryImageTag *string `json:"PrimaryImageTag,omitempty"`

	// Gets or sets the server identifier.
	ServerId *string `json:"ServerId,omitempty"`

	// Gets or sets the name of the server.  This is not used by the server and is for client-side usage only.
	ServerName *string `json:"ServerName,omitempty"`
}
