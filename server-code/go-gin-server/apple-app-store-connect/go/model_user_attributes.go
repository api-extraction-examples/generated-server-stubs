/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type UserAttributes struct {

	AllAppsVisible bool `json:"allAppsVisible,omitempty"`

	FirstName string `json:"firstName,omitempty"`

	LastName string `json:"lastName,omitempty"`

	ProvisioningAllowed bool `json:"provisioningAllowed,omitempty"`

	Roles []UserRole `json:"roles,omitempty"`

	Username string `json:"username,omitempty"`
}
