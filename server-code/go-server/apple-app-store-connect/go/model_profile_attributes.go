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



type ProfileAttributes struct {

	CreatedDate time.Time `json:"createdDate,omitempty"`

	ExpirationDate time.Time `json:"expirationDate,omitempty"`

	Name string `json:"name,omitempty"`

	Platform BundleIdPlatform `json:"platform,omitempty"`

	ProfileContent string `json:"profileContent,omitempty"`

	ProfileState string `json:"profileState,omitempty"`

	ProfileType string `json:"profileType,omitempty"`

	Uuid string `json:"uuid,omitempty"`
}

// AssertProfileAttributesRequired checks if the required fields are not zero-ed
func AssertProfileAttributesRequired(obj ProfileAttributes) error {
	return nil
}

// AssertProfileAttributesConstraints checks if the values respects the defined constraints
func AssertProfileAttributesConstraints(obj ProfileAttributes) error {
	return nil
}
