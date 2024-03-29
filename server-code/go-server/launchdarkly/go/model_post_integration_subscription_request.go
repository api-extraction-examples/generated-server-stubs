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




type PostIntegrationSubscriptionRequest struct {

	// Integration-specific configuration fields.
	Config map[string]interface{} `json:"config"`

	// A human-readable name for your subscription configuration.
	Name string `json:"name"`

	// Whether the integration subscription is active or not.
	True bool `json:"true,omitempty"`

	Statements []Statement `json:"statements,omitempty"`

	// Tags for the integration subscription.
	Tags []string `json:"tags,omitempty"`
}

// AssertPostIntegrationSubscriptionRequestRequired checks if the required fields are not zero-ed
func AssertPostIntegrationSubscriptionRequestRequired(obj PostIntegrationSubscriptionRequest) error {
	elements := map[string]interface{}{
		"config": obj.Config,
		"name": obj.Name,
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

// AssertPostIntegrationSubscriptionRequestConstraints checks if the values respects the defined constraints
func AssertPostIntegrationSubscriptionRequestConstraints(obj PostIntegrationSubscriptionRequest) error {
	return nil
}
