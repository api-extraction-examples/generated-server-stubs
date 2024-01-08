/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type EndPointInfo struct {

	IsInNetwork bool `json:"IsInNetwork,omitempty"`

	IsLocal bool `json:"IsLocal,omitempty"`
}

// AssertEndPointInfoRequired checks if the required fields are not zero-ed
func AssertEndPointInfoRequired(obj EndPointInfo) error {
	return nil
}

// AssertEndPointInfoConstraints checks if the values respects the defined constraints
func AssertEndPointInfoConstraints(obj EndPointInfo) error {
	return nil
}