/*
 * CircleCI REST API
 *
 * The CircleCI API is a RESTful, fully-featured API that allows you to do almost anything in CircleCI. You can access all information and trigger all actions. The only thing we don’t provide access to is billing functions, which must be done from the CircleCI web UI. 
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type Scope string

// List of Scope
const (
	WRITE_SETTINGS Scope = "write-settings"
	VIEW_BUILDS Scope = "view-builds"
	READ_SETTINGS Scope = "read-settings"
	TRIGGER_BUILDS Scope = "trigger-builds"
	ALL Scope = "all"
	STATUS Scope = "status"
	NONE Scope = "none"
)