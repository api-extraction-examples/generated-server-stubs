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

type AmendmentDecision string

// List of AmendmentDecision
const (
	NO_DECISION AmendmentDecision = "NoDecision"
	WITHDRAWN AmendmentDecision = "Withdrawn"
	DISAGREED AmendmentDecision = "Disagreed"
	NOT_MOVED AmendmentDecision = "NotMoved"
	AGREED AmendmentDecision = "Agreed"
)