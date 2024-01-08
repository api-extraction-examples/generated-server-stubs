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

// EventNotification - Details about a notification associated with an event.
type EventNotification struct {

	// The email address.
	EmailAddress string `json:"emailAddress,omitempty"`

	// Expand options that include additional event notification details in the response.
	Expand string `json:"expand,omitempty"`

	Field FieldDetails `json:"field,omitempty"`

	Group GroupName `json:"group,omitempty"`

	// The ID of the notification.
	Id int64 `json:"id,omitempty"`

	// Identifies the recipients of the notification.
	NotificationType string `json:"notificationType,omitempty"`

	// As a group's name can change, use of `recipient` is recommended. The identifier associated with the `notificationType` value that defines the receiver of the notification, where the receiver isn't implied by `notificationType` value. So, when `notificationType` is:   *  `User` The `parameter` is the user account ID.  *  `Group` The `parameter` is the group name.  *  `ProjectRole` The `parameter` is the project role ID.  *  `UserCustomField` The `parameter` is the ID of the custom field.  *  `GroupCustomField` The `parameter` is the ID of the custom field.
	Parameter string `json:"parameter,omitempty"`

	ProjectRole ProjectRole `json:"projectRole,omitempty"`

	// The identifier associated with the `notificationType` value that defines the receiver of the notification, where the receiver isn't implied by the `notificationType` value. So, when `notificationType` is:   *  `User`, `recipient` is the user account ID.  *  `Group`, `recipient` is the group ID.  *  `ProjectRole`, `recipient` is the project role ID.  *  `UserCustomField`, `recipient` is the ID of the custom field.  *  `GroupCustomField`, `recipient` is the ID of the custom field.
	Recipient string `json:"recipient,omitempty"`

	User UserDetails `json:"user,omitempty"`
}
