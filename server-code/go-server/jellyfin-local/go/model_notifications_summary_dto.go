/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// NotificationsSummaryDto - The notification summary DTO.
type NotificationsSummaryDto struct {

	MaxUnreadNotificationLevel NotificationLevel `json:"MaxUnreadNotificationLevel,omitempty"`

	// Gets or sets the number of unread notifications.
	UnreadCount int32 `json:"UnreadCount,omitempty"`
}

// AssertNotificationsSummaryDtoRequired checks if the required fields are not zero-ed
func AssertNotificationsSummaryDtoRequired(obj NotificationsSummaryDto) error {
	return nil
}

// AssertNotificationsSummaryDtoConstraints checks if the values respects the defined constraints
func AssertNotificationsSummaryDtoConstraints(obj NotificationsSummaryDto) error {
	return nil
}
