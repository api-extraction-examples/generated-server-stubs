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




// CreateNotificationSchemeDetails - Details of an notification scheme.
type CreateNotificationSchemeDetails struct {

	// The description of the notification scheme.
	Description string `json:"description,omitempty"`

	// The name of the notification scheme. Must be unique (case-insensitive).
	Name string `json:"name"`

	// The list of notifications which should be added to the notification scheme.
	NotificationSchemeEvents []NotificationSchemeEventDetails `json:"notificationSchemeEvents,omitempty"`
}

// AssertCreateNotificationSchemeDetailsRequired checks if the required fields are not zero-ed
func AssertCreateNotificationSchemeDetailsRequired(obj CreateNotificationSchemeDetails) error {
	elements := map[string]interface{}{
		"name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertCreateNotificationSchemeDetailsConstraints checks if the values respects the defined constraints
func AssertCreateNotificationSchemeDetailsConstraints(obj CreateNotificationSchemeDetails) error {
	return nil
}