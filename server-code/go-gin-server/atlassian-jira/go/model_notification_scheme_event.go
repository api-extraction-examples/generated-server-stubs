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

// NotificationSchemeEvent - Details about a notification scheme event.
type NotificationSchemeEvent struct {

	Event NotificationEvent `json:"event,omitempty"`

	Notifications []EventNotification `json:"notifications,omitempty"`
}
