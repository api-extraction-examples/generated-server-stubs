/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"time"
)



type DeviceAttributes struct {

	AddedDate time.Time `json:"addedDate,omitempty"`

	DeviceClass string `json:"deviceClass,omitempty"`

	Model string `json:"model,omitempty"`

	Name string `json:"name,omitempty"`

	Platform BundleIdPlatform `json:"platform,omitempty"`

	Status string `json:"status,omitempty"`

	Udid string `json:"udid,omitempty"`
}

// AssertDeviceAttributesRequired checks if the required fields are not zero-ed
func AssertDeviceAttributesRequired(obj DeviceAttributes) error {
	return nil
}

// AssertDeviceAttributesConstraints checks if the values respects the defined constraints
func AssertDeviceAttributesConstraints(obj DeviceAttributes) error {
	return nil
}
