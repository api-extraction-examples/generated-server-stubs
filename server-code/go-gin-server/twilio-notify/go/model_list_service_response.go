/*
 * Twilio - Notify
 *
 * This is the public Twilio REST API.
 *
 * API version: 1.52.0
 * Contact: support@twilio.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type ListServiceResponse struct {

	Meta ListCredentialResponseMeta `json:"meta,omitempty"`

	Services []NotifyV1Service `json:"services,omitempty"`
}
