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




type ApiV1PushSubscriptionPostRequest struct {

	Data string `json:"data"`

	Subscription string `json:"subscription"`
}

// AssertApiV1PushSubscriptionPostRequestRequired checks if the required fields are not zero-ed
func AssertApiV1PushSubscriptionPostRequestRequired(obj ApiV1PushSubscriptionPostRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
		"subscription": obj.Subscription,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertApiV1PushSubscriptionPostRequestConstraints checks if the values respects the defined constraints
func AssertApiV1PushSubscriptionPostRequestConstraints(obj ApiV1PushSubscriptionPostRequest) error {
	return nil
}
