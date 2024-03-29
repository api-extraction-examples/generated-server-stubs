/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type GetWebhooks200Response struct {

	Data []WebhookResponse `json:"data,omitempty"`
}

// AssertGetWebhooks200ResponseRequired checks if the required fields are not zero-ed
func AssertGetWebhooks200ResponseRequired(obj GetWebhooks200Response) error {
	for _, el := range obj.Data {
		if err := AssertWebhookResponseRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertGetWebhooks200ResponseConstraints checks if the values respects the defined constraints
func AssertGetWebhooks200ResponseConstraints(obj GetWebhooks200Response) error {
	return nil
}
