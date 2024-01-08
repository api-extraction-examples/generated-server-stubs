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


import (
	"time"
)



// Changelog - A log of changes made to issue fields. Changelogs related to workflow associations are currently being deprecated.
type Changelog struct {

	Author ChangelogAuthor `json:"author,omitempty"`

	// The date on which the change took place.
	Created time.Time `json:"created,omitempty"`

	HistoryMetadata ChangelogHistoryMetadata `json:"historyMetadata,omitempty"`

	// The ID of the changelog.
	Id string `json:"id,omitempty"`

	// The list of items changed.
	Items []ChangeDetails `json:"items,omitempty"`
}

// AssertChangelogRequired checks if the required fields are not zero-ed
func AssertChangelogRequired(obj Changelog) error {
	if err := AssertChangelogAuthorRequired(obj.Author); err != nil {
		return err
	}
	if err := AssertChangelogHistoryMetadataRequired(obj.HistoryMetadata); err != nil {
		return err
	}
	for _, el := range obj.Items {
		if err := AssertChangeDetailsRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertChangelogConstraints checks if the values respects the defined constraints
func AssertChangelogConstraints(obj Changelog) error {
	return nil
}