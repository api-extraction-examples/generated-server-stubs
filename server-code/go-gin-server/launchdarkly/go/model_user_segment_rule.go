/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * API version: 5.3.0
 * Contact: support@launchdarkly.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type UserSegmentRule struct {

	BucketBy string `json:"bucketBy,omitempty"`

	Clauses []Clause `json:"clauses,omitempty"`

	Weight int32 `json:"weight,omitempty"`
}
