/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type BundleIdRelationshipsBundleIdCapabilities struct {

	Data []BundleIdRelationshipsBundleIdCapabilitiesDataInner `json:"data,omitempty"`

	Links AppRelationshipsAppInfosLinks `json:"links,omitempty"`

	Meta PagingInformation `json:"meta,omitempty"`
}