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




// IssueCreateMetadata - The wrapper for the issue creation metadata for a list of projects.
type IssueCreateMetadata struct {

	// Expand options that include additional project details in the response.
	Expand string `json:"expand,omitempty"`

	// List of projects and their issue creation metadata.
	Projects []ProjectIssueCreateMetadata `json:"projects,omitempty"`
}

// AssertIssueCreateMetadataRequired checks if the required fields are not zero-ed
func AssertIssueCreateMetadataRequired(obj IssueCreateMetadata) error {
	for _, el := range obj.Projects {
		if err := AssertProjectIssueCreateMetadataRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertIssueCreateMetadataConstraints checks if the values respects the defined constraints
func AssertIssueCreateMetadataConstraints(obj IssueCreateMetadata) error {
	return nil
}
