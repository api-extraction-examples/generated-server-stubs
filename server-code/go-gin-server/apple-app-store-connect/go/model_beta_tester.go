/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type BetaTester struct {

	Attributes BetaTesterAttributes `json:"attributes,omitempty"`

	Id string `json:"id"`

	Links ResourceLinks `json:"links"`

	Relationships BetaTesterRelationships `json:"relationships,omitempty"`

	Type string `json:"type"`
}
