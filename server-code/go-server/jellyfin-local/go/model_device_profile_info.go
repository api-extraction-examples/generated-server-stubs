/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type DeviceProfileInfo struct {

	// Gets or sets the identifier.
	Id *string `json:"Id,omitempty"`

	// Gets or sets the name.
	Name *string `json:"Name,omitempty"`

	Type DeviceProfileType `json:"Type,omitempty"`
}

// AssertDeviceProfileInfoRequired checks if the required fields are not zero-ed
func AssertDeviceProfileInfoRequired(obj DeviceProfileInfo) error {
	return nil
}

// AssertDeviceProfileInfoConstraints checks if the values respects the defined constraints
func AssertDeviceProfileInfoConstraints(obj DeviceProfileInfo) error {
	return nil
}