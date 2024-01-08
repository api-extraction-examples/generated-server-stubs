/*
 * Lyft
 *
 * Drive your app to success with Lyft's API
 *
 * API version: 1.0.0
 * Contact: api-support@lyft.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// ErrorDetail - An object with a single key-value pair, where the key is the name of the invalid parameter, and the value is a description of the error. 
type ErrorDetail struct {

	// description of the error
	FieldName string `json:"field_name,omitempty"`
}
