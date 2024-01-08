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

type CredentialEnumPushService string

// List of CredentialEnumPushService
const (
	GCM CredentialEnumPushService = "gcm"
	APN CredentialEnumPushService = "apn"
	FCM CredentialEnumPushService = "fcm"
)