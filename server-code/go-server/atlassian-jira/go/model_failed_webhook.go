/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// FailedWebhook - Details about a failed webhook.
type FailedWebhook struct {

	// The webhook body.
	Body string `json:"body,omitempty"`

	// The time the webhook was added to the list of failed webhooks (that is, the time of the last failed retry).
	FailureTime int64 `json:"failureTime"`

	// The webhook ID, as sent in the `X-Atlassian-Webhook-Identifier` header with the webhook.
	Id string `json:"id"`

	// The original webhook destination.
	Url string `json:"url"`
}

// AssertFailedWebhookRequired checks if the required fields are not zero-ed
func AssertFailedWebhookRequired(obj FailedWebhook) error {
	elements := map[string]interface{}{
		"failureTime": obj.FailureTime,
		"id": obj.Id,
		"url": obj.Url,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertFailedWebhookConstraints checks if the values respects the defined constraints
func AssertFailedWebhookConstraints(obj FailedWebhook) error {
	return nil
}