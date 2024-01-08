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




// JqlPersonalDataMigrationRequest - The JQL queries to be converted.
type JqlPersonalDataMigrationRequest struct {

	// A list of queries with user identifiers. Maximum of 100 queries.
	QueryStrings []string `json:"queryStrings,omitempty"`
}

// AssertJqlPersonalDataMigrationRequestRequired checks if the required fields are not zero-ed
func AssertJqlPersonalDataMigrationRequestRequired(obj JqlPersonalDataMigrationRequest) error {
	return nil
}

// AssertJqlPersonalDataMigrationRequestConstraints checks if the values respects the defined constraints
func AssertJqlPersonalDataMigrationRequestConstraints(obj JqlPersonalDataMigrationRequest) error {
	return nil
}
