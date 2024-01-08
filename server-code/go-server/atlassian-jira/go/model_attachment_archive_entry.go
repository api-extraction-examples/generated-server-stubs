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




type AttachmentArchiveEntry struct {

	AbbreviatedName string `json:"abbreviatedName,omitempty"`

	EntryIndex int64 `json:"entryIndex,omitempty"`

	MediaType string `json:"mediaType,omitempty"`

	Name string `json:"name,omitempty"`

	Size int64 `json:"size,omitempty"`
}

// AssertAttachmentArchiveEntryRequired checks if the required fields are not zero-ed
func AssertAttachmentArchiveEntryRequired(obj AttachmentArchiveEntry) error {
	return nil
}

// AssertAttachmentArchiveEntryConstraints checks if the values respects the defined constraints
func AssertAttachmentArchiveEntryConstraints(obj AttachmentArchiveEntry) error {
	return nil
}
