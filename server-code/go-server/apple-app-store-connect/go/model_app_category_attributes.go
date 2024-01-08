/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppCategoryAttributes struct {

	Platforms []Platform `json:"platforms,omitempty"`
}

// AssertAppCategoryAttributesRequired checks if the required fields are not zero-ed
func AssertAppCategoryAttributesRequired(obj AppCategoryAttributes) error {
	return nil
}

// AssertAppCategoryAttributesConstraints checks if the values respects the defined constraints
func AssertAppCategoryAttributesConstraints(obj AppCategoryAttributes) error {
	return nil
}
