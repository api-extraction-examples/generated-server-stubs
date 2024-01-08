/*
 * Bills API
 *
 * API to get and search for information regarding Bills, their stages, associated amendments and publications.
 *
 * API version: v1
 * Contact: softwareengineering@parliament.uk
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type AmendmentType string

// List of AmendmentType
const (
	EDIT_LONG_TITLE AmendmentType = "EditLongTitle"
	EDIT_BILL_BODY AmendmentType = "EditBillBody"
	ADD_CLAUSE_OR_SCHEDULE AmendmentType = "AddClauseOrSchedule"
	DELETE_CLAUSE_OR_SCHEDULE AmendmentType = "DeleteClauseOrSchedule"
)
