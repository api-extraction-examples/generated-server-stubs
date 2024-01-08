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




// FoundUsersAndGroups - List of users and groups found in a search.
type FoundUsersAndGroups struct {

	Groups FoundGroups `json:"groups,omitempty"`

	Users FoundUsers `json:"users,omitempty"`
}

// AssertFoundUsersAndGroupsRequired checks if the required fields are not zero-ed
func AssertFoundUsersAndGroupsRequired(obj FoundUsersAndGroups) error {
	if err := AssertFoundGroupsRequired(obj.Groups); err != nil {
		return err
	}
	if err := AssertFoundUsersRequired(obj.Users); err != nil {
		return err
	}
	return nil
}

// AssertFoundUsersAndGroupsConstraints checks if the values respects the defined constraints
func AssertFoundUsersAndGroupsConstraints(obj FoundUsersAndGroups) error {
	return nil
}