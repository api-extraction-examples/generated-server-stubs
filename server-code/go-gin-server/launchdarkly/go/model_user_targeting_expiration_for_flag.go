/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * API version: 5.3.0
 * Contact: support@launchdarkly.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type UserTargetingExpirationForFlag struct {

	Id string `json:"_id,omitempty"`

	Links Links `json:"_links,omitempty"`

	ResourceId UserTargetingExpirationResourceIdForFlag `json:"_resourceId,omitempty"`

	Version int32 `json:"_version,omitempty"`

	// Unix epoch time in milliseconds specifying the expiration date
	ExpirationDate int64 `json:"expirationDate,omitempty"`

	// Unique identifier for the user
	UserKey string `json:"userKey,omitempty"`

	// the ID of the variation that the user is targeted on a flag
	VariationId string `json:"variationId,omitempty"`
}