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

type AttachmentArchive struct {

	Entries []AttachmentArchiveEntry `json:"entries,omitempty"`

	MoreAvailable bool `json:"moreAvailable,omitempty"`

	TotalEntryCount int32 `json:"totalEntryCount,omitempty"`

	TotalNumberOfEntriesAvailable int32 `json:"totalNumberOfEntriesAvailable,omitempty"`
}
