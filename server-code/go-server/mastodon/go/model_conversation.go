/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0
 * Contact: sardo@hey.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// Conversation - Represents a conversation with \"direct message\" visibility.
type Conversation struct {

	// Participants in the conversation.
	Accounts []Account `json:"accounts"`

	// Local database ID of the conversation. Cast from an integer, but not guaranteed to be a number
	Id string `json:"id"`

	LastStatus Status `json:"last_status,omitempty"`

	// Is the conversation currently marked as unread?
	Unread bool `json:"unread"`
}

// AssertConversationRequired checks if the required fields are not zero-ed
func AssertConversationRequired(obj Conversation) error {
	elements := map[string]interface{}{
		"accounts": obj.Accounts,
		"id": obj.Id,
		"unread": obj.Unread,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Accounts {
		if err := AssertAccountRequired(el); err != nil {
			return err
		}
	}
	if err := AssertStatusRequired(obj.LastStatus); err != nil {
		return err
	}
	return nil
}

// AssertConversationConstraints checks if the values respects the defined constraints
func AssertConversationConstraints(obj Conversation) error {
	return nil
}