/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type DevicesResponse struct {

	Data []Device `json:"data"`

	Links PagedDocumentLinks `json:"links"`

	Meta PagingInformation `json:"meta,omitempty"`
}
