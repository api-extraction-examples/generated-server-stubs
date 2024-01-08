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

type DestinationAmazonKinesis struct {

	Region string `json:"region,omitempty"`

	RoleArn string `json:"roleArn,omitempty"`

	StreamName string `json:"streamName,omitempty"`
}