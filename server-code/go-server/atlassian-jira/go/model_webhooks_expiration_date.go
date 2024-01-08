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




// WebhooksExpirationDate - The date the refreshed webhooks expire.
type WebhooksExpirationDate struct {

	// The expiration date of all the refreshed webhooks.
	ExpirationDate int64 `json:"expirationDate"`
}

// AssertWebhooksExpirationDateRequired checks if the required fields are not zero-ed
func AssertWebhooksExpirationDateRequired(obj WebhooksExpirationDate) error {
	elements := map[string]interface{}{
		"expirationDate": obj.ExpirationDate,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertWebhooksExpirationDateConstraints checks if the values respects the defined constraints
func AssertWebhooksExpirationDateConstraints(obj WebhooksExpirationDate) error {
	return nil
}
