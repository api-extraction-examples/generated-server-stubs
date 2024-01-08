/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppRelationshipsPreOrder struct {

	Data AppRelationshipsPreOrderData `json:"data,omitempty"`

	Links AppRelationshipsAppInfosLinks `json:"links,omitempty"`
}

// AssertAppRelationshipsPreOrderRequired checks if the required fields are not zero-ed
func AssertAppRelationshipsPreOrderRequired(obj AppRelationshipsPreOrder) error {
	if err := AssertAppRelationshipsPreOrderDataRequired(obj.Data); err != nil {
		return err
	}
	if err := AssertAppRelationshipsAppInfosLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertAppRelationshipsPreOrderConstraints checks if the values respects the defined constraints
func AssertAppRelationshipsPreOrderConstraints(obj AppRelationshipsPreOrder) error {
	return nil
}
