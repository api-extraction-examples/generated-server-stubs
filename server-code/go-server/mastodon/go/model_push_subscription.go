/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0
 * Contact: sardo@hey.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// PushSubscription - Represents a subscription to the push streaming server.
type PushSubscription struct {

	// Which alerts should be delivered to the `endpoint`.
	Alerts map[string]interface{} `json:"alerts"`

	// Where push alerts will be sent to.
	Endpoint string `json:"endpoint"`

	// The ID of the push subscription in the database. Cast from an integer, but not guaranteed to be a number.
	Id string `json:"id"`

	// The streaming server's VAPID key.
	ServerKey string `json:"server_key"`
}

// AssertPushSubscriptionRequired checks if the required fields are not zero-ed
func AssertPushSubscriptionRequired(obj PushSubscription) error {
	elements := map[string]interface{}{
		"alerts": obj.Alerts,
		"endpoint": obj.Endpoint,
		"id": obj.Id,
		"server_key": obj.ServerKey,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPushSubscriptionConstraints checks if the values respects the defined constraints
func AssertPushSubscriptionConstraints(obj PushSubscription) error {
	return nil
}