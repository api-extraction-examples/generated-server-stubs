/*
 * Reimbursements API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type HealthStatus struct {

	// Service response time
	Duration string `json:"Duration,omitempty"`

	// Service Name
	Error string `json:"Error,omitempty"`

	// Service is healthy?
	Healthy bool `json:"Healthy,omitempty"`

	// Service Name
	Name string `json:"Name,omitempty"`

	// Service's server time
	TimeStamp string `json:"TimeStamp,omitempty"`
}

// AssertHealthStatusRequired checks if the required fields are not zero-ed
func AssertHealthStatusRequired(obj HealthStatus) error {
	return nil
}

// AssertHealthStatusConstraints checks if the values respects the defined constraints
func AssertHealthStatusConstraints(obj HealthStatus) error {
	return nil
}
