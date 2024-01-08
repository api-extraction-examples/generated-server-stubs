/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type WebhookCompact struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// If true, the webhook will send events - if false it is considered inactive and will not generate events.
	Active bool `json:"active,omitempty"`

	Resource AsanaNamedResource `json:"resource,omitempty"`

	// The URL to receive the HTTP POST.
	Target string `json:"target,omitempty"`
}

// AssertWebhookCompactRequired checks if the required fields are not zero-ed
func AssertWebhookCompactRequired(obj WebhookCompact) error {
	if err := AssertAsanaNamedResourceRequired(obj.Resource); err != nil {
		return err
	}
	return nil
}

// AssertWebhookCompactConstraints checks if the values respects the defined constraints
func AssertWebhookCompactConstraints(obj WebhookCompact) error {
	return nil
}
