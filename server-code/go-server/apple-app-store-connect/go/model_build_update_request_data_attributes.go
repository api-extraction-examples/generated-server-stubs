/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BuildUpdateRequestDataAttributes struct {

	Expired bool `json:"expired,omitempty"`

	UsesNonExemptEncryption bool `json:"usesNonExemptEncryption,omitempty"`
}

// AssertBuildUpdateRequestDataAttributesRequired checks if the required fields are not zero-ed
func AssertBuildUpdateRequestDataAttributesRequired(obj BuildUpdateRequestDataAttributes) error {
	return nil
}

// AssertBuildUpdateRequestDataAttributesConstraints checks if the values respects the defined constraints
func AssertBuildUpdateRequestDataAttributesConstraints(obj BuildUpdateRequestDataAttributes) error {
	return nil
}
