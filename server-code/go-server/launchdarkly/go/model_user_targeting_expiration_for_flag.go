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

// AssertUserTargetingExpirationForFlagRequired checks if the required fields are not zero-ed
func AssertUserTargetingExpirationForFlagRequired(obj UserTargetingExpirationForFlag) error {
	if err := AssertLinksRequired(obj.Links); err != nil {
		return err
	}
	if err := AssertUserTargetingExpirationResourceIdForFlagRequired(obj.ResourceId); err != nil {
		return err
	}
	return nil
}

// AssertUserTargetingExpirationForFlagConstraints checks if the values respects the defined constraints
func AssertUserTargetingExpirationForFlagConstraints(obj UserTargetingExpirationForFlag) error {
	return nil
}
