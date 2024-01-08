/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type ProfileCreateRequestDataRelationships struct {

	BundleId BundleIdCapabilityCreateRequestDataRelationshipsBundleId `json:"bundleId"`

	Certificates ProfileCreateRequestDataRelationshipsCertificates `json:"certificates"`

	Devices ProfileCreateRequestDataRelationshipsDevices `json:"devices,omitempty"`
}
