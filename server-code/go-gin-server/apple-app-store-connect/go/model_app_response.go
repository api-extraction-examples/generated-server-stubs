/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type AppResponse struct {

	Data App `json:"data"`

	Included []AppResponseIncludedInner `json:"included,omitempty"`

	Links DocumentLinks `json:"links"`
}
