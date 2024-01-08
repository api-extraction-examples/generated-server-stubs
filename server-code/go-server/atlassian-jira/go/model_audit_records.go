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




// AuditRecords - Container for a list of audit records.
type AuditRecords struct {

	// The requested or default limit on the number of audit items to be returned.
	Limit int32 `json:"limit,omitempty"`

	// The number of audit items skipped before the first item in this list.
	Offset int32 `json:"offset,omitempty"`

	// The list of audit items.
	Records []AuditRecordBean `json:"records,omitempty"`

	// The total number of audit items returned.
	Total int64 `json:"total,omitempty"`
}

// AssertAuditRecordsRequired checks if the required fields are not zero-ed
func AssertAuditRecordsRequired(obj AuditRecords) error {
	for _, el := range obj.Records {
		if err := AssertAuditRecordBeanRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertAuditRecordsConstraints checks if the values respects the defined constraints
func AssertAuditRecordsConstraints(obj AuditRecords) error {
	return nil
}
