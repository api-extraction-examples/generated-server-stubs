/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// AuditLogEventContext - The context from which this event originated.
type AuditLogEventContext struct {

	// The authentication method used in the context of an API request. Only present if the `context_type` is `api`. Can be one of `cookie`, `oauth`, `personal_access_token`, or `service_account`.
	ApiAuthenticationMethod string `json:"api_authentication_method,omitempty"`

	// The IP address of the client that initiated the event, if applicable.
	ClientIpAddress string `json:"client_ip_address,omitempty"`

	// The type of context. Can be one of `web`, `desktop`, `mobile`, `asana_support`, `asana`, `email`, or `api`.
	ContextType string `json:"context_type,omitempty"`

	// The name of the OAuth App that initiated the event. Only present if the `api_authentication_method` is `oauth`.
	OauthAppName string `json:"oauth_app_name,omitempty"`

	// The user agent of the client that initiated the event, if applicable.
	UserAgent string `json:"user_agent,omitempty"`
}
