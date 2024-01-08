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




// NotificationSchemeEventTypeId - The ID of an event that is being mapped to notifications.
type NotificationSchemeEventTypeId struct {

	// The ID of the notification scheme event.
	Id string `json:"id"`
}

// AssertNotificationSchemeEventTypeIdRequired checks if the required fields are not zero-ed
func AssertNotificationSchemeEventTypeIdRequired(obj NotificationSchemeEventTypeId) error {
	elements := map[string]interface{}{
		"id": obj.Id,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertNotificationSchemeEventTypeIdConstraints checks if the values respects the defined constraints
func AssertNotificationSchemeEventTypeIdConstraints(obj NotificationSchemeEventTypeId) error {
	return nil
}
