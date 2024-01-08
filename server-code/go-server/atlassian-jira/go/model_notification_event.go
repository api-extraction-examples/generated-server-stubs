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




// NotificationEvent - Details about a notification event.
type NotificationEvent struct {

	// The description of the event.
	Description string `json:"description,omitempty"`

	// The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).
	Id int64 `json:"id,omitempty"`

	// The name of the event.
	Name string `json:"name,omitempty"`

	TemplateEvent NotificationEvent `json:"templateEvent,omitempty"`
}

// AssertNotificationEventRequired checks if the required fields are not zero-ed
func AssertNotificationEventRequired(obj NotificationEvent) error {
	if err := AssertNotificationEventRequired(obj.TemplateEvent); err != nil {
		return err
	}
	return nil
}

// AssertNotificationEventConstraints checks if the values respects the defined constraints
func AssertNotificationEventConstraints(obj NotificationEvent) error {
	return nil
}
