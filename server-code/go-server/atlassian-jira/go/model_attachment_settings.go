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




// AttachmentSettings - Details of the instance's attachment settings.
type AttachmentSettings struct {

	// Whether the ability to add attachments is enabled.
	Enabled bool `json:"enabled,omitempty"`

	// The maximum size of attachments permitted, in bytes.
	UploadLimit int64 `json:"uploadLimit,omitempty"`
}

// AssertAttachmentSettingsRequired checks if the required fields are not zero-ed
func AssertAttachmentSettingsRequired(obj AttachmentSettings) error {
	return nil
}

// AssertAttachmentSettingsConstraints checks if the values respects the defined constraints
func AssertAttachmentSettingsConstraints(obj AttachmentSettings) error {
	return nil
}