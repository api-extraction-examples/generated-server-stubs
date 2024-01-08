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




// NotificationSchemeEventDetails - Details of a notification scheme event.
type NotificationSchemeEventDetails struct {

	Event NotificationSchemeEventTypeId `json:"event"`

	// The list of notifications mapped to a specified event.
	Notifications []NotificationSchemeNotificationDetails `json:"notifications"`
}

// AssertNotificationSchemeEventDetailsRequired checks if the required fields are not zero-ed
func AssertNotificationSchemeEventDetailsRequired(obj NotificationSchemeEventDetails) error {
	elements := map[string]interface{}{
		"event": obj.Event,
		"notifications": obj.Notifications,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertNotificationSchemeEventDetailsConstraints checks if the values respects the defined constraints
func AssertNotificationSchemeEventDetailsConstraints(obj NotificationSchemeEventDetails) error {
	return nil
}