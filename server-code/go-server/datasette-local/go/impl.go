/*
 * Datasette API
 *
 * Execute SQL queries against a Datasette database and return the results as JSON
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// ImplResponse defines an implementation response with error code and the associated body
type ImplResponse struct {
	Code int
	Body interface{}
}
