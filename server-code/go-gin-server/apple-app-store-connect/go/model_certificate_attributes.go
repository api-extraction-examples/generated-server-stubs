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

type CertificateAttributes struct {

	CertificateContent string `json:"certificateContent,omitempty"`

	CertificateType CertificateType `json:"certificateType,omitempty"`

	DisplayName string `json:"displayName,omitempty"`

	ExpirationDate time.Time `json:"expirationDate,omitempty"`

	Name string `json:"name,omitempty"`

	Platform BundleIdPlatform `json:"platform,omitempty"`

	SerialNumber string `json:"serialNumber,omitempty"`
}