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




type PostWebhookRequest struct {

	// The name of the webhook.
	Name string `json:"name,omitempty"`

	// Whether this webhook is enabled or not.
	True bool `json:"true,omitempty"`

	// If sign is true, and the secret attribute is omitted, LaunchDarkly will automatically generate a secret for you.
	Secret string `json:"secret,omitempty"`

	// If sign is false, the webhook will not include a signature header, and the secret can be omitted.
	Sign bool `json:"sign"`

	Statements []Statement `json:"statements,omitempty"`

	// Tags for the webhook.
	Tags []string `json:"tags,omitempty"`

	// The URL of the remote webhook.
	Url string `json:"url"`
}

// AssertPostWebhookRequestRequired checks if the required fields are not zero-ed
func AssertPostWebhookRequestRequired(obj PostWebhookRequest) error {
	elements := map[string]interface{}{
		"sign": obj.Sign,
		"url": obj.Url,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Statements {
		if err := AssertStatementRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertPostWebhookRequestConstraints checks if the values respects the defined constraints
func AssertPostWebhookRequestConstraints(obj PostWebhookRequest) error {
	return nil
}
