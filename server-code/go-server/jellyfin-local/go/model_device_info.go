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



type DeviceInfo struct {

	// Gets or sets the name of the application.
	AppName *string `json:"AppName,omitempty"`

	// Gets or sets the application version.
	AppVersion *string `json:"AppVersion,omitempty"`

	Capabilities ClientCapabilities `json:"Capabilities,omitempty"`

	// Gets or sets the date last modified.
	DateLastActivity time.Time `json:"DateLastActivity,omitempty"`

	IconUrl *string `json:"IconUrl,omitempty"`

	// Gets or sets the identifier.
	Id *string `json:"Id,omitempty"`

	// Gets or sets the last user identifier.
	LastUserId string `json:"LastUserId,omitempty"`

	// Gets or sets the last name of the user.
	LastUserName *string `json:"LastUserName,omitempty"`

	Name *string `json:"Name,omitempty"`
}

// AssertDeviceInfoRequired checks if the required fields are not zero-ed
func AssertDeviceInfoRequired(obj DeviceInfo) error {
	if err := AssertClientCapabilitiesRequired(obj.Capabilities); err != nil {
		return err
	}
	return nil
}

// AssertDeviceInfoConstraints checks if the values respects the defined constraints
func AssertDeviceInfoConstraints(obj DeviceInfo) error {
	return nil
}
